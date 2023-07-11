import java.lang.reflect.Array;
import java.util.Arrays;

public class Question12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7, 8};
        int j = arr.length-1;
        for (int i=0; i < arr.length/2; i++){

            int temp= arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
