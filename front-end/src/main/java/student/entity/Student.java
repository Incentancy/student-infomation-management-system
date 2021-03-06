package student.entity;

import java.util.Date;

public class Student {

    private String studentId;

    private String studentName;

    private String gender;

    private Date birthday;

    private String email;

    private String portrait;         //存储的是图片地址

    private int majorId;             //学生专业id

    public Student(String studentId, String studentName, String gender, Date birthday, String email, String portrait, int majorId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.portrait = portrait;
        this.majorId = majorId;
    }

    public Student( ) {}

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getAllKeyNames(){
        return "studentId"+",studentName"+",gender"+",birthday"+",email"+",portrait"+",majorId";
    }

    public String getAllValues(){
        return studentId+","+studentName+","+gender+","+birthday+","+email+","+portrait+","+majorId;
    }
}
