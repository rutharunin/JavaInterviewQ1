public class Question3Extra {
    public static void main(String[] args) {
        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String myTake ="";
        for (int i=0; i<given.length(); i++){
            if((given.charAt(i)>='A' && given.charAt(i)<='Z')||(given.charAt(i)>='a' && given.charAt(i)<='z')){myTake+=given.charAt(i);
            }

        }System.out.println(myTake.length());
    }
}
