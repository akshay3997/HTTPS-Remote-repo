package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Ans=0;
        int N=sc.nextInt();

        while (N > 0) {
            int digit = N % 10;
            Ans += digit;
            N = N / 10;
        }
        System.out.println(Ans);
int temp=0;
        for(int i=2;i<Ans-1;i++) {
            if (Ans % i == 0) {
                temp++;
            }
        }
if(temp>0){
    System.out.println("Not Prime Number");
}
else{
    System.out.println("Prime Number");
}
        }

    }

