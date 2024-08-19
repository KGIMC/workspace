package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
    // emp 관련되어 문제를 해결하기 위한 메소드 생성

    // 사원을 여러명 저장할 수 있는 공간
    // 참조자료형은 기본값 null
    // List도 자료형
    private List<Emp> empList;
    private Scanner sc;



    // 초기화는 생성자에서
    public EmpService(){
        sc = new Scanner(System.in);
        empList = new ArrayList<>();

        Emp e1 = new Emp(1001, "김", "개발부", "1111-1111", 400);
        Emp e2 = new Emp(1002, "이", "개발부", "1111-2222", 350);
        Emp e3 = new Emp(1003, "박", "영업부", "1111-3333", 200);
        Emp e4 = new Emp(1004, "최", "영업부", "1111-4444", 300);
        Emp e5 = new Emp(1005, "강", "인사부", "1111-5555", 200);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
    }

    // 1번 문제
    // 로그인하는 메소드 구현
    public void login(){
        /*boolean isRunning = true; // while문 반복 변수
        // true일 경우에는 while문 실행
        // 아닐 경우에는 while문 실행 x

        boolean isFind = false;


        while(isRunning){
            System.out.println("사번 : ");
            int empNo = sc.nextInt();
            System.out.println("비밀번호(연락처 마지막 4자리) : ");
            String pw = sc.next();

            // 입력한 사번과 비밀번호 일치 여부 확인
            for(Emp e : empList){
                if(e.getEmpNo() == empNo && e.getPw().equals(pw)){
                    isRunning = false; // while문 벗어남.
                    System.out.println("로그인하였습니다.");
                    System.out.println(e.getName() + "님 반갑습니다.");
                    isFind = true;
                }
            }
            if(isFind){ // ' ! ' : 부정연산자
                // isFind가 false일때만 실행됨.
                // isFind가 false인 경우 - 못 찾은 경우
                System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
            }
        }
*/
    }

    // 2번 문제
    // 부서 이름 입력하면 부서원 이름과 해당 사람의 급여 출력
    public void printDeptMoney(){
        /*System.out.println("부서명 : ");
        String dept = sc.next();


        int sum = 0;
        int cnt = 0;
        System.out.println(" ==" + dept + " 월급 현황==");
        for(int i = 0 ; i < empList.size() ; i++){
            if(empList.get(i).getDept().equals(dept)){ // empList.get(i) 사원 한명한명에게 접근.
                System.out.println(empList.get(i));
                sum = sum + empList.get(i).getMoney();
                cnt++;
            }
        }
        System.out.println(dept + "의 월급 총액은 " + sum + ", 평균 급여는 " + (sum/(double)cnt));*/
    }

    // 3번 문제
    // 모든 사원의 월급 인상
    public void increaseMoney(){
        System.out.println("부서명 :");
        String dept = sc.next();
        System.out.println("인상 급여 :");
        int money = sc.nextInt();

        System.out.println(dept + "각 사원의 급여가 각각 " + money + "원씩 이상됩니다.");

        // 급여 인상 코드
        for(Emp e : empList){
            if(e.getDept().equals(dept)){ // e.getDept().equals(dept) < 내가 입력한 부서와 동일한 부서 찾기
                int result = e.getMoney() + money;// 사원의 원래 월급 + 인상 금액
                e.setMoney(result); // 급여 변경
            }
        }
        // 인상된 사원 정보 출력
        for(Emp e : empList){
            if(e.getDept().equals(dept)){ // 입력한 부서와 동일한 부서만 출력
                System.out.println(e);
            }
        }
    }


}
