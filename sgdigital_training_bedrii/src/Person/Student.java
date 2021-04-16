package Person;

public class Student extends Person implements AttendClasses {



    private String faculty;
    private int avaregeScore;



    public Student(String name, int age, String faculty, int avaregeScore){
        super(name, age);
        this.avaregeScore = avaregeScore;
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public void isAttended(){
        System.out.println("Person.Student listens a lecture");
    }

}
