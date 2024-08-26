CREATE TABLE TEST_MEMBER(
	MEM_NUM INT PRIMARY KEY -- 중복 불가, NULL 불가
	, MEM_NAME VARCHAR(50)
	, MEM_AGE INT
	, MEM_ADDR VARCHAR(50)
);

SELECT * FROM test_member;

-- 데이터베이스는 데이터가 잘못되는 것을 엄격히 금지하기 때문에
-- 데이터의 변화가 생기는 경우 해당 변화가 잘못이 없는지 한번 확인할 기회를 줌
-- 변화된 데이터가 잘못되지 않았으며 COMMIT;명령어로 데이터 변화를 확정지음
-- 잘못된 변화가 있을 때 변화를 취소 시키고 싶다면 ROLLBACK; 명령어 실행


-- 데이터 삽입 INSERT
-- INSERT INTO 테이블명 (컬럼들) VALUES (값들);
-- 입력한 컬럼 순서대로 값을 저장시켜야 함.
INSERT INTO test_member (MEM_NUM, MEM_NAME, MEM_AGE, MEM_ADDR) 
VALUES (10, 'KIM', 26, '울산');

ROLLBACK;
COMMIT;

INSERT INTO test_member (MEM_NUM, MEM_NAME, MEM_ADDR, MEM_AGE) 
VALUES (11, 'KIM', '서울시', 33);

-- 컬럼명은 반드시 모든 컬럼이 작성될 필요는 없다.
-- 작성되지 않은 컬럼에는 기본적으로 NULL이 들어간다.
INSERT INTO test_member (MEM_NUM, MEM_NAME) 
VALUES (12, '홍');

-- 아래 쿼리는 MEM_NUM에 NULL이 들어가는데
-- MEM_NUM은 기본키(PRIMARY KEY)라 NULL값이 들어갈 수 없어 오류 발생!
INSERT INTO test_member (MEM_NAME, MEM_AGE) 
VALUES ('이', 30);

-- 테이블 생성 시 작성한 컬럼명 순서대로 데이터를 넣는다면
-- 컬럼명 작성을 생략할 수 있다.
-- 모든 컬럼의 값이 들어가야 함!
INSERT INTO test_member VALUES (13, '이름', 50, '부산시');

SELECT * FROM test_member;
-- 데이터 수정 UPDATE
-- UPDATE 테이블명 SET 컬럼명 = 값 [WHERE 조건];

-- WHERE 조건절을 작성하지 않으면 모든 데이터가 변경 됨!
UPDATE test_member
SET
MEM_NAME = '이순신';

ROLLBACK;

-- 회원번호가 10번인 회원의 이름을 '김회원', 나이는 32살로 변경하는 쿼리
UPDATE test_member
SET
	MEM_NAME = '김회원'
	, MEM_AGE = 32
WHERE MEM_NUM = 10;
COMMIT;

SELECT * FROM test_member;
-- 데이터 삭제 DELETE
-- DELETE FROM 테이블명 [WHERE 조건];
DELETE from test_member;
ROLLBACK;

-- 40살 이하인 회원을 모두 삭제
DELETE FROM test_member
WHERE MEM_AGE <= 40;


SELECT * FROM test_member;

COMMIT;