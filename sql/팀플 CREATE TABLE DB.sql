-- 1.회원 테이블
CREATE TABLE MEMBER(
   MEM_NUM INT PRIMARY KEY NOT NULL AUTO_INCREMENT 
   , MEM_ID VARCHAR(50) NOT NULL
   , MEM_PW VARCHAR(50) NOT NULL
   , MEM_NAME VARCHAR(100) NOT NULL
   , MEM_TEL VARCHAR(200)
   , CITIZEN_NUM VARCHAR(30) NOT NULL UNIQUE
   , MEM_ADDR VARCHAR(100)
   , ADDR_DETAIL VARCHAR(100)
   , MEM_EMAIL VARCHAR(100) NOT NULL
   , POST VARCHAR(100)
   , MEM_ROLE VARCHAR(50) NOT NULL DEFAULT('USER')
);
        
-- 2.환자정보 테이블(환자넘버, 환자이름, 나이, 성별, 주민번호, 주소, )
CREATE TABLE PATIENT (
   PAT_NUM INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
   PAT_NAME VARCHAR(100) NOT NULL,
   PAT_EMAIL VARCHAR(100) NOT NULL,
   AGE INT NOT NULL,
   GENDER VARCHAR(50) NOT NULL,
   CITIZEN_NUM VARCHAR(100) NOT NULL,
   ADDRESS VARCHAR(100)
);

-- 3. 진료 수납정보 테이블
-- 상태 : 대기중, 진료중
-- 환자 정보를 입력할 때도 recep_info가 같이 들어가야하고,
-- 의사가 recep_info를 가져올때 patient 정보도 들고와야함.
CREATE TABLE recep_info(
   recep_num INT PRIMARY KEY AUTO_INCREMENT,
   pat_num INT NOT NULL,
   doc_linum INT NOT NULL,
   recep_date DATETIME DEFAULT CURRENT_TIMESTAMP,
   recep_status VARCHAR(20) NOT NULL,
   FOREIGN KEY (pat_num) REFERENCES PATIENT(PAT_NUM),
   FOREIGN KEY (doc_linum) REFERENCES DOCTOR(DOC_LINUM)
);


-- 4. 수납정보 테이블(수납 번호, 진료넘버(forein), 마지막 결제일, 총 진료비, 납부한 금액)
CREATE TABLE DESK(
   DESK_NUM INT PRIMARY KEY NOT NULL AUTO_INCREMENT
   , TRE_NUM INT REFERENCES info_treat(TRE_NUM) ON DELETE CASCADE
   , DESK_DATE DATETIME
   , TOTAL_PRICE INT 
   , LEFT_PRICE INT
);

-- 5.의사정보 테이블(면호 번호, 의사 이름, 담당과)
CREATE TABLE DOCTOR(
   doc_linum INT PRIMARY KEY NOT NULL
   , doc_name VARCHAR(50) NOT NULL
   , dept VARCHAR(30) NOT NULL
);
   
-- 6. 입원 정보 테이블(입원일련번호, 입 퇴원 날짜, 호실,  수술날짜, 입원당사자인 환자번호)
CREATE TABLE info_date(
   DATE_NUM INT NOT NULL PRIMARY KEY AUTO_INCREMENT
   , IN_HOPI DATETIME NOT NULL
   , OUT_HOPI DATETIME
   , ROOM_NUM INT
   , OPER_DATE DATETIME
   , PAT_NUM INT REFERENCES patient(PAT_NUM) ON DELETE CASCADE
);

-- 7. 처방전 테이블(처방전 번호, 진료정보, 처방한 약 이름)
CREATE TABLE INFO_RECIPE(
   RECIPE_NUM INT NOT NULL PRIMARY KEY AUTO_INCREMENT
   , TRE_NUM INT REFERENCES info_treat(TRE_NUM) ON DELETE CASCADE
   , MEDI_NAME VARCHAR(30) 
   , EAT_CNT VARCHAR(100) NOT NULL
);

-- 8. 진료정보 테이블:pk 환자번호, 병명, 담당의사번호, 의사소견, 진료일일자, 입원여부(날짜로 확인))
CREATE TABLE info_treat(
   TRE_NUM INT PRIMARY KEY NOT NULL AUTO_INCREMENT
   , PAT_NUM INT NOT NULL REFERENCES patient(PAT_NUM) ON DELETE CASCADE
   , DISEASE VARCHAR(50) NOT NULL
   , DOC_LINUM INT NOT NULL REFERENCES doctor(DOC_LINUM) ON DELETE CASCADE
   , ABOUT_PAT VARCHAR(100) 
   , TRE_DATE DATETIME NOT NULL
   , DATE_NUM INT REFERENCES info_date(DATE_NUM) ON DELETE CASCADE
);


-- 9. 진료 상세 가격 테이블:PK, 진찰료, 입원료, 식대, 주사료 
CREATE TABLE INFO_PRICE(
   PRI_NUM INT PRIMARY KEY NOT NULL AUTO_INCREMENT
   , TRE_PRICE INT NOT NULL
   , DATE_PRICE INT
   , EAT_PRICE INT
   , SHOT_PRICE INT
   , TRE_NUM INT NOT NULL REFERENCES info_treat(TRE_NUM) ON DELETE CASCADE
)