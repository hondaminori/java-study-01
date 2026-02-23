package lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LambdaAndLocalVariableTest {
    @Test
    @DisplayName("ローカル変数をラムダ式の中で使えることを確認する")
    void ShouldContainLocalVariableInLambda() {
        LambdaAndLocalVariable lambdaAndLocalVariable = new LambdaAndLocalVariable();
        int result = lambdaAndLocalVariable.add(5, 15);
        assertEquals(30, result);
        System.out.println("FunctionalInterfaceSampleImplTest 成功！");
    }
}
