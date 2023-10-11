/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thiennguyen.mathutil.main;

import com.thiennguyen.mathutil.core.MathUtility;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        //test thu ham vua viet tinh giai thua co dung k
        //chuan bi bo data test, test case
        //#test case 1: check if getFactorial run well
        //                                  with = 0;
        //Test procedures:
        //              given n = 0
        //              invoke getFactorial( n = 0)
        
        //expected result: 1; //0! == 1????
        
        
        long expected =1; // em hi vong duoc tra ve    
        int n = 0;          //neu a dua vao n = 0
        long actual = MathUtility.getFactorial(n); // chay ham moi biet
        
        System.out.println(n + "! | expected = " + expected
                                    + " actual =" + actual);
        
        //#test case 2: check if getFactorial run well
        //                                  with = 1 ;
        //Test procedures:
        //              given n = 0
        //              invoke getFactorial( n = 1)
        
        //expected result: 1; //0! == 1????
        System.out.println(n + "! | expected = 1" 
                                    + " actual =" + MathUtility.getFactorial(1));
    }
}
