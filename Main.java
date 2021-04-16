package Person;

import java.util.ArrayList;

public class Main {

    static String subjectToSearch = "Technologies";
    static String nameToSearch = "Sasha";
    static String facultyToSearch = "FancyStudies";

    public static void main(String[] args) {
        Teacher Bohdan = new Teacher("Bohdan", 32, "Law", 50);
        Teacher Sasha = new Teacher("Sasha", 18, "Management", 60);
        Teacher Maria = new Teacher("Maria", 19, "Technologies", 60);
        Student Nastia = new Student("Nastia", 20, "FancyStudies", 99);

        ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(Bohdan);
        teachersList.add(Sasha);
        teachersList.add(Maria);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(Nastia);

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.addAll(teachersList);
        personList.addAll(studentList);

        //my methods
        searchTeacherBySubject(teachersList);
        searchPersonByName(personList);
        searchStudentByFaculty(studentList);

        //methods from classes
        Nastia.isAttended();
        Maria.isAttended();
        System.out.println(Bohdan.calculateSalary(Bohdan.getDayRate(), 22));
        System.out.println(Sasha.calculateSalary(Sasha.getDayRate(), 20, 5));

    }

    public static void searchTeacherBySubject(ArrayList<Teacher> teachersList) {
        for (int i = 0; i < teachersList.size(); i++) {
            String theGuy = teachersList.get(i).getName();
            if (subjectToSearch.equals(teachersList.get(i).getSubject())) {
                System.out.printf("%s That's the one! \n", theGuy);
            }
        }
    }

    public static void searchPersonByName(ArrayList<Person> personList){
        for (int i = 0; i < personList.size(); i++){
            String theGuy = personList.get(i).getName();
            if (nameToSearch.equals(theGuy)) {
                System.out.printf("%s That's the one! \n", theGuy);
            }
        }
    }

    public static void searchStudentByFaculty(ArrayList<Student> studentList){
        for (int i = 0; i < studentList.size(); i++) {
            String theGuy = studentList.get(i).getName();
            if (facultyToSearch.equals(studentList.get(i).getFaculty())) {
                System.out.printf("%s That's the one! \n", theGuy);
            }
        }
    }
}
