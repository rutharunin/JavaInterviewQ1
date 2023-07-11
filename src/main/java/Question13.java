import java.util.Arrays;

public class Question13 {
    public static void main(String[] args) {
        int [] arr={0,4,2,3,6,8,1,9,7};
        Arrays.sort(arr);

        int check =0;
        for (int i =0 ; i< arr.length; i++){
            if (arr[i]!= check) {System.out.println(check); break;}

check++;
        }
    }
}
