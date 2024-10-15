-- VIEW -- 가상 테이블
-- 사용 이유
-- 1. 민감한 데이터를 보안(숨기기)하기 위해서
-- 2. 잦은 조인, 서브쿼리 작성에 대한 피로감을 줄이기 위해

SELECT * FROM emp;

-- VIEW ( 가상 테이블 -- 테이블처럼 사용 )
CREATE VIEW EMP_VIEW AS
SELECT EMPNO, ENAME, JOB, HIREDATE
FROM emp;

SELECT * FROM emp_view;

CREATE VIEW STU_VIEW AS
SELECT STU_NUM, STU_NAME
FROM join_stu;

-- 기본 테이블을 변경하면 VIEW로 만든 테이블도 영향을 받음
-- VIEW에서는 가급적 INSERT, DELETE, UPDATE 하지 말것
-- VIEW는 SELECT를 자주하기 위해서 사용하는 목적이 큼
DELETE FROM join_stu WHERE STU_NUM = 6;

SELECT * FROM STU_VIEW;

SELECT * FROM STU_VIEW
WHERE STU_NUM > 2;

CREATE VIEW STU_VIEW_2 AS
SELECT STU_NUM S_NUM, STU_NAME S_NAME
FROM join_stu
WHERE STU_NUM < 4;

SELECT * FROM STU_VIEW_2;
SELECT STU_NUM, STU_NAME FROM STU_VIEW_2;



-- 자주 사용하는 걸 VIEW로 만들어버림
CREATE VIEW STU_SCORE_VIEW AS
SELECT STU.STU_NUM, STU_NAME, SCORE
FROM join_stu STU JOIN join_score SCORE
ON STU.STU_NUM = SCORE.STU_NUM;

SELECT * FROM STU_SCORE_VIEW;

-- VIEW 테이블 날리기 
-- 데이터가 들어있지 않아서 날려도 안전
DROP VIEW STU_SCORE_VIEW;