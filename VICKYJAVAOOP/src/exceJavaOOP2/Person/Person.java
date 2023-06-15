package exceJavaOOP2.Person;

public class Person {
    public String name;
    public int age;
    public String gender;

    public String phone;

    // Create a constructor with full variables

    public Person(String name, int age, String gender, String phone) {

        this.age = age;
        this.name = name;
        this.gender = gender;
        this.phone = phone;

    }

    //Create a new constructor with three variables
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Create Get() method to show all person info
    public void getAllInfo() {
        System.out.println("The person info_____" + " My name is  " + name + " " + age + " " + gender + " " + phone);
    }

    public void getPartialInfo() {
        System.out.println("Person partial info____" + " My name is " + name + " " + age + " " + gender);
    }
}
