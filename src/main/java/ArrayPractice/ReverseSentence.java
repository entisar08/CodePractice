package ArrayPractice;

import java.util.Stack;

public class ReverseSentence {

    public static void main(String[] args) {
        Stack stack=new Stack<>();
        String result="";
        String str="I Love Texas";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            System.out.println(stack);
        }
        System.out.println(stack.size());


        while(!stack.empty()){
            result+=stack.pop();
            System.out.println(result);
        }
        /*for (int i = 0; i <= stack.size(); i++) {
            result+=stack.pop();
            System.out.println(result);
        }
*/
        System.out.println(result);
    }
}
