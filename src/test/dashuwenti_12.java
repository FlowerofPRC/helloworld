package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2016/7/24.
 */
//法一：利用整型数组来处理大数
//public class dashuwenti_12 {
//    public static void main(String[] args) {
//        dashuwenti_12 p12=new dashuwenti_12();
//        p12.printToMaxOfNDigits(3);
//    }
//    public void printToMaxOfNDigits(int n){
//        int[] array=new int[n];
//        if(n<=0)
//            return;
//        printArray(array,0);
//    }
//    private void printArray(int[] array,int n){
//        for(int i=0;i<10;i++){
//            if(n!=array.length){
//                array[n]=i;
//                printArray(array, n+1);
//            }else{
//                boolean isFirstNo0=false;
//                for(int j=0;j<array.length;j++){
//                    if(array[j]!=0){
//                        System.out.print(array[j]);
//                        if(!isFirstNo0)
//                            isFirstNo0=true;
//                    }else{
//                        if(isFirstNo0)
//                            System.out.print(array[j]);
//                    }
//                }
//                System.out.println();
//                return;
//            }
//        }
//    }
//}


//法二：利用字符数组来处理大数
public class dashuwenti_12 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        printToMaxOfNDigits2(3);
    }
    public static void printToMaxOfNDigits2(int n){
        if (n<=0)
            return;
        char [] number =new char[n];
        pring1ToMaxOfNDigitsRecursively(number,n,0);
    }
    public static void pring1ToMaxOfNDigitsRecursively(char[] number,int length,int index) {
        if (index==length-1) {
            for (int i = 0; i < 10; i++) {
                number[index]=(char) (i+'0');
                printNumber(number);
            }
        }else {
            for (int i = 0; i < 10; i++) {
                number[index]=(char) (i+'0');
                pring1ToMaxOfNDigitsRecursively(number, length, index+1);
            }
        }
    }
    public static void printNumber(char[] number){
        boolean isBeginning0=true;
        int nLength=number.length;
        for (int i = 0; i < nLength; i++) {
            if (isBeginning0 && number[i]!='0') {
                isBeginning0=false;
            }
            if (!isBeginning0) {
                System.out.print(number[i]);
            }
        }
        if (!isBeginning0){
            System.out.println();
        }
    }
}
