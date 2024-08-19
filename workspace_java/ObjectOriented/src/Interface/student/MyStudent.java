package Interface.student;

public class MyStudent implements StudentUtil {


    @Override
    public String getGradeByStudentName(Student[] students, String name) {
        // 첫번째 매개변수로 받은 다수의 학생 중
        // 두번째 매개변수로 받은 이름을 가진 학생의 점수 등급을 리턴
        // 단, 전달받은 이름을 가진 학생이 없다면 점수 등급은 "등급없음"이 된다
        // 점수 등급
        // 90 <= 평균점수 <= 100 : A
        // 80 <= 평균점수 <= 89 : B
        // 70 <= 평균점수 <= 79 : A
        // 70 > 평균점수 : D
        // 이름이 같은지 비교하기
        String grade = "등급없음";
        for (Student stu : students) { // stu는 student라는 배열에 들어있는 학생 1명 1
            if (stu.getName().equals(name)) { // 학생 한명의 이름 알아내기 2
                // 이름 알아낸 뒤 그 이름이 두번째 매개변수로 받은 이름과 똑같은지 비교 3
                double avg = (stu.getKorScore() + stu.getEngScore() + stu.getMathScore()) / 3.0;
                // 빼온 학생의 모든 점수를 더 한 뒤 수만큼 나누기 4
                grade = getGradeByAvg(avg); // 아래로 뺀 if문을 줄여서 위로 올려주고 그걸 리턴해줌.
            }
        }

        return grade;
    }

    // 점수에 따라 등급을 결정하는 메소드
    private String getGradeByAvg(double avg){
        // public 대신 private 붙인 이유
        // 이 클래스 안에서는 사용 가능하지만, 다른 클래스에서는 필요 없음
        // 내가 기능 편의를 위해 만든 메소드이기 때문에 다른 클래스에서는 필요 없음.
        String grade = "등급없음";
        if (avg >= 90 && avg <= 100) { // 등급 매기기 5
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }

        return grade;

    }


    // 두번째 메소드
    // 메소드명은 : getTotalScoresToArray
    // 매개변수로 받은 다수의 학생들의 총점을 배열로 리턴
    // 다수의 학생 - 이름, 점수 다 가져오기 위한 배열 - student
    // 총점 -> student 클래스의 점수가 int로 설정되어있음.
    @Override
    public int[] getTotalScoresToArray(Student[] students) {
        // 학생의 총점이 저장될 배열 생성
        // 매개변수로 넘어온 학생 수 만큼 총점 갯수 정하기
        int[] totalScores = new int[students.length];

        // 학생 한명 한명의 총점 구하기
        for(int i = 0 ; i < students.length ; i++){
            totalScores[i] = students[i].getKorScore() + students[i].getEngScore() + students[i].getMathScore();
            // students 안에 학생 한명의 총점을 넣겠다.
            // i는 for문으로 인해 학생의 배열 순서(크기)대로 돌아가면서 총점을 저장함.
        }


        return totalScores; // 학생 총점 배열 리턴
    }

    @Override
    public Student getHighScoreStudent(Student stu1, Student stu2) {
        // 세번째 메소드
        // 메소드명 : getHighScoreStudent
        // 매개변수로 두명의 학생이 전달된다.
        // 전달된 두 학생 중 총점이 높은 학생 객체를 리턴
        // 단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정
        // 두명의 학생 < 무조건 2명

        int sum = stu1.getKorScore() + stu1.getEngScore() + stu1.getEngScore(); // 첫번째 학생의 총점
        int sum2 = stu2.getKorScore() + stu2.getEngScore() + stu2.getEngScore(); // 두번째 학생의 총점

      /* if(sum > sum2){
            return stu1;
        } else {
            return stu2;
        }*/

        // 삼항연산자로 바꾸기

        return sum > sum2 ? stu1 : stu2;
    }
}
