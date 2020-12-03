package com.zhuangyuhao.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description: 在一个有序数组中，找某个数是否存在
 * User: Administrator
 * Date: 2020-12-03
 * Time: 下午 7:01
 */
public class BSExist_me {

    public static boolean exist(int[] sortedArr, int num){
        if(sortedArr == null || sortedArr.length == 0){
            return false;
        }
        int L = 0;
        int R = sortedArr.length -1;
        int mid;
        while (L < R){  //至少有两个数
            mid = L + ((R-L) >> 1);
            if(sortedArr[mid] == num){
                return true;
            }else if(sortedArr[mid] > num){
                R = mid -1;
            }else {
                L = mid +1;
            }
        }
        return sortedArr[L] == num;
    }
}
