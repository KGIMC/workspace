package com.green.DB_Member.vo;


// VO에 있는 데이터를 가져다 쓰려면
// HTML에 있는 name값과 동일해야함.
// 그러하면 VO에 있는 변수명과
// HTML에 있는 name값 중 어느 것을 먼저 설정해야하는지 생각한다면,
// 그 기준은 데이터베이스 값을 기준으로 한다.

// DB의 컬럼명을 기준으로 카멜케이스 방법으로 변수명을 작성한다.
// 작성한 변수명을 토대로 HTML의 name값을 적는다.


public class MemberVO {
    private int memNum;
    private String memName;
    private int memAge;
    private String memAddr;

    public int getMemNum() {
        return memNum;
    }

    public void setMemNum(int memNum) {
        this.memNum = memNum;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public int getMemAge() {
        return memAge;
    }

    public void setMemAge(int memAge) {
        this.memAge = memAge;
    }

    public String getMemAddr() {
        return memAddr;
    }

    public void setMemAddr(String memAddr) {
        this.memAddr = memAddr;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "memNum=" + memNum +
                ", memName='" + memName + '\'' +
                ", memAge=" + memAge +
                ", memAddr='" + memAddr + '\'' +
                '}';
    }
}
