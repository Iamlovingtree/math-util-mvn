/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.quyndc.mathutil.core;

/**
 *
 * @author ACER NITRO FPT
 */
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //hàm này tính n! = 1.2.3...n
    //Thiết kế như sau
    //0! = 1! = 1
    //KO có âm giai thừa --> -1!, -2! --> ko trả về, ném ngoại lệ
    //Vì giai thừa tăng nhanh nên 20 giai thừa là đủ cho kiểu long 21! ko chứa nổi --> đưa n > 20 --> exception
    
//    public static long getFactorio(int n){
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n, n must be between 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1;
//        
//        long product = 1;
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        return product;    
//    }
       
    public static long getFactorio(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n, n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        return n * getFactorio(n - 1);    
    }
}
