package com.syntax.Replits;
/*Create the maxValue method that will accept int array and return return the maximum value in the array.

        Method should visible every class in any package!

 */


public class Replit141AccessModifier {
    public static void main(String[] args) {
        int[]arr={5,12,-3,7,3,22};
        System.out.println(maxValue(arr));//should print 22
    }
    public static int maxValue(int[]myArr){
        int max=myArr[0];
        for (int i:myArr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
