package com.zhuangyuhao.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-03
 * Time: 下午 6:12
 */
public class BubbleSort_me {

    public static void bubblesort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ N-1
        // 0 ~ N-2
        // 0 ~ N-3
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
