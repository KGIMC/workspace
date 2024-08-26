-- 임의 데이터 추가
INSERT INTO board ( title, content, mem_id ) VALUES ('테스트', 'abc', 'admin');

SELECT * FROM board;


-- 조회하고 싶은 만큼만 페이지 조회하기 1페이지
SELECT board_num
, title
, mem_id
, create_date
FROM board
ORDER BY board_num DESC
LIMIT 5;

-- 조회하고 싶은 만큼만 페이지 조회하기 2페이지
SELECT board_num
, title
, mem_id
, create_date
FROM board
ORDER BY board_num DESC
LIMIT 5 OFFSET 5;

-- 테이블에 존재하는 데이터 갯수 조회
SELECT COUNT FROM board;