-- 게시판 프로그램 테이블 생성

-- 테이블 삭제하는 쿼리문
DROP TABLE basic_board;
-- 테이블 삭제와 데이터 삭제와 구분할 것

CREATE TABLE BASIC_BOARD(
	-- 컬럼명 데이터타입 [제약조건들]
	-- 기본키 하나는 반드시 설정해둘 것 ( 중복, NULL 불가 )
	-- 완성된 테이블
    	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY -- AUTO_INCREMENT는 INSERT 할때마다 스스로 1씩 증가한다는 의미
   ,  TITLE VARCHAR(50) NOT NULL -- NOT NULL은 NULL 못 들어온다는 뜻
   ,  WRITER VARCHAR(50) NOT NULL -- 제약 조건은 연달아 사용 가능
   ,  CONTENT VARCHAR(100) -- 내용 중복 불가 ( NULL은 중복처리 안함 )
   ,  CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
   ,  READ_CNT INT DEFAULT 0
);

SELECT * FROM BASIC_BOARD;

INSERT INTO BASIC_BOARD (TITLE, WRITER, CONTENT)
VALUES ('1', '1', '1');

SELECT BOARD_NUM
        , TITLE
        , WRITER
        , CONTENT
        , CREATE_DATE
        , READ_CNT
        FROM BASIC_BOARD;

INSERT INTO basic_board (
	TITLE
	, WRITER
	, CONTENT
) VALUES (
	'제목6'
, 	'작성자6'
,  '내용6'
);




