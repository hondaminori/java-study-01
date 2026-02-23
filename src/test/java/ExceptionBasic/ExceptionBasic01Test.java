package ExceptionBasic;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exception_sample.ExceptionBasic01;

public class ExceptionBasic01Test {
    @Test
    @DisplayName("ExceptionBasic01クラスのdivisionOrException02メソッドのテスト")
    void testDivisionOrException02_shouldThrowIllegalArgumentException_whenDividedByZero() {
        ExceptionBasic01 exceptionBasic01 = new ExceptionBasic01();
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            exceptionBasic01.divisionOrException02(10, 0);
        });

        String expectedMessage = "引数が0未満";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        System.out.println("ExceptionBasic01Test 成功！");
    }
}
