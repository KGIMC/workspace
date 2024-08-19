package class_basic.student2;


// 배열 + 클래스
public class StudentTest {
    public static void main(String[] args) {
        // 학생을 5명 저장할 수 있는 배열

        int[] arr = new int[5];
        Student[] students = new Student[5];

        // 배열에 저장할 학생 객체 생성

        Student s1 = new Student("김", 20, 80);
        Student s2 = new Student("이", 21, 81);
        Student s3 = new Student("박", 31, 91);
        Student s4 = new Student("최", 41, 71);
        Student s5 = new Student("강", 51, 61);

        // 배열 0번째 요소에 학생 s1 저장

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        // 배열에 저장된 모든 학생의 이름, 나이, 점수를 출력
        // 1번 문제임.
//        for(int i = 0 ; i < students.length ; i++){
//            students[i].print();
//            System.out.println();
//        }
        // 1번 문제를 for each 문으로 푸세요.
//        for( Student e : students){
//            e.print();
//            System.out.println();
//        }



        // 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
//        for(int i = 0 ; i < students.length ; i++){
//            if(students[i].getScore() >= 80){
//                students[i].print();
//                System.out.println();
//            } else{
//
//            }
//
//        }

        // 이름이 박인 학생을 찾아 해당 학생의 나이를 10으로 변경
        for(int i = 0 ; i < students.length ; i++){
            if(students[i].getName().equals("박")){
                students[i].setAge(10);
                students[i].print();
            }
            else{

            }
        }

//        for(Student e : students){
//            if(e.getName().equals("박")){
//                e.setAge(10);
//                e.print();
//            }
//            else{
//
//            }
//        }

    }
}
