/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quyndc.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.quyndc.mathutil.core.MathUtility;


public class MathUitilityTest {
    
    @Test
    public void checkFactorioGivenRightArgumentReturnWell(){
        //assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorio(1));
        assertEquals(2, MathUtility.getFactorio(2));
        assertEquals(6, MathUtility.getFactorio(3));
        assertEquals(24, MathUtility.getFactorio(4));
        assertEquals(120, MathUtility.getFactorio(5));
        assertEquals(720, MathUtility.getFactorio(6));
    }
}


// DDT (Data Driven Testing) : là kĩ thuật testing mà tách phần data ra khỏi câu lệnh assertE()

// Viết Test Case hướng về việc tách data ra riêng biệt

// Kĩ thuật viết code làm app phải viết luôn code cho các test case để đảm bảo hàm/method/class chạy ổn

// TDD : Test Driven Development : viết code và test case đan xen nhau để check hàm đúng sai

// DDT: trong quá trình viết code test, tách data ra riêng 1 chỗ cho dễ đọc, bảo trì 

// DDT nằm trong TDD


