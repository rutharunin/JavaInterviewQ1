public class Question2Extra {
    public static void main(String[] args) {
        //Write a java program to find the second-largest number in the array?
        //int[] array = {100, 300, 200, 450,350};
        //int[] array ={12,13,12,15, 15, 0, -1};
        int[] array = {12,12,12,12,12,12,12,12,12,12,12,12,12,12,};
        int highest = 0;
        int secondHight = 0;
        boolean thereIsTheSecondHighest = false;
        for (int n =0, z=1; z<array.length; z++){
            if (array[n] != array[z]) thereIsTheSecondHighest=true; break;
        }
if (thereIsTheSecondHighest != true){
    System.out.println("No second highest number");
}else {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] < highest && array[j] > secondHight) {
                secondHight = array[j];
            }
        }
        System.out.println(secondHight);}
    }
}
