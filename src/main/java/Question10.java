import java.util.Arrays;

public class Question10 {
    //sort array without sort method

    public static void main(String[] args) {
        int [] something ={3,7,6,2,9};
        int bank=1000000000;
        for (int i=0; i <something.length; i++){
            for (int j=i+1; j< something.length; j++){
                if (something[i]> something[j]){
                    bank = something[i];
                    something[i]=something[j];
                    something[j]=bank;
                }
            }
        }
        System.out.println(Arrays.toString(something));
    }
}
