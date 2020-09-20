package 基本排序算法;

import java.util.Arrays;

/**
 * @author wangyang
 * @date 2020/9/20 16:50
 * @description:希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,8,4,5};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] shellSort(int[] arr){

        int temp = arr.length;
        int len = arr.length;
        while(true){
            temp = temp / 2;
            for (int i = 0; i < temp; i++) {
                for (int j = i + temp; j < len; j++) {
                    for (int k = j; k > i ; k -= temp) {
                        if (arr[k] < arr[k - temp]){
                            int tempNum = arr[k];
                            arr[k] = arr[k - temp];
                            arr[k - temp] = tempNum;
                        }else{
                            break;
                        }
                    }
                }
            }
            if (temp == 1){
                break;
            }
        }

        return arr;
    }
}
