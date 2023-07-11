public class Question8 {
    public static void main(String[] args) {
        // print the first 10 numbers of Fibonacci series
 int a=0, b=1, d=0, c;
        while (d<10){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
            d++;

        }
    }
}
