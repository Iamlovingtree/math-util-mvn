/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quyndc.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.quyndc.mathutil.core.MathUtility.*;

/**
 *
 * @author ACER NITRO FPT
 */
public class MathUtilityAdvancedTest {
    
    //Hàm trả về mảng 2 chiều gồm nhiều dòng, 2 cột
    // 0 --> 1
    // 1 --> 1
    // 2 --> 2
    // 6 --> 720
    // Mảng 2 chiều cột 0 là n, cột 1 là expected
    // n --> expected
    public static Object[][] initTestData(){
        
        Object testData[][] = {{1, 0}, 
                               {1, 1}, 
                               {2, 2}, 
                               {24, 4}, 
                               {120, 5}
                              }; //khai báo mảng
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorioGivenRightArgumentReturnWell(long expected, int n){
                                                        //cột 0,         cột 1 
        assertEquals(expected, getFactorio(n));     
    }
}

// Bất ngoại lệ thì sao, tức là hàm getF() trả về ngoại lệ khi cho n = -1, -2, > 20
// JUnit đưa ra hàm mới, AssertThrows()
// Hàm này xài Lambda Expression

// DDT (Data Driven Testing) : là kĩ thuật testing mà tách phần data ra khỏi câu lệnh assertE()
                            // Việc viết code test đc tách riêng ra khỏi việc test data, nghĩa là dữ
                            //     liệu test thường đc đặt ở mảng 2 chiều hoặc để ở table, excel
                            // Việc data tách riêng ra, sau đó fill lại hàm so sánh quy tên biến thì DDT CÒN ĐC GỌI LÀ PARAMETERIZED TESTING
// Viết Test Case hướng về việc tách data ra riêng biệt

// Kĩ thuật viết code làm app phải viết luôn code cho các test case để đảm bảo hàm/method/class chạy ổn

// TDD : Test Driven Development : viết code và test case đan xen nhau để check hàm đúng sai
                                // Lập trình mà viết code và code test đan xen nhau thì gọi là TDD
                                // LẬP TRÌNH HƯỚNG THEO VIỆC KIỂM THỬ NGAY CODE

// DDT: trong quá trình viết code test, tách data ra riêng 1 chỗ cho dễ đọc, bảo trì 

// DDT nằm trong TDD







