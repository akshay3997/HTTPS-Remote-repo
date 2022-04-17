package com.company;
import java.util.*;
public class addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[1000001];
        for(int i=0;i<=N;i++){
            arr[i]=i;
        }
        int sum=0;
   for(int i=0;i<=N;i++){
       sum+=arr[i];
   }
        System.out.println(sum);
    }
}
