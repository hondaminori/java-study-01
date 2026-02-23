package lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.BiFunction;

public class BiFunctionSampleTest {
    @Test
    @DisplayName("足し算の結果を確認する")
    void operation_shouldReturnCorrectResult_whenAdditionIsProvided() {
        BiFunctionSample calc = new BiFunctionSample();

        BiFunction<Integer, Integer, Integer> add = (i, j) -> i + j;

        // 3 + 1 が 4 になるか検証
        assertEquals(4, calc.operation(add, 3, 1));
        System.out.println("BiFunctionSampleTest 加算 成功！");
    }
}


/*
テストメソッドの命名規則、代表的なものを二つ。

モダン王道：should + 動詞  + when + 条件
void shouldReturnSumWhenAdditionLambdaIsProvided()

BDDスタイル（Given/When/Then）
void additionLambdaGivenWhenThenReturnsSum()

実務で一番よく見る形
void executeOperation_shouldReturnSum_whenAdditionLambdaIsProvided

日本語DisplayNameとの組み合わせ
@DisplayName("加算ラムダを渡したとき合計値を返す")
@Test
void executeOperation_shouldReturnSum_whenAdditionLambdaIsProvided() {


*/


/*
四則演算全部を確認する方法として、こういうのがある。
やりすぎな感じがするが・・・

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.BiFunction;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Sample01_basicpatternTest {

    Sample01_basicpattern calc = new Sample01_basicpattern();

    @ParameterizedTest
    @MethodSource("operationProvider")
    void 四則演算を確認する(
            BiFunction<Integer, Integer, Integer> operation,
            int a,
            int b,
            int expected) {

        assertEquals(expected, calc.executeOperation(operation, a, b));
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> operationProvider() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(
                        (BiFunction<Integer, Integer, Integer>) (x, y) -> x + y, 3, 1, 4),
                org.junit.jupiter.params.provider.Arguments.of(
                        (x, y) -> x - y, 3, 1, 2),
                org.junit.jupiter.params.provider.Arguments.of(
                        (x, y) -> x * y, 3, 2, 6),
                org.junit.jupiter.params.provider.Arguments.of(
                        (x, y) -> x / y, 4, 2, 2)
        );
    }
}

*/