package com.green.DataPractice.vo;

import java.util.Arrays;

// VO 만드는 이유
// html에서 넘어오는 정보를 전달받고, 전달하기 위한 공간
// html의 name 속성값과 반드시 일치해야함.
public class ScoreVO {
    private String name;
    private int year;
    private String[] tel;
    private String gender;
    private int korScore;
    private int engScore;
    private int mathScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getTel() {
        return tel;
    }

    public void setTel(String[] tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "ScoreVO{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", tel=" + Arrays.toString(tel) +
                ", gender='" + gender + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", mathScore=" + mathScore +
                '}';
    }
}
