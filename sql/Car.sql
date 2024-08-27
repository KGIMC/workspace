-- 자동차 정보 테이블 생성
CREATE TABLE CAR_INFO (
    MODEL_NUM INT AUTO_INCREMENT PRIMARY KEY,
    MODEL_NAME VARCHAR(100) NOT NULL,
    PRICE INT NOT NULL,
    BRAND VARCHAR(100) NOT NULL
);

-- 자동차 판매 정보 테이블 생성
CREATE TABLE SALES_INFO (
    SALES_NUM INT AUTO_INCREMENT PRIMARY KEY,
    BUYER VARCHAR(100) NOT NULL,
    BUYER_TEL VARCHAR(20),
    COLOR VARCHAR(50) NOT NULL,
    SALES_DATE DATE NOT NULL DEFAULT CURRENT_DATE,
    MODEL_NUM INT NOT NULL,
    FOREIGN KEY ( MODEL_NUM ) REFERENCES CAR_INFO( MODEL_NUM )
);

-- 차량 등록 쿼리
INSERT INTO car_info (MODEL_NAME , PRICE, BRAND)
VALUES ('흉기차', 100000, '현대');

-- 구매자 등록 쿼리
INSERT INTO SALES_INFO (BUYER, BUYER_TEL, COLOR, SALES_DATE, MODEL_NUM)
VALUES ('kim', '123-456-7890', 'Red', '2024-08-27', 1);
       

-- 구매자가 구매한 차량 조회
SELECT c.model_num, model_name, price, sales_num, buyer, color, s.model_num, buyer_tel                   , sales_date
FROM car_info c, sales_info s
WHERE c.model_num = s.model_num
AND sales_num = 1;

SELECT * FROM car_info;
SELECT * FROM sales_info;