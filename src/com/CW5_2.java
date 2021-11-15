package com;

/**
 * @author Yifei.Hu
 * @create 2021-10--14:38
 */
public class CW5_2 {
    public static void main(String[] args) {
        System.out.println(calcNetIncome("salary 15000yuan bonus2000 rent -1000Y"));
    }

    public static int calcNetIncome(String input) {
        int total = 0;
        char[] c = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])||c[i] =='-') {
                int start = i;
                int end = i + 1;
                while (true) {
                    end = i + 1;
                    if (!( i!=c.length - 1)||!Character.isDigit(c[i+1] )) {
                        break;
                    }
                    i++;
                }
                String sb= new String(c,start,end-start);
                total += Integer.parseInt(sb);
            }
        }
        return total;
    }
}
