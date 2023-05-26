package vickyBasic1.array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int arrayNumber[] = new int[26];
        System.out.println(" List of event number from 0 to 50 is : ");
        for (int i = 0; i <= 50; i ++){
            if (i %2 == 0 ){
                arrayNumber[i/2] = i;
                System.out.println(i);
            }
        }
        System.out.println(" Following is the array list : ");
        for (int arrayListEvenNumber : arrayNumber){
            System.out.println(arrayListEvenNumber);
        }
    }
}
