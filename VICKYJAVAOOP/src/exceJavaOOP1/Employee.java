package exceJavaOOP1;

public class Employee {
    public  String employName;
    public  int employAge;

    public Employee(String employName, int employAge){
        this.employAge = employAge;
        this.employName = employName;

    }

    public void displayEmployee(){
        System.out.println("List of employees : " + " My Name is " + employName + " " +  employAge + " " + "Year olds" );
    }




}
