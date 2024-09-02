-- 팀플 INSERT 순서

INSERT INTO DOCTOR (DOC_LINUM, DOC_NAME, DEPT) 
VALUES (1001, '신의사', '신경과'),
       (1002, '정의사', '정신과'),
       (1003, '산의사', '산부인과');
   
INSERT INTO MEMBER (MEM_NUM, MEM_ID, MEM_PW, MEM_NAME, MEM_TEL, CITIZEN_NUM, MEM_ADDR, ADDR_DETAIL, MEM_EMAIL, POST, MEM_ROLE) 
VALUES (1, 'ABC123', '1234', '김자바', '010-1234-5678', 123456789, '울산', '새장터', 'abc@gmail.com', '12345', 'USER'),
       (2, 'BBC123', '1234', '이자바', '010-8765-4321', 987654321, '울산', '어딘가', 'bbc@gmail.com', '54321', 'USER');
             
INSERT INTO patient 
       (PAT_NUM, PAT_NAME, AGE, GENDER, CITIZEN_NUM, ADDRESS, DISEASE, DOC_LINUM, ABOUT_PAT, PAT_PRICE, PAT_DATE, IN_HOPI, MEDICINE) 
VALUES (1, '김환자', 22, '남자', '1234', '부산', '감기', 1001, '기침이 심함', 20000, '2023-08-29 10:00:00', 'NO', 'YES'),
       (2, '이환자', 33, '여자', '5678', '부산', '두통', 1002, '머리가 아픔', 15000, '2023-08-29 11:00:00', 'NO', 'YES');
       
INSERT INTO INFO_MEDICINE (MED_NUM, MED_NAME, DOC_LINUM, PAT_NUM) 
VALUES (1, '감기약', 1001, 1),
       (2, '두통약', 1002, 2);


INSERT INTO DESK (DESK_NUM, PAT_NUM, DESK_DATE) 
VALUES (1, 1, '2023-08-29'),
       (2, 2, '2023-08-29');
       
INSERT INTO INFO_DATE (DATE_NUM, IN_HOPI, OUT_HOPI, ROOM_NUM, OPER_DATE, PAT_NUM) 
VALUES (1, '2023-08-29', '2023-08-30', 101, '2023-08-29', 1),
       (2, '2023-08-30', '2023-08-31', 102, '2023-08-30', 2);
