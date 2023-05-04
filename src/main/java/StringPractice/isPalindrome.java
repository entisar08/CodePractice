package StringPractice;

import java.util.List;
import java.util.Stack;

public class isPalindrome {

    public static void main(String[] args) {

        String str="cydeo";
        String str2="";
        List<String> stack=new Stack<>();

        for (int i = str.length()-1; i >= 0; i--) {
            Character c=str.charAt(i);
            str2+=c+"";
        }
         Boolean isPalind=str.equals(str2)? true:false;

        System.out.println("isPalindrome = " + isPalind);
        System.out.println(isPalindrome(str));



    }


    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s)

                .reverse()

                .toString());
    }
}
