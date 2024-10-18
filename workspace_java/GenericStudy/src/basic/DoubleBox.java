package basic;

import java.util.HashMap;

// 보편적인 Generic 타입 선언 시 사용하는 문자
// T :: type
// E :: element
// K :: key
// V :: value
// N :: number
public class DoubleBox<L, R> {

    private L left;
    private R right;

    public void aa(){
        DoubleBox<String, Integer> a = new DoubleBox<>();
    }
}
