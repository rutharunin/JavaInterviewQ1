public class Question6 {
    public static void main(String[] args) {
        String original="HAAAAAH";
boolean isPalindrome = true;

        for (int i=0, j=original.length()-1; i<original.length()/2; i++, j--) {
            if (original.charAt(i)!=original.charAt(j)){isPalindrome=false;}
        }
        System.out.println(isPalindrome);
    }
}
