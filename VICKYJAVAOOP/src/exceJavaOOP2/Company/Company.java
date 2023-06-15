package exceJavaOOP2.Company;


import exceJavaOOP2.Person.Person;

public class Company {
    public void personInfo(Person person) {
        person.getPartialInfo();

    }

    public static void main(String[] args) {
        Company company = new Company();
        company.personInfo(new Person("Lily", 38, "Female"));
    }

}
