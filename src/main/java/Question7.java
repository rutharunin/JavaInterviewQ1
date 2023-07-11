public class  Question7 {
    public static void main(String[] args) {
        int num = 29;
        Boolean isPrime = true;
        for (int i =2; i<num/2; i++){
            if (num%i ==0){ isPrime = false;
            }
        } System.out.println(isPrime);
    }
}
