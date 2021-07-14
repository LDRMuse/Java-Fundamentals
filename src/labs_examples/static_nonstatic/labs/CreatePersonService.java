package labs_examples.static_nonstatic.labs;

public class CreatePersonService {

    public CreatePersonService() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.setFirstName("Melissa");
        person1.setStudent(true);

        person2.setFirstName("Mrs. Heying");
        person2.setTeacher(true);

        person3.setFirstName("Amy");
        person3.setStudent(true);

        person4.setFirstName("Mrs. Spears");
        person4.setTeacher(true);

        person5.setFirstName("Henry");
        person5.setTeacher(true);

        Person.countNumberOfTeachersOrStudents(person1);
        Person.countNumberOfTeachersOrStudents(person2);
        Person.countNumberOfTeachersOrStudents(person3);
        Person.countNumberOfTeachersOrStudents(person4);
        Person.countNumberOfTeachersOrStudents(person5);

        person1.schoolGreeting(person1.getFirstName());
        person2.schoolGreeting(person2.getFirstName());
        person3.schoolGreeting(person3.getFirstName());
        person4.schoolGreeting(person4.getFirstName());
        person5.schoolGreeting(person5.getFirstName());

        System.out.println("Total number of People: " + Person.getNumOfPersonsCreated());
        System.out.println("Total number of Students: " + Person.getNumOfStudents());
        System.out.println("Total number of Teachers:" + Person.getNumOfTeachers());

    }


}
