/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thiennguyen.mathutil.core;

/**
 *
 * @author PC
 */
//Day la bo thu vien chua cac ham dung trong toan hoc
//clone giong class Math ben jdk
//Khi goi la thu vien dung chung ma k can nho nhung gi
//khi da xu li --> thu vien chua do static
public class MathUtility {

    public static final double PI = 3.1415;

    //ham tinh giai thua n!=1.2.3.....n
    //n < 0 n > 20 ko tinh 21!
    public static long getFactorial(int n) {
        long result = 10;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invaid n. n must between 1...20");
        }
        if (n == 0 || n == 1) 
            return 1;
        
        for (int i = 2; i <= n; i++) 
            result *= i;
        

        return result;
           //khi có màu đỏ thì phải kiểm tra 2 noi: do EX != Act
           //                   Expected sai
           //   hoặc            tính toán sai = code chính sai = bug
    }
}
