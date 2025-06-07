package com.tp.questions;

import java.util.Arrays;

public class RotateMat {

    public static void main(String[] args) {
        int[][] mat = {
                {2, 5},
                {1, 9}
        };

        int len=mat.length;
        int[][] res=new int[len][len];
        for(int i=0;i<len;i++){
            for (int j=0;j<len;j++){
                res[i][j]=mat[j][i];
            }
        }

        for(int[] a:res){
            System.out.println(Arrays.toString(a));
        }
    }
}
