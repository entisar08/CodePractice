package ArrayPractice;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr={1};

        moveZeroes(arr);


    }

    public static void moveZeroes(int[] nums) {

        int ptr1=0;
        int ptr2=1;

       while (ptr2< nums.length){
           if(nums[ptr1]!=0&&nums[ptr2]!=0){
               ptr1++;
               ptr2++;
           } else if (nums[ptr1]==0&&nums[ptr2]!=0) {

               nums[ptr1]=nums[ptr2];
               nums[ptr2]=0;
               ptr1++;
               ptr2++;

           }else if (nums[ptr1]!=0&&nums[ptr2]==0) {
               ptr1++;
               ptr2++;

           }else{
               ptr2++;
           }

       }
        System.out.println(Arrays.toString(nums));

    }


    public void moveZeroes1(int[] nums) {
        int a=0;


        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0 ){
                nums[a]=nums[i];
                a++;
            }
        }

        for(int j =a;j<nums.length;j++){
            nums[j]=0;
        }

    }

}
