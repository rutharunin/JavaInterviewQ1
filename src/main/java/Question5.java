public class Question5 {
    public static void main(String[] args) {
        String word= "Hello Techtorial";
        String bucket ="";
        for (int i =word.length()-1; i>=0; i--){
            bucket+=word.charAt(i);
        }
        System.out.println(bucket);





bucket="";
        for (int i=word.length()-1; i>=0;i--){
            bucket+=word.charAt(i);

        }
        System.out.println(bucket);
    }
}