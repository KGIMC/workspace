-- 진료과 임시 데이터
INSERT INTO MEDI_DEPT (DEPT_NUM, DEPT_NAME)
VALUES (1, '내과'), 
		 (2, '외과'), 
		 (3, '신경과');
		 
-- 의사 임시 데이터	 
INSERT INTO DOCTOR (doc_linum, doc_name, dept_NUM)
VALUES 
(1, '내과의1', 1),
(2, '내과의2', 1),
(3, '내과의3', 1);

-- 진료 임시 데이터
INSERT INTO info_treat (PAT_NUM, DISEASE, DOC_LINUM, ABOUT_PAT, TRE_DATE) 
VALUES (1, 'a', 21, 'aa', '2024-09-01 09:30:00'),
		 (2, 'b', 22, 'bb', '2024-09-05 11:00:00'),
		 (3, 'c', 23, 'cc', '2024-09-08 14:00:00');
