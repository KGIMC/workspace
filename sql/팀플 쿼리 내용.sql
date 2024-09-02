SELECT * FROM member;
SELECT * FROM patient;
SELECT * FROM desk;
SELECT * FROM doctor;
SELECT * FROM info_date;
SELECT * FROM info_medicine;


-- 예약 대기 조회

SELECT PAT_NUM, PAT_NAME, AGE
FROM patient
ORDER BY PAT_DATE DESC;


SELECT * FROM patient;

-- 대기 환자 목록을 누르면 회원번호도 가져와야함.
