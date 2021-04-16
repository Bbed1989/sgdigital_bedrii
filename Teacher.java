package Person;

public class Teacher extends Person implements AttendClasses {

    private String subject;



    private int dayRate;


    public Teacher(String name, int age, String subject, int dayRate) {
        super(name, age);
        this.subject = subject;
        this.dayRate = dayRate;
    }


    public int calculateSalary(int dayRate, int numberOfDays) {
        this.dayRate = dayRate;
        return dayRate * numberOfDays;
    }

    public int calculateSalary(int dayRate, int numberOfDays, int bonus) {
        this.dayRate = dayRate;
        return dayRate * numberOfDays * bonus;
    }

    @Override
    public void isAttended() {
        System.out.println("Person.Teacher gives the lecture.");
    }

    public String getSubject() {
        return subject;
    }

    public int getDayRate() {
        return dayRate;
    }


}


