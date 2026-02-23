package lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FunctionalInterfaceSampleImplTest {
    @Test
    @DisplayName("足し算の結果を確認する")
    void shouldReturnSumWhenGivingTwoNumnbersAdditional() {
        FunctionalInterfaceSampleImpl impl = new FunctionalInterfaceSampleImpl();
        int result = impl.operation(1, 3);
        
        assertEquals(4, result);
        System.out.println("FunctionalInterfaceSampleImplTest 成功！");
    }
}
