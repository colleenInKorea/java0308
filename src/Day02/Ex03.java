package Day02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("아 심심하다.");
        Map<String, Object> Information = new HashMap<>();
        Information.put("이름", "이도경");
        Information.put("나이", 25);
        Information.put("학교", "동아방송예술대");
        Information.put("성별", "여성");
        Information.put("주 프로그래밍언어", "자바");

        System.out.println("이도경의 개인정보는 : " + Information.toString() + " 입니다.");



    }
}
