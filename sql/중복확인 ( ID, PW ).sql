-- 아이디 중복 확인
SELECT MEM_ID 
FROM shop_member
WHERE MEM_ID = 'TEST2';

-- 비밀번호 중복 확인
SELECT MEM_PW
FROM shop_member
WHERE MEM_PW = '1234';

-- 로그인
SELECT MEM_ID, MEM_PW, MEM_NAME, MEM_ROLE
        FROM SHOP_MEMBER
        WHERE MEM_ID = 'java'
        AND MEM_PW = '1234';