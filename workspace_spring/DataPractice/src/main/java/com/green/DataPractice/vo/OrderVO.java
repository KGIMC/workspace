package com.green.DataPractice.vo;

import java.util.Arrays;

public class OrderVO {

    private String type;
    private int cnt;
    private String[] option; // 옵션은 데이터가 여러개 들어올 수 있기에 배열
    private String request;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String[] getOption() {
        return option;
    }

    public void setOption(String[] option) {
        this.option = option;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "type='" + type + '\'' +
                ", cnt=" + cnt +
                ", option=" + Arrays.toString(option) +
                ", request='" + request + '\'' +
                '}';
    }
}
