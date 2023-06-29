/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.matcha.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mathutil.mathutil.core.MathUtility;

/**
 *
 * @author Matcha
 */
public class MathUtilityAdvancedTest {
    //CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT HỒI FILL VÀO HÀM
    //DDT
    
    
    //ham trả về mảng 2 chiều, kiểu WRAPPER CLASS/OJBECT
    //mảng chứa các cặp n -> expected, ví dự 0! -> 1;  1! -> 1;
    public static Object[][] initTestData(){
        
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120}, 
                               {6, 720}   //n = 6; expected = 720
                               };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
        //kỹ thuật tham số hóa của kiểm thử, đưa test data vào hàm assertE()
        //biến đổi dữ liệu thành tham số cho tổng quát
        //PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
