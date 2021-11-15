package com;

/**
 * @author Yifei.Hu
 * @create 2021-10--00:34
 */
public class CW_4_1 {
    public static void main(String[] args) {
        CW_4_1.bandMatrix(5, 2);
    }


    public static void bandMatrix(int n, int width) {
        String[][] ints = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ints[i][j] = "0";
            }
        }



        for (int i = 0, j = 0; i < n; i++, j++) {
            ints[i][j] = "*";


            for (int k = j; k < width+j+1; k++) {
                if (k < n) {
                    ints[i][k]="*";
                }
            }


            for (int k = j; k>j-width-1;k--) {
                if (k >0) {
                    ints[i][k]="*";
                }
            }


            for (int k = i; k < width+i+1; k++) {
                if (k < n) {
                    ints[k][j]="*";
                }
            }


            for (int k = i; k>i-width-1;k--) {
                if (k >0) {
                    ints[k][i]="*";
                }
            }




        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[i][j]);
                if(j!=n-1){
                    System.out.print("  ");
                }
            }
            if(i!=n-1){
                System.out.println();
            }
        }
    }
}
