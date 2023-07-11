public class Question14 {
    public static void main(String[] args) {
boolean isAPerfectNumber =false;
        int num1 =6;
        int bucket =1;
        for (int i=2; i<=num1/2; i++){
            if(num1%i==0){
                bucket+=i;
                }
            }if (bucket==num1){isAPerfectNumber=true;}
        System.out.println(isAPerfectNumber);
        }

    }

