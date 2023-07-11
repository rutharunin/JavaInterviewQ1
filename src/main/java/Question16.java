public class Question16 {
    public static void main(String[] args) {
        int number =4577;
        int sum =0;
        // find sum of digits
        while (number>0){
            sum+=number%10;
            number/=10;
        }
        System.out.println(sum);
    }
}
