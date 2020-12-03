package com.zhuangyuhao.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-03
 * Time: 下午 5:46
 */
public class SelectionSort_me {

    public static void selectionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        for (int i=0; i<arr.length; i++){
            int minIndex = i;   //最小值下标
            for (int j=i+1; j<arr.length; j++){ // i ~ N-1 上找最小值的下标
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
