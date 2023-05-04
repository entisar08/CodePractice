package StringPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueCaracters {

    public static void main(String[] args) {
        String str = "jpatFrgdjtpdf";
        //how to split this string using stream
        //Set<Character> set=new HashSet<>()

       // System.out.println(Stream.of(str.split("")).collect(Collectors.toSet()));
       System.out.println(Unique(str));
    }

    private static Set<String> uniqueSet(String str) {
        Set<Character> setOfChars=new HashSet<>();

       return null;



    }

    private static String Unique(String str) {
        String uniqueLetters = "";
        for (int i = 0; i <str.length() ; i++) {
            Character c=str.charAt(i);
            if (!uniqueLetters.contains(c+"")){
                uniqueLetters+=c;
            }
        }
        return uniqueLetters;
    }
}
