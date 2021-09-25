package com.dkd.misc;

public class Fibo {
    public static void main(String[] args) {
        int n=5;
        int res=0;
        int prev=1;
        int prevOfPrev=0;
        System.out.print(res+" ");
        System.out.print(prev+" ");
        for(int i=2;i<=n;i++){
            res=prevOfPrev+prev;
            prevOfPrev=prev;
            prev=res;
            System.out.print(res+" ");
        }
        System.out.println("\n");
        System.out.println(fibo(new int[6],5));
    }
    private static int fibo(int [] mem,int n){
      if(mem[n]==0){
          if(n<2){
              mem[n]=n;
          }else {
              int left=fibo(mem,n-1);
              int right=fibo(mem,n-2);
              mem[n]=left+right;
          }
      }
      return mem[n];
    }
}
