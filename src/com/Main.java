package com;

import java.util.Scanner;

/**
 * @author 王峥
 * @date 2020/8/6 7:12 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int i=0, k=0;
        while(cin.hasNextInt())
        {
            i = cin.nextInt();
            k = cin.nextInt();
            break;
        }
        int count=0;
        for (int j = i; j < k; j++) {
            if (!huiwen(j)) {
                count++;
            }

        }
        System.out.println(count);

    }
    public static boolean huiwen(int n) {
        if (n<=0) {
            return false;
        }
        if (n % 10 == 0) {
            return false;
        }
        int number=0;
        for (number=0; number<n; number=number*10+n%10,n/=10) {
            if (n==number||n==number/10) {
                return true;
            }
        }
        return false;
    }


}
