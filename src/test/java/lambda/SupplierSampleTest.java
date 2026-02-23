package lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

public class SupplierSampleTest {
    @Test
    @DisplayName("Supplierを使った遅延実行の確認 その１")
    void printIfNeeded_shouldOnlyInvokeSupplierWhenFlagIsTrue() {
        SupplierSample supplierSample = new SupplierSample();

        String result = supplierSample.printIfNeeded(true, () -> "message");

        // flagがtrueの場合、Supplierのget()が呼び出されることを確認
        assertEquals("message", result);
        System.out.println("SupplierSampleTest 遅延実行版 成功！");   
    }

    @Test
    @DisplayName("Supplierを使った遅延実行の確認 その２")
    void printIfNeeded_notInvokeSupplierWhenFlagIsFalse() {
        SupplierSample supplierSample = new SupplierSample();

        String result = supplierSample.printIfNeeded(false, () -> "message");

        // flagがfalseの場合、Supplierのget()が呼び出されないことを確認
        assertEquals("", result);
        System.out.println("SupplierSampleTest 実行されない版 成功！");  
    } 
}
