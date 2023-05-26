package vickyBasic1.collection;

import java.util.ArrayList;

public class Employee {
    public String employName;
    public int employAge;


    public Employee(String name, int age) {
        this.employAge = age;
        this.employName = name;
    }

    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String name) {
        this.employName = name;
    }

    public int getEmployAge() {
        return employAge;
    }

    public static void main(String[] args) {
        //Create a employee list
        ArrayList<Employee> employList = new ArrayList<>();
        employList.add(new Employee("Lily", 38));
        employList.add(new Employee("Jimmy", 38));

        //Print Array List of Employee
        System.out.println("Following is the info of all employee");

        //User simple For
        for (int i = 0; i < employList.size(); i++){
            System.out.println(employList.get(i).employName + " " + employList.get(i).employAge + " Years old");
    }
}
}
