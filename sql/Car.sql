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
    SALES_DATE DATE NOT NULL,
    MODEL_NUM INT NOT NULL,
    FOREIGN KEY ( MODEL_NUM ) REFERENCES CAR_INFO( MODEL_NUM )
);

-- 차량 등록 쿼리
INSERT INTO car_info (MODEL_NAME , PRICE, BRAND)
VALUES ('흉기차', 100000, '현대');


-- 차량 목록 조회 쿼리
SELECT model_num, model_name, price, brand
FROM car_info;