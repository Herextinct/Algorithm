package com.mashibing;

import java.util.Arrays;

public class CountSort {
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9};
		
		int[] result = sort(arr);
		
		System.out.println(Arrays.toString(result));
		
	}

	public static int[] sort(int[] arr) {
		int[] result = new int[arr.length];
		
		int[] count = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		System.out.println(Arrays.toString(count));
		
//		for(int i=0, j=0; i<count.length; i++) {
//			
//			while(count[i]-- > 0) result[j++] = i;
//		}
		/**
		 * [3, 2, 2, 1, 2, 2, 1, 2, 1, 2]       					原始count数组
		 * [3, 5, 7, 8, 10, 12, 13, 15, 16, 18]   					累加后count数组
		 * [0, 0, 0, 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9]   最后输出结果
		 * 累加数组的意义是：每一位的值表示对应index下标的最后一个位置，
		 * 即3表示排好序的结果数组中，最后一个0所在第3个位置, 即index=2；
		 * 	5表示排好序的结果数组中，最后一个1所在第5个位置, 即index=4；
		 *	...
		 *	18表示，最后一个9所在第18个位置，即index=17;
		 */
		for(int i=1; i<count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		
		System.out.println(Arrays.toString(count));
		/**
		 * 对原来的数组arr倒叙排列，最后把每一个拿到的值对应的累加数组里面，
		 * 找到应该有的位置，直接往相应的位置放
		 */
		for(int i=arr.length-1;i>=0; i--) {
			result[--count[arr[i]]] = arr[i];
		}
		
		return result;
	}
	
	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	
}
