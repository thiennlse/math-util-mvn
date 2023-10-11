/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thiennguyen.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {

    // Cấu trúc test case : ID|DESC| Steps/Procedures| Expected Result| Status
    //TestCase #1 - Verify getFactorial(n=0)
    //Step:
    //              1.Given (n=0)
    //              2.Call getFactorial(n=0)
    //Expected 1/ 0! == 1 ??
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    //TestCase #2 - Verify getFactorial(n=1)
    //Step:
    //              1.Given (n=1)
    //              2.Call getFactorial(n=1)
    //Expected 1/ 1! == 1 ??
    @Test
    public void verifyFactorialGivenRightArgument1ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    //TestCase #3 - Verify getFactorial(n=5)
    //Step:
    //              1.Given (n=5)
    //              2.Call getFactorial(n=5)
    //Expected 120/ 5! == 120 ??
    @Test
    public void verifyFactorialGivenRightArgument5ReturnOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
