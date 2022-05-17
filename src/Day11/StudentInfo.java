package Day11;

public class StudentInfo {

    private int StudentNumber;
    private String name;
    private String major;
    private String mainProfessor;
    private float avgSubjectScore;
    private String[] subjectList = new String[6];

    public StudentInfo(int StudentNuber, String name, String major, String mainProfessor, float avgSubjectScore){
        this.StudentNumber = StudentNuber;
        this.name = name;
        this.major = major;
        this.mainProfessor = mainProfessor;
        this.avgSubjectScore = avgSubjectScore;
    }

    public String[] getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(String[] subjectList) {
        this.subjectList = subjectList;
    }



    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMainProfessor() {
        return mainProfessor;
    }

    public void setMainProfessor(String mainProfessor) {
        this.mainProfessor = mainProfessor;
    }


    public float getAvgSubjectScore() {
        return avgSubjectScore;
    }

    public void setAvgSubjectScore(float avgSubjectScore) {
        this.avgSubjectScore = avgSubjectScore;
    }


}
