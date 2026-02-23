import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {
    @Test
    void 足し算の結果を確認する() {
        Calculations calc = new Calculations();
        // 1 + 1 が 2 になるか検証
        assertEquals(2, calc.add(1, 1));
        System.out.println("検証成功！");
    }
}