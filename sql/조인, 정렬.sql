-- 여러 테이블의 내용 동시에 조회하는 방법

SELECT * FROM emp;
SELECT * FROM dept;

-- 사원번호, 사원명, 부서명 조회
-- JOIN 문법
-- 조회할 것들 - SELEC 안에
-- 조회할 테이블 - FROM
-- 조회할 조건 -- WHERE인데 조건 앞에 조회할 테이블명

SELECT empno, ename, dname
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO;


-- 조인 조건 설정 확실히 할 것 ex) WHERE emp.DEPTNO = dept.DEPTNO;
SELECT EMPNO, emp.ENAME, dept.DNAME, emp.DEPTNO
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO;


-- 조인 + 명칭
SELECT empno AS 사번
     , ename AS 사원명
     , 사원.sal
FROM emp 사원; 

-- 사원번호, 사원명, 직급, 부서번호, 부서명, 지역 조회
-- where에 추가조건은 and
SELECT empno, ename, job, dname, loc, E.deptno, D.DEPTNO
FROM emp E, dept D
WHERE E.deptno = D.deptno AND job ='사원';

-- 데이터를 정렬하여 조회하기(?)
-- 사번, 사원명, 급여를 조회, 급여 기준 정렬

-- 오름차순 -> 낮은순부터 높은순으로
-- 내림차순 -> 높은순에서 낮은순으로

-- 오름차순 - asc - 생략 가능
-- 내림차순 - desc
SELECT empno, ename, sal
FROM emp
ORDER BY sal;

-- 부서번호가 30번 아닌 사원들의
-- 사원명, 부서번호를 조회하되, 사원명 기준 내림차순으로 정렬

SELECT ename, deptno
FROM emp 
WHERE deptno != 30
ORDER BY ename DESC;


-- 부서명이 인사부가 아니면서 급여가 300 이상인 사원들의
-- 사번, 사원명, 부서번호, 부서명, 급여를 조회하되
-- 부서번호 기준 오름차순으로 정렬

SELECT empno, ename, e.deptno, sal, dname
FROM emp e, dept d
WHERE e.deptno = d.deptno
AND dname != '인사부'
AND sal >= 300
ORDER BY deptno;


SELECT empno, ename, job, sal
FROM emp
ORDER by job, sal;