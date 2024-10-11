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


SELECT
        p.pat_Num, p.pat_Name, p.age, p.pat_Email, p.gender, p.citizen_Num, 
		  d.doc_Name, md.dept_Name, dc.dis_Name, t.about_Pat, t.tre_Date, 
		  CASE WHEN is_Pay = 'N' THEN '미완료' ELSE '완료' END AS 결제여부
        FROM patient p 
        LEFT JOIN info_treat t ON p.pat_Num = t.pat_Num
        LEFT JOIN doctor d ON t.doc_Linum = d.doc_Linum
        LEFT JOIN medi_Dept md ON d.dept_Num = md.dept_Num
        LEFT JOIN disease_category dc ON t.disease = dc.dis_Code
        LEFT JOIN desk ON t.tre_Num = desk.tre_Num
        WHERE
        p.pat_Num = p.pat_num
        AND is_pay = 'N';
        
