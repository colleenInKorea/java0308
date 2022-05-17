package Day11;

public class Test01 {
    public static void main(String[] args) {
        StudentInfo colleen = new StudentInfo(202026021, "이도경", "뉴미디어콘텐츠학과",
                "이석희교수님", 3.93f);
        String[] mySubject = new String[]{"객체지향언어실슴", "영미문화탐구", "진로독서", "인터랙티브프로그래밍"};
        colleen.setSubjectList(mySubject);

        System.out.println( colleen.getStudentNumber());
        System.out.println(colleen.getName());
        System.out.println(colleen.getMajor());
        System.out.println(colleen.getMainProfessor());

        String[] herSubject = colleen.getSubjectList();
        for(int i = 0; i < colleen.getSubjectList().length; i ++){
            System.out.print(herSubject[i]+ " ");
        }
        System.out.println();
        System.out.println(colleen.getAvgSubjectScore());
    }
}