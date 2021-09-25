package com.dkd.misc;

public class CommonChild {
    public static void main(String[] args) {
        String s1="SHINCHAN";
        String s2="NOHARAAA";
       int res= findCommonChild(s1.toCharArray(),s2.toCharArray(),s1.length());
        System.out.println(res);
    }
    public static int findCommonChild(char[]X,char[] Y,int n){
        int [] memo= new int[n+1];
        for(int i=1;i<=n;i++){
            int prev=0;
            for(int j=1;j<=n;j++){
                int temp=memo[j];
                if(X[i-1]==Y[j-1]){
                    memo[j]=prev+1;
                }else{
                    memo[j]=Math.max(memo[j],memo[j-1]);
                }
                prev=temp;
            }
        }
        return memo[n];
    }
}
