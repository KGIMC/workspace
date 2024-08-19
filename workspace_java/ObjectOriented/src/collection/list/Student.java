package collection.list;


// 리스트 첫번째 유인물 9번
// 몰루겠다. 조져따. 큰일났따 !

public class Student {
    private String name;
    private int korScore;
    private int EngScore;
    private int totalScore;

    public Student(String name, int korScore, int EngScore){
        this.name = name;
        this.korScore = korScore;
        this.EngScore = EngScore;
        this.totalScore = korScore + EngScore;

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
        return EngScore;
    }

    public void setEngScore(int engScore) {
        EngScore = engScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", korScore=" + korScore +
                ", EngScore=" + EngScore +
                ", totalScore=" + totalScore +
                '}';
    }
}
