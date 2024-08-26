-- 사원명에 '이'라는 글자가 포함된 사원의 모든 정보 조회
-- 글자가 포함되는지 조회 할 때는 LIKE 연산자와 와일드 카드를 사용
-- 와일드 카드 : %, _

SELECT *
FROM emp
WHERE ENAME = '이';

SELECT * 
FROM emp
WHERE ENAME LIKE '%이%' -- 이름에 '이'라는 글자가 포함된 모든 사람 조회


SELECT * 
FROM emp
WHERE ENAME LIKE '_이_'; -- 이름은 세글자이며, 가운데 글자가 '이'인 사람 조회

SELECT *
FROM emp
WHERE ENAME LIKE '%이'; -- 마지막 글자가 '이'로 끝나는 모든 이름 조회

SELECT *
FROM emp
WHERE ENMAE LIKE '_이%'; -- 두번째 글자가 '이'인 사람 조회


-- 문자열 연결 함수
SELECT 'JAVA', 1 + 1 FROM basic_board;