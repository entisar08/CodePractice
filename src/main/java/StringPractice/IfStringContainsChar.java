package StringPractice;

public class IfStringContainsChar {
    public static void main(String[] args) {
        String str="abcdef";
        String c='x'+"";
        int isExist=0;

        if(str.indexOf(c)==-1){
            System.out.println(c+ " doesnt exist");
        }else{
            System.out.println(c+ "  exists");
        }
    }
}
