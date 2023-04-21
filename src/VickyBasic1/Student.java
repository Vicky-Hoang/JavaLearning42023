package VickyBasic1;


import VickyBasic1.VariableType.Calculator;

public class Student {
    public String fullName;// The 1st Instance variable
    private int age;//The 2nd Instance variable

    public static String address = " An Khanh, Hoai Duc, Hanoi";//the static variable

    public void dateOfBirth(){
        String Name = "Lily";// local variable
        System.out.println("My name is " + Name);
    }
    // create a constructor
    public Student(String fullName){
        this.fullName =fullName;
    }
    //create Age method to use instance variable
    public void setAge(int age){
        this.age=age;
    }

    //create a function to student
    public void displayStudent(){
        System.out.println("Student name is " + fullName);
        System.out.println("Student age is " + age);
    }


    public static void main(String[] args) {
   //     Student studentInfo = new Student("Vicky");
   //     studentInfo.dateOfBirth();//Call to variable local

   //     studentInfo.setAge(18);
   //     studentInfo.displayStudent();//Call to instance variable

   //     System.out.println("Student address at " + address);// call to static variable without create an object

        //Get info from Information class
   //     Information  getInfo = new Information();
   //     getInfo.showInfo();

        Calculator countSum = new Calculator();
        countSum.Sum(7,8);

        countSum.Multi(17, 25);
    }

}
