
package org.dangxuandat.mathutil.core;

public class MathUtil {

    //viết hàm toán học tính giai thừa n! = 1.2.3...n
    //quy ước: 0! = 1! = 1
    //ko có giai thừa của số âm
    //21! tràn kiểu long, long: 18 số 0
    //túm lại: hàm tính giai thừa của n = 0...20
    //Ta xài luôn kĩ thuật lập trình TDD-Test Driven Development
    //                               Test First Development
    //ta nghĩ về test, kịch bản test, bộ dữ liệu test trước khi code
    
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0..20");
//
//        if (n == 0 || n == 1)
//            return 1;
//
//        long product = 1;
//        //hehehehe
//        for (int i = 2; i <= n; i++)
//            product *= i;
//
//        return product;
//    }
           
    // y = f(x) = x^2
    //     f(5) -> 25
    
    //sure, getF(5) -> 120
    //      getF(6) -> 720
    
    public static long getFatorial(int n){
        if(n <0 || n > 20) throw new IllegalArgumentException("Number must be between 0 and 20");
        if( n == 0 || n == 1) return 1;
        return n * getFatorial(n-1);
    }
}
