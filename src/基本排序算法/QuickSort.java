package 基本排序算法;

import java.util.Arrays;

/**
 * @author wangyang
 * @date 2020/9/20 21:33
 * @description:快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,8,4,5};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int height) {
        if(low >= height){
            return;
        }
        int flag = arr[low];
        int i = low;
        int j = height;
        while(i < j){
            while(i < j && arr[j] >= flag){
                j--;
            }
            if(i < j){
                arr[i] = arr[j];
                i++;
            }

            while (i < j && arr[i] <= flag){
                i++;
            }

            if (i < j){
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = flag;
        quickSort(arr,low,i - 1);
        quickSort(arr, i + 1,height);

    }
}
