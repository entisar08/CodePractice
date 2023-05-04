package ArrayPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Candies {

    /*
    * arr={2,4,7,1}  2
    * max= 12
    * 12  2 12 3 4
    *
    *
    * */

    public static void main(String[] args) {
        int[] arr={12,1,12};
        boolean[] arrBolean= new boolean[arr.length];
        int extra=10;
        int maxarr=Arrays.stream(arr)
                .max()
                .getAsInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+extra;
            if(arr[i]>= maxarr){
                arrBolean[i]=true;
            }

        }

        System.out.println("arrBolean = " + Arrays.toString(arrBolean));


    }

    public boolean[]  kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] arrBolean = new boolean[candies.length];
        int maxarr = Arrays.stream(candies)
                .max()
                .getAsInt();
        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if (candies[i] >= maxarr) {
                arrBolean[i] = true;
            }
        }
        return arrBolean;
    }

}
