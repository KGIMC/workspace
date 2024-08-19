package collection.list;

import java.util.List;

public class School {
    private List<StudyClass> classList; // < 학교에 교실이 여러개 있다.

    // 생성자 매개변수로 교실 목록이 들어온 것
    School(List<StudyClass> classList){
        this.classList = classList;
    }

    public List<StudyClass> getClassList(){
        return classList;
    }
}
