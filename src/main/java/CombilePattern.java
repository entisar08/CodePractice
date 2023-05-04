import java.util.regex.*;

public class CombilePattern {

    public static void main(String[] args) {



        Pattern pattern = Pattern.compile(".xx.");//here we give the pattern as regex
        Matcher matcher = pattern.matcher("AXXB");//her we test our data if it matches the given pattern
        System.out.println("ma = " + matcher.matches());

        System.out.println(pattern.matches(".xx.","AXXB"));
    }
}
