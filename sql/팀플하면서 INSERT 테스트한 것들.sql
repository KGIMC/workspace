-- 신규 등록하는 환자 번호 생성하는 쿼리
SELECT IFNULL(MAX(PAT_NUM), 0)+ 1 FROM patient;

-- 신규 방문자 접수 등록하는 쿼리
-- patientMapper
INSERT INTO patient (PAT_NUM, PAT_NAME, PAT_EMAIL, AGE, GENDER, CITIZEN_NUM, ADDRESS)
VALUES (4, '4번환자', 'abcd', 40, '남', '1', '울산어딘가');

-- 신규 방문자 접수 동시에 접수 정보 등록
-- patientMapper
INSERT INTO recep_info (pat_num, recep_status, doc_linum) 
VALUES (1, '대기중', 1);

-- 방문 기록 조회하고, 방문 기록 존재하면 접수 등록
INSERT INTO recep_info (pat_num, doc_linum, recep_status)
SELECT PAT_NUM, 1, '대기중'
FROM patient
WHERE PAT_NAME = '4번환자' AND CITIZEN_NUM = 123145;


-- 재방문자 조회
SELECT pat_num
FROM patient
WHERE pat_name = '1번환자' AND citizen_num = 10;

-- 재방문 접수
INSERT INTO recep_info (pat_num, recep_status, doc_linum) 
VALUES (1, '대기중', 1);

SELECT * FROM patient;
SELECT * FROM recep_info;

