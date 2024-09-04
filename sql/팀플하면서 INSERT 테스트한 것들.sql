SELECT * FROM patient;
SELECT * FROM RECEP_INFO;

-- 신규 등록하는 환자 번호 생성하는 쿼리
SELECT IFNULL(MAX(PAT_NUM), 0)+ 1 FROM patient;
        
-- 신규 방문자의 정보 등록
INSERT INTO patient 
(PAT_NUM, PAT_NAME, PAT_EMAIL, AGE, GENDER, CITIZEN_NUM, ADDRESS)
VALUES (4, '이환자', 'ab@gmail.com', 11, '여자', '2345', '어딘가');

-- 신규 방문자 예약 등록과 동시에 접수 정보 등록 
INSERT INTO recep_info 
(pat_num, recep_status) 
VALUES (1, '대기중');

-- 방문한적 있는 환자가 접수 등록할 경우 ( 환자 기록 조회하고, insert 하기 )
INSERT INTO recep_info (pat_num, recep_status)
SELECT PAT_NUM, '대기중'
FROM patient
WHERE PAT_NAME = '신규환자' AND CITIZEN_NUM = 14;

-- 대기순번, 이름, 나이, 진료현황이 나오게 select하면 됨.
SELECT r.recep_num, p.pat_name, p.age, r.recep_status
FROM patient p, recep_info r
WHERE r.pat_num = p.pat_num;

ALTER TABLE recep_info 
ADD dept VARCHAR(30);

SELECT * FROM recep_info;
SELECT * FROM patient;
