package 基本排序算法;

import java.util.Arrays;

/**
 * @author wangyang
 * @date 2020/9/20 16:39
 * @description:选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,8,4,5};
        selectSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] selectSort1(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }
}
