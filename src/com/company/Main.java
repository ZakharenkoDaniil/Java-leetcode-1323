package com.company;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximum69Number(9));
    }
}

class Solution {
    public int maximum69Number (int num) {
        int r = 1, num1 = num, idx = -1;
        while(num1!=0)
        {
            if(num1%10 == 6)
            {
                idx = r;
            }
            num1 /= 10;
            r++;
        }
        if(idx>-1) {
            num = num+3*(int)Math.pow(10, idx-1);
        }
        return num;
    }
}
