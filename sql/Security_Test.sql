-- Security_Test

CREATE TABLE SECURITY_MEMBER (
	MEM_ID VARCHAR(50) PRIMARY KEY
	, MEM_PW VARCHAR(100) NOT NULL
	, MEM_NAME VARCHAR(50)
	, MEM_ROLE VARCHAR(30)
);

SELECT * FROM security_member;

-- 관리자는 id - admin / 1111 / 관리자권한 :: ADMIN
-- 매니저는 id - manager / 1111 / 관리자권한 :: MANAGER
-- 일반회   ID - user / 1111 / 관리자권한 :: USER


UPDATE SECURITY_MEMBER
SET MEM_ROLE = 'MANAGER'
WHERE MEM_ID = 'manager';