package com.green.DataPractice.vo;

public class StudentVO {
    private int year;
    private String name;
    private int korScore;
    private int engScore;
    private String intro;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", intro='" + intro + '\'' +
                '}';
    }
}
