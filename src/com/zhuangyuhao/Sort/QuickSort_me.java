package com.zhuangyuhao.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-11-04
 * Time: 下午 12:33
 */
public class QuickSort_me {
    public static void main(String[] args) {
//        int[] arr = {7, 3, 2, 8, 1, 9, 5, 4, 6, 10, 6};
        int[] arr = {4, 6};
        sort(arr, 0, arr.length - 1);

        print(arr);
    }

    public static void sort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) return;
        int mid = partition(arr, leftBound, rightBound);    //mid是分区后轴的位置
        sort(arr, leftBound, mid-1);
        sort(arr, mid+1, rightBound);

    }

    static int partition(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound]; //轴:数组最右边的值
        int left = leftBound;
        int right = rightBound - 1;  //数组右边第二个是右指针

        while (left <= right) {
            //只要左指针的值小于等于轴，则左指针一直往右挪。
            //限制左指针不能移动到轴的位置: left< right
            while (left <= right && arr[left] <= pivot) left++;
            while (left <= right && arr[right] > pivot) right--; //限制住右指针不能移动到第一位（左指针位置），left< right

            System.out.println("before swap: left->" + left + " right->" + right);

            if (left < right) swap(arr, left, right);    //交换

//            System.out.print("--");
//            print(arr);
//            System.out.println();
        }

        swap(arr, left, rightBound);    //放轴的位置
        return left;    //返回轴的位置
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
