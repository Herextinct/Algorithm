package com.zhuangyuhao.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-10-26
 * Time: 下午 2:10
 */
public class ShellSort_me {

    public static void main(String[] args) {
        int[] a = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {
        //就算数组Knuth序列最大的h
        int h = 1;
        while (h <= a.length / 3) {
            h = h * 3 + 1;
        }

        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < a.length; i++) {    //选一个元素a[gap]
                for (int j = i; j > 0 && a[j] < a[j - 1]; j -= gap) {
                    //把该元素和它间隔gap的之前的元素做比较，
                    // 如果元素值小于之前的值，那么交换位置
                    swap(a, j, j - 1);
                }
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
