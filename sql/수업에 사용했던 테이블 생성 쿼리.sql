CREATE TABLE basic_board (
    BOARD_NUM INT(11) AUTO_INCREMENT PRIMARY KEY,
    TITLE VARCHAR(50) NOT NULL,
    WRITER VARCHAR(50) NOT NULL,
    CONTENT VARCHAR(100) DEFAULT NULL,
    CREATE_DATE DATETIME DEFAULT current_timestamp(),
    READ_CNT INT(11) DEFAULT '0'
);

CREATE TABLE board (
    BOARD_NUM INT(11) AUTO_INCREMENT PRIMARY KEY,
    TITLE VARCHAR(50) NOT NULL,
    CONTENT VARCHAR(100) DEFAULT NULL,
    MEM_ID VARCHAR(50) DEFAULT NULL,
    CREATE_DATE DATETIME DEFAULT current_timestamp()
);

CREATE TABLE board_member (
    MEM_ID VARCHAR(50) PRIMARY KEY,
    MEM_PW VARCHAR(50) NOT NULL,
    MEM_NAME VARCHAR(50) NOT NULL,
    GENDER VARCHAR(10) DEFAULT NULL,
    MEM_ROLE VARCHAR(20) DEFAULT 'USER'
);

CREATE TABLE board_reply (
    REPLY_NUM INT(11) AUTO_INCREMENT PRIMARY KEY,
    REPLY_CONTENT VARCHAR(50) NOT NULL,
    REPLY_DATE DATETIME DEFAULT current_timestamp(),
    MEM_ID VARCHAR(50) DEFAULT NULL,
    BOARD_NUM INT(11) DEFAULT NULL
);


CREATE TABLE my_member (
    MEM_NUM INT(11) PRIMARY KEY,
    MEM_ID VARCHAR(10) NOT NULL,
    MEM_PW VARCHAR(20) NOT NULL,
    MEM_NAME VARCHAR(50) DEFAULT NULL,
    MEM_AGE INT(11) DEFAULT NULL,
    MEM_ADDRESS VARCHAR(50) DEFAULT NULL
);