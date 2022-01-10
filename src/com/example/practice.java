package com.example;

import java.util.Scanner;

public class practice {

    static int checkPerfectsquare(int n, int start,int end){

        int mid=(start+end)/2;
        if(start>end){
            return -1;
        }
        if(mid*mid==n){
            return (int)mid;
        }
        else if(mid>n){
            return checkPerfectsquare(n,start,mid-1);
        }
        else {
            return checkPerfectsquare(n,mid+1,end);
        }
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(checkPerfectsquare(num,1,num));

    }
}
