package com.dkd.matrix;

import java.util.Arrays;

public class SpiralOrderTraversal {
    public static void main(String[] args) {
        int [] [] matrix = new int[4][4];
        int data=1;
      for (int i=0;i<4;i++){
          for(int j=0;j<4;j++){
              matrix[i][j]=data++;
          }
      }
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));
      printSpiralMatrix(matrix,4,4);
    }
    public static void printSpiralMatrix(int [] [] matrix,int r,int c){
        int l=0,k=0;
        while(k<r&&l<c) {
            for (int i = l; i < c; i++) {
                System.out.print(matrix[k][i]+" ");
            }
            k++;
            for (int i = k; i < r; i++) {
                System.out.print(matrix[i][c - 1]+" ");
            }
            c--;
            if (l < c) {
                for (int i = c - 1; i >= l; i--) {
                    System.out.print(matrix[r - 1][i]+" ");
                }
            }
            r--;
            if (k < r) {
                for (int i = r - 1; i >= k; i--) {
                    System.out.print(matrix[i][l]+" ");
                }
            }
            l++;
        }

    }
}

/*
1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16
r=4 k=0
c=4 l=0
 */

