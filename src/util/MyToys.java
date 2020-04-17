/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Dell
 */
public class MyToys {
    // cF : compute Factorial, tinh giai thua
   // class tiện ích dành cho mọi dự án nên dùng statuc
    // dành cho CI
    public static long cF(int n){
        if(n < 0 || n> 15)
            throw new IllegalArgumentException("n must be between 0..15");
        if (n == 0 || n == 1) {
            return 1;
        }
//        long product = 1; // biến nhân dồn, accumulation: biến tích lũy
//        for(int i = 1 ; i <= n;i++){
//            product *= i;
//        }

        return n * cF(n - 1);
// dùng đệ quy => update code
        
    }
}
