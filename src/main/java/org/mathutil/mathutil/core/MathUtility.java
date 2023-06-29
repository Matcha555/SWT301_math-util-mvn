/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mathutil.mathutil.core;

/**
 *
 * @author Matcha
 */

//ta se clone cai class java.util.Math cua JDK ma ben trong no chua cac ham 

public class MathUtility {
    public static final double PI = 3.1415;
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0..20, please.");
//        if(n==0 || n==1) return 1;
//        long product = 1; //tích nhân dồn 1 2 3 4 5 ...
//        for(int i = 2; i <= n; i++) product *= i;
//        return product;
//
//    }
    
    public static long getFactorial(int n){
        
        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0..20, please.");
        
        if(n==0 || n==1) return 1;
        
        return n * getFactorial(n - 1);

    }
}
