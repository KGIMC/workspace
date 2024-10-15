-- 질병 임시 데이터
INSERT INTO DISEASE_CATEGORY VALUES ('001', '감기', 10000);
INSERT INTO DISEASE_CATEGORY VALUES ('002', '코로나', 30000);
INSERT INTO DISEASE_CATEGORY VALUES ('003', '장염', 20000);
INSERT INTO DISEASE_CATEGORY VALUES ('004', '독감', 15000);

-- 진료과 임시 데이터
INSERT INTO medi_dept VALUE (1, '내과');
INSERT INTO medi_dept VALUE (2, '외과');
INSERT INTO medi_dept VALUE (3, '신경과');

-- 멤버 임시 데이터
INSERT INTO MEMBER (MEM_ID, MEM_PW, MEM_NAME, MEM_TEL, CITIZEN_NUM, MEM_ADDR, ADDR_DETAIL, MEM_EMAIL, POST, MEM_ROLE) 
VALUES ('user1', '1234', '홍', '010-1234-5678', '4', '서울특별시', '강남구 테헤란로', 'hong@example.com', '12345', 'USER');

SELECT * FROM member; 


-- 접수 대기자 목록 상태 변경
UPDATE recep_info
SET recep_STATUS = '대기중';



-- 진단명 클릭 시 진단명 기준으로 상세내역 조회
SELECT T.TRE_NUM, D.DIS_NAME, T.ABOUT_PAT, R.MEDI_NAME
FROM INFO_TREAT T, INFO_RECIPE R, DISEASE_CATEGORY D
WHERE T.TRE_NUM = R.TRE_NUM
AND T.DISEASE = D.DIS_CODE
AND T.TRE_NUM = 1;

-- 환자번호 클릭 시 환자번호 기준으로 상세내역 조회
SELECT T.TRE_NUM, T.PAT_NUM, T.DISEASE, T.DOC_LINUM, T.ABOUT_PAT, T.TRE_DATE,
D.DESK_NUM, D.TRE_NUM, D.DESK_DATE, D.DESK_PRICE, D.IS_PAY,
P.PAT_NUM, P.PAT_NAME, P.PAT_EMAIL, P.AGE, P.GENDER, P.CITIZEN_NUM, P.ADDRESS
FROM info_treat t, desk d, patient p
WHERE T.TRE_NUM = D.TRE_NUM
AND P.PAT_NUM = T.PAT_NUM
AND P.PAT_NUM = 2;


-- treNum, pat_num, disease, doc_linum, about_pat, tre_date
SELECT * FROM info_treat;
-- desk_num, tre_num, desk_date, desk_price, is_pay
SELECT * FROM desk;
-- pat_num, pat_name, pat_email, age, gender, citizen_num, addrerss
SELECT * FROM patient;