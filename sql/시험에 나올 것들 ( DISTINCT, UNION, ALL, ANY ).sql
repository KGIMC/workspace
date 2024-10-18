SELECT * FROM emp;
SELECT * FROM dept;

-- DISTINCT : 중복제거
SELECT DISTINCT deptno FROM emp;


-- 이 쿼리 실행 결과 예측
-- 모든 컬럼 앞에 DISTINCT가 붙으면 나열한 모든 컬럼에 대해 중복 제거
-- 모든 컬럼의 값이 중복인 데이터만 제거
SELECT deptno, job FROM emp; -- 14
SELECT DISTINCT deptno, job FROM emp; -- 11

-- UNION ALL, UNION : 두 개 이상의 SELECT를 동시에 진행
-- 각각의 조회문의 컬럼명은 달라도 쿼리 실행에 영향 X
-- 조회하는 컬럼의 갯수가 다르면 조회 불가능 ( 각각의 컬럼의 수가 같아야함 )
-- UNION ALL : 각 쿼리의 실행 결과 - 조회되는 데이터가 중복이더라도 조회
-- UNION : 각 쿼리의 실행 결과 - 중복 조회되는 데이터는 하나만 조회
SELECT EMPNO, ENAME, SAL, JOB FROM emp WHERE JOB = '사원'
UNION ALL
SELECT EMPNO, ENAME, SAL, JOB FROM emp WHERE JOB = '과장';


SELECT EMPNO, ENAME, JOB FROM emp WHERE JOB = '사원'
UNION ALL
SELECT DEPTNO, ENAME, JOB FROM emp WHERE JOB = '과장';


SELECT EMPNO, ENAME, JOB FROM emp WHERE JOB = '사원'
UNION
SELECT EMPNO, ENAME, JOB FROM emp WHERE JOB = '사원';

-- 모든 사원의 급여의 평균보다 급여가 높은 사원의 사번, 이름, 급여 조회
-- EMPNO, ENAME, SAL -- 서브쿼리
-- 서브쿼리는 안에 있는 쿼리부터 조회
-- WHERE 절에 서브쿼리가 있고
-- WHERE 절에 비교 연산이 =, >, < 같이 크기비교 연산이라면
-- 서브쿼리의 조회 결과 행은 반드시 하나여야 함.
SELECT EMPNO, ENAME, SAL
FROM emp
WHERE SAL = (SELECT AVG(SAL) FROM emp);

-- 만약 WHERE 절에 서브쿼리의 질의 결과 여러 행의 데이터가
-- 조회되면 IN 사용
SELECT empno, ename, sal
FROM emp
WHERE sal IN (SELECT sal FROM emp
					WHERE sal > 500);
			

SELECT empno, ename, sal
FROM emp
WHERE sal IN (500, 600, 700);


-- WHERE 절의 서브쿼리 실행 결과 데이터가 여러행 조회되면
-- IN 연산자 대신 ALL, ANY 키워드를 사용할 수도 있다.
-- ALL : 서브쿼리 질의 결과 조회되는 모든 데이터가
-- 전부 조건에 만족하는 결과만 조회
-- ALL은 서브쿼리의 컬럼에 MAX() 함수를 붙이는 것과 같은 결과
-- ANY는 서브쿼리의 컬럼에 MIN() 함수를 붙이는 것과 같은 결과
SELECT empno, ename, sal
FROM emp
WHERE sal >= ALL (SELECT sal FROM emp
						WHERE sal > 500); -- 500 이상이면 600, 520, 1000, 560
						
-- 위와 같은 결과
SELECT empno, ename, sal
FROM emp
WHERE sal >= (SELECT MAX(sal) FROM emp
						WHERE sal > 500);

SELECT empno, ename, sal
FROM emp
WHERE sal >= ANY (SELECT sal FROM emp
						WHERE sal > 500);

-- 위와 같은 결과
SELECT empno, ename, sal
FROM emp
WHERE sal >= (SELECT MIN(sal) FROM emp
						WHERE sal > 500);
						
-- EXISTS가 나오면
SELECT deptno, dname
FROM dept
WHERE not EXISTS (SELECT *
						FROM emp
						WHERE deptno = dept.deptno); -- < 이 부분을 주시해야함.
						
SELECT DISTINCT DEPTNO FROM emp; -- 10, 20, 30

SELECT DISTINCT DEPTNO FROM dept; -- 10, 20, 30, 40

					