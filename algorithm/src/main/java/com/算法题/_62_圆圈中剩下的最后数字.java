package com.算法题;

import java.util.ArrayList;

/**
 * 0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
 * <p>
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 * f(n,m)=(f(n-1,m)+m)%n
 */
public class _62_圆圈中剩下的最后数字 {

    public static void main(String[] args) {
        System.out.println(lastRemaining(5,3));

    }
    public static int lastRemaining2(int n, int m) {
        return n==1?0: (lastRemaining(n - 1, m) + m) % n;
    }

    public static int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }
}
