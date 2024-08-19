-- 많이 사용하는 함수

SELECT 'java', 123, 'HELLO';
SELECT 'A', BOARD_NUM FROM board;

-- 문자열 나열 함수
SELECT 'JAVA', 'HELLO', CONCAT('JAVA', 'HELLO', 'PYTHON');
SELECT BOARD_NUM, TITLE, CONCAT(BOARD_NUM, '_', TITLE) AS BOARD_INFO FROM board;

-- 문자열 길이
SELECT 'JAVA', LENGTH('JAVA'), 'HELLO', LENGTH('HELLO');

-- 일부 문자열 추출
-- 첫번째 : 원본글
-- 두번째 : 추출 시작 INDEX(1부터시작)
-- 세번째 : 추출 개수
SELECT 'ABCDEFG'
, SUBSTRING('ABCDEFG', 3)
, SUBSTRING('ABCDEFG', 3, 2);

-- 대소문자 변경 함수
SELECT 'Mysql', UPPER('Mysql'), LOWER('Mysql');

-- 문자나 숫자의 자릿수 맞추기
SELECT LPAD('JAVA', 5, '#'), RPAD('JAVA', 5 , '#');

-- 문자열의 좌, 우 공백 제거
SELECT '  AA BB  ', LTRIM('  AA BB  '), RTRIM('  AA BB  '), TRIM('  AA BB  ');

-- 문자열 치환 함수
SELECT '010 1111 2222', REPLACE('010 1111 2222', ' ', '-');

-- 반올림 함수
SELECT 123.456, ROUND(123.456, 2);

-- SELECT는 연산 가능 ( 숫자에 관해서만 )
SELECT 10 + 10, 2*3, 15/4, 10%3, MOD(10, 3);

-- IFNULL - NULL이 아니면 적용되어있던 값, NULL이면 매개변수로 부여한 값이 출력
SELECT COMM, IFNULL(COMM, 0) FROM emp;

-- --

-- 단일행 함수 : 한 행에 하나의 데이터만 조회되는 함수
-- SUM(), MAX(), MIN(), AVG(), COUNT()

SELECT * FROM emp;
-- 모든 사원의 급여 총합 조회
-- SUM(10, 10) <- 불가능
SELECT SUM(SAL), SUM(COMM) FROM emp;

-- 아래 함수와 위의 함수 다른점
-- SUM() 함수는 데이터 수와 관계 없이 조회 결과는 무조건 한개
SELECT LENGTH(ENAME), LENGTH(JOB) FROM emp;

-- *** 쿼리 조회 시 조회하는 모든 컬럼의 조회 행 갯수는 모두 일치해야함
-- 모든 사원의 이름과 급여의 합
SELECT ENAME, SUM(SAL) FROM emp;

-- 데이터가 있는 테이블의 수
SELECT COUNT(*) FROM emp;

-- 추천하는 방법 : COUNT(PK)
SELECT COUNT(EMPNO) FROM emp;

-- NULL 데이터를 COUNT에서 제외하고 계산함
SELECT COUNT(COMM) FROM emp;

-- 평균 계산 시 NULL 데이터 주의
SELECT AVG(COMM) FROM emp;

-- COMM 컬럼의 평균 값을 계산하는 방법
SELECT AVG(IFNULL(COMM, 0)) FROM emp;

-- COMM 컬럼의 평균 값을 계산하고, 소수점 두번째 자리까지 하는 방법
SELECT ROUND(AVG(IFNULL(COMM, 0)), 2) FROM emp;