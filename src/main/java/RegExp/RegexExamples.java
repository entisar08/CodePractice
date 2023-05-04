package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class RegexExamples {

    public static void main(String[]args) {
        Pattern p = Pattern.compile("\\d+");


        Matcher m = p.matcher("fg70ui89");
        int max=0;
        int temp=0;
        while(m.find()) {

              temp=parseInt(m.group());
            if(temp> max){
                max=temp;
            }
        }
        System.out.println(max);
    }
}
