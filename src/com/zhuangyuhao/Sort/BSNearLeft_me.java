package com.zhuangyuhao.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description: 在一个有序数组中，找>=某个数最左侧的位置
 * User: Administrator
 * Date: 2020-12-03
 * Time: 下午 7:15
 */
public class BSNearLeft_me {
    public static int nearestIndex(int[] arr, int value) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1; // 记录最左的对号
        while (L <= R) {
            int mid = L + ((R - L) >> 1);
            if(arr[mid] >= value){
                index = mid;
                R = mid -1;
            }else {
                L = mid + 1;
            }
        }
        return index;
    }
}
