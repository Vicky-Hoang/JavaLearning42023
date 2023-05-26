package vickyBasic1.collection;

import java.util.ArrayList;

public class EventNumber {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>(26);
        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0 ){
                numberList.add(i);
                System.out.println(i);
            }
        }
        //Pass event number into array and then printing
        System.out.println(" These is following of event number");
        for (int eventNumber : numberList){
            System.out.println(eventNumber);
        }
    }
}
