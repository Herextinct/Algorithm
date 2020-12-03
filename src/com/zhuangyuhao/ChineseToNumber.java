package com.zhuangyuhao;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-11-22
 * Time: 下午 3:12
 */
public class ChineseToNumber {
    public static void main(String[] args) {
        //定义数字对应的汉字
        final String[] word_list = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};
        //定义数字位数所对应的权
        final String[] position = {"", "十", "百", "千", "万"};
        //初始化一个输出结果
        StringBuffer sb = new StringBuffer();
        //定义控制台输入
        Scanner sc = new Scanner(System.in);
        //接收控制台输入
        int i = sc.nextInt();
        //将接收的数字转换为char数组
        char[] a = String.valueOf(i).toCharArray();
        //初始化数字位置
        int index = a.length - 1;
        //遍历char数组为char
        for (int c : a) {
            //添加char数组所对应的数字汉字
            sb.append(word_list[c - 48]);
            //逻辑判断万位以上的数字位置
            if (index > 4) {
                index = index == 0 ? 4 : index;
                sb.append(position[index % 4]);
            } else {
                sb.append(position[index]);
            }
            //降低数字的位置
            index--;
        }
        //输出数字对应的汉字结果
        System.out.println("输出结果:" + sb);

    }
}
