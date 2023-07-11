public class Question3 {
    public static void main(String[] args) {
        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String replaced=given.replaceAll( "[^A-Za-z]" , "" );
        System.out.println(replaced);
        System.out.println(replaced.length());
    }
}
