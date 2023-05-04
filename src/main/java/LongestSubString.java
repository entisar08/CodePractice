public class LongestSubString {

    public static void main(String[] args) {
        String str = "bbbbaaaab";//"pwwkew";
        System.out.println(longestSubstring(str));
    }

    public static int longestSubstring(String str) {
        String max = "";
        String newString = "";
        int j = 0;
        while (j != str.length() - 1) {
            for (int i = j; i < str.length(); i++) {
                if (!newString.contains(str.substring(i, i + 1))) {
                    newString += str.substring(i, i + 1);
                }else{
                    break;
                }
            }

            if (newString.length() > max.length()) {
                max = newString;

            }
            newString = "";
            j++;
        }
        System.out.println(max);
        return max.length();
    }
}
