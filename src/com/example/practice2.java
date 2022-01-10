package com.example;

import java.util.Scanner;

public class practice2 {

    static void sieveOfEratothenes(int n){
        boolean prime[]=new boolean[n+1];
        for(int p=0;p*p<=n;p++){

            if(prime[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==true){
                System.out.println(i);
            }
        }
    }

    public static void main(String [] args){

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        sieveOfEratothenes(n);


    }
}
