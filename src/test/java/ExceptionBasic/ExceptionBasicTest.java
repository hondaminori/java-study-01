package ExceptionBasic;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exception_sample.ExceptionBasic;

public class ExceptionBasicTest {
    @Test
    @DisplayName("ExceptionBasicクラスのdivisionOrExceptionメソッドのテスト")
    public void testDivisionOrException_shouldReturnMinusOneWhenDividedByZero() {
        ExceptionBasic exceptionBasic = new ExceptionBasic();
        
        int result = exceptionBasic.divisionOrException(10, 0);

        assert(result == -1);
        System.out.println("ExceptionBasicTest 成功！");
    }
    
    /*
    以下のケースはassertDoesNotThrowを使いたかったから書いた、やってみたかっただけのテスト。
    仕様でゼロ徐算は -1 を返すことが決まっているので、このテストは意図が間違っている。
    */
    @Test
    @DisplayName("ExceptionBasicクラスのdivisionOrExceptionメソッドのテスト（ラムダ式Ver）")
    public void testDivisionOrException_shouldThrowArithmeticException_lambda() {
        ExceptionBasic exceptionBasic = new ExceptionBasic();
        
        assertDoesNotThrow(() -> {
            exceptionBasic.divisionOrException(10,0);
        });
        System.out.println("ExceptionBasicTest エラーが返ってこないことの検証成功！");
    }
}   
