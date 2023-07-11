public class Question14Extra {
    public static void main(String[] args) {
int numLimit =100000000;
int bucket=0;
for (int i=0; i<=numLimit; i++ ){
    bucket=0;
    for (int j=1; j<=i/2; j++){
        if(i%j ==0){bucket+=j;}

         }        if(bucket==i){
        System.out.println(i);

    }
}
    }
}
