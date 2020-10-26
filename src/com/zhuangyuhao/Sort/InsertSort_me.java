package com.zhuangyuhao.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description: 插入算法
 * <p>
 * User: Administrator
 * Date: 2020-10-26
 * Time: 上午 11:58
 */
public class InsertSort_me {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {    //选一个元素a[i]，至少是从第二位开始
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                //把该元素和它之前的元素都做比较，如果元素值小于之前的值，那么交换位置
                swap(a, j, j - 1);
            }
        }
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
