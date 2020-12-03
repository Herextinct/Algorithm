package com.mashibing;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {

        int[] arr = {421, 240, 115, 532, 305, 430, 124};

        //��һ����Ӧ���������λ��
        int[] result = sort(arr);


        System.out.println(Arrays.toString(result));

    }

    public static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        int[] count = new int[10];

        //����д�����λ��Ϊ3������λ
        for (int i = 0; i < 3; i++) {
            int division = (int) Math.pow(10, i);
            System.out.println("λ����" + division);
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j] / division % 10;
                //��ӡ������Ԫ�صĸ�λ
                System.out.print(num + " ");

                count[num]++;
            }
            System.out.println();
            System.out.println("��ʼͰ��" + Arrays.toString(count));

            for (int m = 1; m < count.length; m++) {
                count[m] = count[m] + count[m - 1];
            }

            System.out.println("�ۼ�Ͱ��" + Arrays.toString(count));

            for (int n = arr.length - 1; n >= 0; n--) {
                int num = arr[n] / division % 10;
                result[--count[num]] = arr[n];
            }

            System.arraycopy(result, 0, arr, 0, arr.length);
            Arrays.fill(count, 0);
            //System.out.println();
            //System.out.println(Arrays.toString(count));
        }

        return result;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
