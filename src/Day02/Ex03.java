package Day02;

import java.util.*;

public class Ex03 {
    public static void main(String[] args) {

        Map<String, Object> Information = new HashMap<>();
        Information.put("이름", "이또또");
        Information.put("나이", 24);
        Information.put("학교", "동아방송예술대");
        Information.put("성별", "여성");
        Information.put("주 프로그래밍언어", "자바");

        Map<String, Object> Information1 = new HashMap<>();
        Information1.put("이름", "이또치");
        Information1.put("나이", 23);
        Information1.put("학교", "경희대학교");
        Information1.put("성별", "여성");
        Information1.put("특기", "캡스톤디자인");

        List<Map<String, Object>> PersonenInformation = new ArrayList<>();
        PersonenInformation.add(Information);
        PersonenInformation.add(Information1);

        System.out.println("List Map Insert : " + PersonenInformation.toString());


    }
}
