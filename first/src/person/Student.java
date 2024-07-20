package person;

public class Student extends Person {
 
    private String studentId;
    public Student(String name, int age,String studentId) {
        super(name, age);
        this.studentId=studentId;
    }
    public void displayRole(){
        System.out.println("I am a Student");
    }
    public String getStudentId(){
        return studentId;
    }
    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
       
}
