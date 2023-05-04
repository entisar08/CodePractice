package StringPractice;

public class DevideStringINGroupOfLetters {

    public static void main(String[] args) {
        System.out.println(reshape(4,"abc de fghij xt"));
    }

    static String reshape(int n, String str) {

        str = str.replaceAll(" ", "");

        for (int i = n; i < str.length(); i++) {
            str = str.substring(0, i) + "\n" + str.substring(i);
            i+=n;
        }
        return str;
    }
}
