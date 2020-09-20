package 基本排序算法;

import java.util.Arrays;

/**
 * @author wangyang
 * @date 2020/9/20 22:06
 * @description:归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {1,5,3,6,8,4,5};
        int newArr[] = new int[arr.length];
        mergeSort(arr,0,arr.length - 1,newArr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int height,int[] newArr) {
        if(low >= height){
            return;
        }
        int mid = (low + height) / 2;
        mergeSort(arr,low,mid,newArr);
        mergeSort(arr,mid+1,height,newArr);
        meegeLeftAndRight(arr,low,mid,height,newArr);
    }

    private static void meegeLeftAndRight(int[] arr, int low, int mid,int height, int[] newArr) {
        int i = low;
        int j = mid;
        int k = mid + 1;
        int l = height;
        int m = 0;
        while(i <= j && k <= l){
            if(arr[i] < arr[k]){
                newArr[m++] = arr[i];
                i++;
            }else{
                newArr[m++] = arr[k];
                k++;
            }
        }
        while (i <= j){
            newArr[m++] = arr[i];
            i++;
        }
        while (k <= l){
            newArr[m++] = arr[k];
            k++;
        }
        for (int n = 0; n < m; n++) {
            arr[low + n] = newArr[n];

        }
    }
}
