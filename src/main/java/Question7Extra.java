public class Question7Extra {
    public static void main(String[] args) {
        //find prime numbers
        int scope = 100;
        for (int i=1; i< scope-1; i++){
            int count=0;
            for (int j=1; j<=i/2; j++){
                if (i%j==0){count++;}
            }
            if (count==1) System.out.println(i);
        }
    }
}
