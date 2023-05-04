import java.util.*;

public class StringToArrayList {


    public static void main(String[] args) {


        String str="pwwkae";
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {

            chars.add(ch);
        }

        Set<Character> hashset=new LinkedHashSet<>(chars);

        System.out.println(hashset);
        // return the List










    }
    }

