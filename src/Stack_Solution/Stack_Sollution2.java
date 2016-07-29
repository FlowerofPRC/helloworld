package Stack_Solution;

import java.util.Stack;

/**
 * Created by Administrator on 2016/7/28.
 */
public class Stack_Sollution2 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={4,3,5,1,2};
        Stack_Sollution2 test=new Stack_Sollution2();
        System.out.println(test.isPopOrder(array1, array2));
    }
    public boolean isPopOrder(int[] line1,int[] line2){
        if(line1==null||line2==null){
            return false;
        }
        int point1=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<line2.length;i++){
            if(!stack.isEmpty()&&stack.peek()==line2[i]){
                stack.pop();
            }else{
                if(point1==line1.length){
                    return false;
                }else{
                    do{
                        stack.push(line1[point1++]);
                    }while(stack.peek()!=line2[i]&&point1!=line1.length);
                    if(stack.peek()==line2[i])
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return true;
    }
}