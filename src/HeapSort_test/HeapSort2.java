package HeapSort_test;

/**
 * Created by Administrator on 2016/7/29.
 */
public class HeapSort2 {

    public static void main(String[] args){
        int a[] = {5,4,22,9,8,16,7,6,0,1,3,2,14,27};
        int len = a.length;
        HeapSort(a);
        for(int i = 0; i < len; i++){
            System.out.println(a[i]+" ");
        }
    }

    public static int leftChild(int i) {
        return 2*i+1;
    }

    public static void percDown(int a[], int i, int n) {
        int child;
        int tmp;

        for(tmp=a[i]; leftChild(i) < n; i=child) {
            child = leftChild(i);
            if(child!=n-1 && a[child]<a[child+1]) {
                child++;
            }
            if(tmp<a[child]) {
                a[i] = a[child];
            } else {
                break;
            }
        }
        a[i] = tmp;
    }

    public static void HeapSort(int[] a) {
        for(int i=a.length/2-1; i>=0; i--)
            percDown(a, i, a.length);
        for(int j=a.length-1; j>0; j--) {
            int tmp = a[0];
            a[0] = a[j];
            a[j] = tmp;
            percDown(a, 0, j);
        }
    }
}