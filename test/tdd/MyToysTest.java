/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;

/**
 *
 * @author Dell
 */
public class MyToysTest {

    public MyToysTest() {
        // chỗ này dùng để test các hàm mình viết
        // mỗi hàm ta test ta cần chuẩn bị sẵn dữ liêu
        //xem kq xử lí, và so sánh xem đúng kỳ vọng k
        //hay sai ở code

    }

    // tinh huong CF method runs correctly
    @Test // Annotation convert any methods to public static method in main
    public void testSuccessfulCases() {
        assertEquals(1, cF(0)); // it compare color with result
        assertEquals(2, cF(1));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCases() {
        cF(-5);
    }
    
    //Ant không check đc lỗi Logic => Hãy dạy cho 
    //Ant biết phải có màu xanh của JUnit mới ra đc
    //file .jar
    
    //Ant không thông minh, chỉ biết làm theo nhunwngx gì nó đc chỉ để làm
    // trong file build-impl.xml ( kịch bản để Ant compile and build)
    
    // => Phải độ lại cái file xml này, độ ở dòng 1005 NetBean 8 , 1024 ở NetBean 11)
    
    //Cấu hình Jenkins chơi đc với Git lấy code, Ant để biên dịch, đóng gói
    // JDK để run
    // GG mail để email
}
