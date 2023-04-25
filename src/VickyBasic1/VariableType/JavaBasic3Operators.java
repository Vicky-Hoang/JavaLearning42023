package VickyBasic1.VariableType;

public class JavaBasic3Operators {
    public void compareOpera(int a, int b, int c){
        String message1 = a == b ? "A equal to B" : "A does not equal to B";
        System.out.println("Message1 is: " + message1);

        String message2 = a != b ? "A greater than A" : " B is greater than A";
        System.out.println("Message2 is: " + message2);

        String message3 = a > b && a > c ? "A is the biggest number" : "A is not the biggest number";
        System.out.println("Message3 is: " + message3);

        String message4 = a > b || a > c ? "A is greater than C " : " B maybe greater than C";
        System.out.println("Message4 is: " + message4);

        String message5 = a > b ? (b > c ? "A is the biggest number" : (a < c ? "C is the biggest number": "None")) : " None";
        System.out.printf("Message5 is: " + message5);
    }
}
