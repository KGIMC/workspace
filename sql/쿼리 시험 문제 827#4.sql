-- 시험 문제

-- 1. 회원정보를 관리하는 테이블을 생성하려고 한다. 
-- 이 테이블에서 관리하는 정보로는 회원번호, 아이디, 비밀번호, 회원이름, 나이, 이메일주소가 있다. 
-- 해당 테이블명을 MY_MEMBER라고 했을 때, 테이블 생성 쿼리문을 작성하세요. 
-- 단, 기본키는 회원번호로 하고 나이와 메일주소만 NULL값을 허용한다.

CREATE TABLE MY_MEMBER (
	MEM_NUM INT PRIMARY KEY
,  MEM_ID VARCHAR(10) NOT NULL
,  MEM_PW VARCHAR(20) NOT NULL
,  MEM_NAME VARCHAR(50) NOT NULL
,  MEM_AGE INT
,  MEM_ADDRESS VARCHAR(50)
);


-- 2. 위에서 생성한 MY_MEMBER에 데이터를 삽입하는 쿼리문과 모든 데이터를 삭제하는 쿼리문을 작성하시오. 
-- 삽입되는 내용은 임의로 작성하면 된다
INSERT INTO MY_MEMBER (MEM_NUM, MEM_ID, MEM_PW, MEM_NAME, MEM_AGE, MEM_ADDRESS) 
VALUES (1, 'JAVA', '1234', 'J', 20, 'JAVA@JAVA');

DELETE FROM my_member;

-- 3. 위에서 생성한 MY_MEMBER에서 회원번호가 1번인 회원의 이름을 
-- ‘김자바’로, ID는 ‘KIMJAVA’로 수정하는 쿼리문을 작성하세요.

UPDATE MY_MEMBER
SET MEM_NAME = '김자바', MEM_ID = 'KIMJAVA'
WHERE MEM_NUM = 1;

-- 4. 급여가 500에서 3000 사이이고 커미션이 NULL이 아닌 사원의 
-- 사원번호, 사원명, 급여, 커미션을 조회하는 쿼리문을 작성하세요.

SELECT * FROM emp;

SELECT EMPNO, ENAME, SAL, COMM 
FROM EMP 
WHERE SAL BETWEEN 500 AND 3000 
AND COMM IS NOT NULL;

-- 5. 사원들 중 이름이 ‘기’로 끝나거나, ‘김’이 들어가는 사원들의 
-- 사번, 이름, 입사일을 조회하되, 사번기준 내림차순 정렬하여 조회하는 쿼리문을 작성하세요.
SELECT EMPNO, ENAME, HIREDATE 
FROM EMP 
WHERE ENAME LIKE '%기' 
OR ENAME LIKE '%김%' 
ORDER BY EMPNO DESC;

-- 6. 사원의 사번, 이름, 부서번호, 부서명을 조회해보자. 
-- 부서명은 부서번호가 10일 때는 ‘인사부’, 20일 때는 ‘영업부’, 
-- 30일 때는 ‘개발부’, 그 외의 값은 ‘생산부’로 조회되어야 한다. 
-- 조인 사용하는 문제 아님. CASE 사용.

-- 7. 1월에 입사한 모든 사원의 사번, 이름, 입사일, 커미션을 입사일 
-- 기준 오름차순으로 조회하는 쿼리문을 작성하세요. 
-- 단, 커미션이 NULL일 경우 커미션은 0으로 조회되어야 한다.

SELECT EMPNO, ENAME, HIREDATE, 
COALESCE(COMM, 0) 
FROM EMP 
WHERE MONTH(HIREDATE) = 1 
ORDER BY HIREDATE;

-- 8. 부서별로 그룹지어서 부서별 급여의 합과 
-- 급여의 평균, 커미션의 평균을 조회하는 쿼리문을 작성하여라. 
-- 단 조회는 부서별 급여의 총합이 큰 순서대로 조회되어야 한다.


-- 9. 서브쿼리를 사용하여 부서명이 ‘인사부’인 사원의 
-- 사번, 이름, 입사일, 급여, 부서번호, 부서명을 조회하는 쿼리문을 작성해보자. 

-- 10. 조인을 사용하여 부서명이 ‘인사부’가 아니고 
-- 급여가 500이상인 사원의 사번, 이름, 입사일, 급여, 부서번호, 부서명을 조회하는 쿼리문을 작성해보자. 
-- 단, 정렬은 사번 기준 내림차순으로 정렬 후 사원 이름 기준 오름차순으로 정렬한다.
