import java.util.ArrayList;
import java.util.Arrays;

public class Question9 {
    public static void main(String[] args) {
        ArrayList aList= new ArrayList();
//        ArrayList aList=Arrays.asList("John", "Jane", "James", "Jasmine", "Jane", "James");
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        for (int i=0; i<aList.size();i++){
            for (int j=i+1; j<aList.size();j++){
                if (aList.get(i).equals(aList.get(j))){aList.remove(j);}
            }

        }
        System.out.println(aList);
    }
}
