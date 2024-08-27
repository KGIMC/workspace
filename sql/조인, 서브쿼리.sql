-- 서브쿼리 : 하나의 쿼리 안에 또 다른 쿼리가 존재하는 문법
-- 서브쿼리는 반드시 () 안에 작성한다.

-- 사원 이름이 김사랑인 사원이 소속된 부서명을 조회
SELECT * FROM emp;
SELECT * FROM dept;

SELECT ENAME
FROM dept, EMP
WHERE dept.DEPTNO = emp.DEPTNO
AND ENAME = '김사랑'

-- 사원 이름이 김사랑인 사원이 소속된 부서명을 조회
SELECT * FROM emp; -- 김사랑 사원은 부서번호가 20번이다.
SELECT * FROM dept; -- 부서번호가 20번인 부서명이 인사부임을 알 수 있다.

SELECT dname
FROM dept
WHERE deptno = 20; -- 인사부

SELECT dname
FROM dept
WHERE deptno = (SELECT deptno
FROM emp
WHERE ename = '김사랑');

-- 모든 사원의 평균 급여보다 더 많은 급여를 받는 사원의 사번, 이름, 급여를 조회

SELECT empno, ename, sal
FROM emp
WHERE sal > (SELECT AVG(sal) + 100
FROM emp);


-- 인사부에 소속된 직원 중 하반기에 입사한 사원들의 사번, 이름, 입사일을 조회
-- 입사일은 '2024년 01월 01일' 형태로 조회
-- 하반기 7월부터 12월 중 입사한 사원

SELECT HIREDATE
 			, MONTH(HIREDATE)
 			, YEAR(HIREDATE)
 			, DATA(HIREDATE)
FROM emp;

SELECT empno, ename, DATE_FORMAT(HIREDATE, '%Y년 %m월 %d일') AS HIREDATE
FROM emp
WHERE deptno = (SELECT deptno
					 FROM dept
					 WHERE dname = '인사부')
AND MONTH(HIREDATE) >= 7;

-- 사번, 사원명, 부서번호, 부서명 조회
-- empno, ename, detpno, dname

SELECT empno
, ename
, deptno
, (SELECT DNAME FROM dept WHERE deptno = emp.deptno )
FROM emp;

SELECT * FROM board;
SELECT * FROM board_member;

-- 글 번호가 10번 이하인 게시글의 글 번호, 제목
-- 작성자 ID, 작성자 이름, 작성자 권한을 조회
-- board_NUM, TITLE, MEM_ID, MEM_NAME


-- 1. 조인
SELECT board_num, title, b.mem_id, mem_name
FROM board b, board_member m
WHERE b.MEM_ID = m.mem_id
AND board_num <= 40;

-- 2. 서브쿼리

SELECT board_num
, title
, mem_id
, (SELECT mem_name FROM board_member WHERE mem_id = board.MEM_ID) AS MEM_NAME
, (SELECT mem_role FROM board_member WHERE mem_id = board.mem_id) AS MEM_ROLE
FROM board
WHERE board_num < 40;


