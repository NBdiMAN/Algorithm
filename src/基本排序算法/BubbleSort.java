package 基本排序算法;

import java.util.Arrays;

/**
 * @author wangyang
 * @date 2020/9/20 15:38
 * @description:冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,8,4,5};
        superBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bubbleSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                }
            }
        }
        return arr;
    }
    private static int[] superBubbleSort(int[] arr){
        int len = arr.length;
        boolean sort;
        for (int i = 0; i < len - 1; i++) {
            sort = false;
            for (int j = i + 1; j < len; j++) {
                if(arr[j - 1] > arr[j]){
                    System.out.println("交换///");
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                    sort = true;
                }
            }
            if(!sort){
                System.out.println(i + "退出");
                break;
            }
        }
        return arr;
    }

}
