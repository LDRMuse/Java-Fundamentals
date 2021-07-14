package labs_examples.static_nonstatic.labs;

public class Person {

    String firstName;
    Boolean isStudent;
    Boolean isTeacher;
    static int numOfPersonsCreated;
    static int numOfTeachers;
    static int numOfStudents;

    public Person() {
        this.firstName = this.getFirstName();
        this.isStudent = false;
        this.isTeacher = false;
    }

    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getStudent() {
        return isStudent;
    }

    public void setStudent(Boolean student) {
        isStudent = student;
    }

    public Boolean getTeacher() {
        return isTeacher;
    }

    public void setTeacher(Boolean teacher) {
        isTeacher = teacher;
    }

    public static int getNumOfPersonsCreated() {
        return numOfPersonsCreated;
    }

    public static void setNumOfPersonsCreated(int numOfPersonsCreated) {
        Person.numOfPersonsCreated = numOfPersonsCreated;
    }

    public static int getNumOfTeachers() {
        return numOfTeachers;
    }

    public static void setNumOfTeachers(int numOfTeachers) {
        Person.numOfTeachers = numOfTeachers;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    public static void setNumOfStudents(int numOfStudents) {
        Person.numOfStudents = numOfStudents;
    }

    // Methods

    public static void countNumberOfTeachersOrStudents(Person person) {
        if (person.isTeacher) {
            numOfTeachers++;
        }
        if (person.isStudent) {
            numOfStudents++;
        }
        numOfPersonsCreated++;
    }

    public void schoolGreeting(String firstName) {
        System.out.println("Hi " + firstName + "! Welcome to School!");
    }

}
