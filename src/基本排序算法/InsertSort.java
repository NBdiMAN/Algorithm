package 基本排序算法;

import java.util.Arrays;

/**
 * @author wangyang
 * @date 2020/9/20 16:32
 * @description:
 */
public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,8,4,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] insertSort(int[] arr){
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j >= 1 ; j--) {
                if(arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j -1] = temp;
                }
            }
        }

        return arr;
    }
}
