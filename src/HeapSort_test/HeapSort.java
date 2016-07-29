package HeapSort_test;

/**
 * Created by Administrator on 2016/7/29.
 */

public class HeapSort {
    public static void HeapAdjust(int[] a, int pos, int len){
    int j,temp = a[pos];
    for(j = 2*pos; j <= len; j *= 2){
        if(j<len && a[j]<a[j+1])
            ++j;
        if(temp >= a[j])
            break;
        a[pos] = a[j];
        pos = j;
    }
    a[pos] = temp;
}

    public static void HeapSort(int a[]){
        int length = a.length;
        int i;
        for(i = length/2; i >= 0; i--)
            HeapAdjust(a, i, length-1);
        for(i = length-1; i >= 0; i--){
            int tem = a[0];
            a[0] = a[i];
            a[i] = tem;
            HeapAdjust(a,0,i-1);
        }
    }

    public static void main(String[] args){
        int a[] = {5,4,22,9,8,16,7,6,0,1,3,2,14,27};
        int len = a.length;
        HeapSort(a);
        for(int i = 0; i < len; i++){
            System.out.println(a[i]+" ");
        }
    }
}