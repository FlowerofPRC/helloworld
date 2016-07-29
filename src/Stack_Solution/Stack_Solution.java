package Stack_Solution;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2016/7/28.
 */

public class Stack_Solution {
    public static void main(String[] args){
        boolean result;
        int[] a = {1,2,3,4,5};
        int[] b = {4,3,5,1,2};
        result = IsPopOrder(a,b);
        System.out.println("***********result = "+ result +"***********");
    }

    public static boolean IsPopOrder(int [] pushA,int[] popA)
    {
        Stack<Integer> stack = new Stack();
        if( pushA.length == 0 && popA.length == 0 )
            return false;
        for( int i=0,j=0; i < pushA.length; i++ ){
            stack.push( pushA[i] );
            while( ( !stack.empty() )&& ( stack.peek() == popA[j] ) ){
                stack.pop();
                j ++;
            }
        }

        return stack.empty() == true;
    }
}


