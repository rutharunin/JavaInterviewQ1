public class Question2 {
    public static void main(String[] args) {
        //Write a java program to find the second-largest number in the array?
        int[] array = {100, 300, 200, 450,350};
        //int[] array ={12,13,12,15, 15, 0, -1};

        int highest = 0;
        int secondHight =0;
        int i=0;
        for (; i<array.length; i++){
            if (array[i]>highest)highest=array[i];
            for (int j=0; i==array.length-1 && j< array.length; j++){//the second loop runs only when the first loop iterates to the last index to reduce execution
                if (array[j]<highest&&array[j]>secondHight)secondHight=array[j];
            }
        }
        System.out.println(secondHight);
    }

}
