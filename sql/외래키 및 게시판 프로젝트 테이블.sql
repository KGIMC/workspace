-- 데이터베이스 키(KEY) 종류
-- KEY : 데이터베이스에서 각 행을 구분하는 식별자
-- 슈퍼키(SUPER KEY) : 하나의 행을 식별할 수 있는 하나 이상의 컬럼
-- 후보키(CANDIDATE KEY) : 기본키가 될 수 있는 후보
-- 기본키(PRIMARY KEY : PK) : 후보키 중에 각 행을 구분짓기 위해 결정한 키
-- 대체키(ALTERNATE KEY) : 후보키 중에서 기본키를 제외한 키
-- 외래기(FOREIGN KEY : FK) : 다른 테이블의 기본키로 사용되는 키 

-- 로그인, 게시글, 댓글 관련 기능이 포함된 게시판 프로젝트
-- 테이블 총 3개
-- 회원정보 저장 테이블 1개
-- 게시글 정보 저장 테이블 1개
-- 댓글 정보 저장 테이블 1개

-- 회원정보
-- USER : 일반회원
-- ADMIN : 관리자

CREATE TABLE board_member (
	-- PRIMARY KEY NULL X 중복 X
	MEM_ID VARCHAR(50) PRIMARY KEY
,  MEM_PW VARCHAR(50) NOT NULL
,  MEM_NAME VARCHAR(50) NOT NULL
,  GENDER VARCHAR(10) -- 남성이면 'male' 여성이면 'female'
   -- DEFAULT는 값을 안 넣으면 기본값으로 어떠한 값을 넣겠다는 의미
,  MEM_ROLE VARCHAR(20) DEFAULT 'USER'
);

-- 임시 회원 데이터
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('java', '1111', '김자바', 'male', 'USER');
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('admin', '1111', '관리자', 'female', 'ADMIN');



-- 게시판 정보 (로그인한 회원만 게시글 작성 가능)
CREATE TABLE BOARD (
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
,  TITLE VARCHAR(50) NOT NULL
,  CONTENT VARCHAR(100)
-- 작성자에 회원 아이디가 들어온다는 소리
,  MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID) -- 외래키
,  CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES ('1번글', '1번내용', 'java');
INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES ('2번글', '2번내용', 'java');
INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES ('3번글', '3번내용', 'admin');

-- 댓글 정보
-- 댓글도 회원만 작성 가능하게 
CREATE TABLE BOARD_REPLY (
	REPLY_NUM INT AUTO_INCREMENT PRIMARY KEY
,  REPLY_CONTENT VARCHAR(50) NOT NULL
,  REPLY_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
,  MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID) -- 외래키
,  BOARD_NUM INT REFERENCES BOARD (BOARD_NUM) -- 외래키
);                                                                  


INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글1', 'java', 1);
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글2', 'java', 2);
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글3', 'java', 1);
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글4', 'admin', 1);
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글5', 'admin', 2);


SELECT * FROM board_member;
SELECT * FROM board;
SELECT * FROM board_reply;

-- 데이터 조회 연습
-- 회원의 이름이 김자바인 회원이 작성한 게시글의
-- 글번호, 제목, 작성자를 조회, 작성일 기준 최신글부터 조회(내림차순)

SELECT board_num, title, b.mem_id, mem_name, create_date
FROM board b, board_member m
WHERE b.mem_id = m.mem_id
AND mem_name = '김자바'
ORDER BY create_date DESC;

-- 모든 게시글의 글번호, 글제목, 작성자 및 해당 글에 작성된
-- 댓글의 댓글 내용, 댓글 작성자, 댓글 작성일 조회
-- 게시글 번호 기준 최신순으로 정렬 후
-- 같은 게시글에 대한 댓글은 가장 최근 달린 댓글 순으로 조회

-- 조회해야할 것
-- 글번호, 글제목, 작성자, 댓글내용, 댓글작성자, 댓글 작성일

SELECT b.board_num, title, b.mem_id
, reply_content, r.mem_id, reply_date
FROM board b, board_reply r
WHERE b.BOARD_NUM = r.board_num
ORDER BY board_num DESC, reply_num desc;



SELECT BOARD_NUM, TITLE, MEM_ID, CREATE_DATE FROM board;


-- 아이디 중복 여부 확인 쿼리문
SELECT MEM_ID
FROM board_member;


SELECT mem_id
FROM board_member
WHERE mem_id = 'java'
AND mem_pw = '1111';


SELECT board_num
	,   title
	,   content
	,   mem_id
	,   create_date
FROM board
WHERE board_num = 1;

SELECT * FROM board_reply;

SELECT 
	reply_num
,	reply_content
,  reply_date
,  mem_id
,  board_num
FROM board_reply
WHERE board_num = 1;


-- 아이디가 'java'인 회원이 작성한 게시글의
-- 글제목, 내용, 작성자id, 작성자명, 작성자 권한 조회

SELECT TITLE, CONTENT, b.MEM_ID, m.mem_id, MEM_NAME, MEM_ROLE
FROM board b, board_member m
WHERE b.mem_id = m.mem_id
AND b.mem_id = 'java';


-- 글번호가 5번 이하인 게시글의
-- 글번호, 제목, 글 작성자명을 조회하되
-- 글번호 기준 오름차순으로 정렬

SELECT board_num, title, b.mem_id, m.mem_id, mem_name
FROM board b, board_member m
WHERE b.mem_id = m.mem_id
AND board_num <= 5
ORDER BY board_num;

-- 1번 게시글의 제목, 작성자 id 및
-- 1번 게시글에 작성된 댓글의 댓글 내용 조회

SELECT * FROM board_reply;

SELECT title, b.mem_id, reply_content, b.board_num
FROM board b, board_reply r
WHERE b.board_num = r.board_num
AND b.board_num = 1;


-- 1번 게시글의 제목, 작성자 id 및
-- 1번 게시글에 작성된 댓글의 댓글 내용, 댓글 작성자 id, 댓글 작성자 이름 조회

SELECT title, b.mem_id, r.mem_id, reply_content, mem_name
FROM board b, board_reply r, board_member m
WHERE b.board_num = r.board_num
AND r.mem_id = m.mem_id
AND b.board_num = 1;


SELECT BOARD_NUM
    ,  TITLE
    ,  B.MEM_ID
    ,  MEM_NAME
    ,  MEM_ROLE
FROM BOARD B, BOARD_MEMBER M
WHERE B.MEM_ID = M.MEM_ID;

SELECT * FROM board;
SELECT * FROM board_reply;

DELETE FROM board WHERE board_num = 5; -- 해당 번호의 게시글 삭제
DELETE FROM board_reply WHERE board_num = 2; -- 해당 번호 게시글의 댓글 전부 삭제

DELETE FROM board_reply WHERE board_num = 2;
DELETE FROM board WHERE board_num = 2;
