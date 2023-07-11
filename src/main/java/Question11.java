import java.util.HashMap;

public class Question11 {
    public static void main(String[] args) {
        String str1 = "Russ Arunin";
        HashMap<Character, Integer> hm1 = new HashMap();


        for (int i=0; i<str1.length();i++){

            if (!hm1.containsKey(str1.charAt(i))){hm1.put(str1.charAt(i), 1);}
            else {hm1.put(str1.charAt(i), hm1.get(str1.charAt(i))+1);}

        }
        System.out.println(hm1);
    }

}
