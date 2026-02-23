package StreamApiSample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StreamApiSample01Test {
    @Test
    @DisplayName("StreamApiSample01クラスのテスト")
    void StreamApiSample01Test_shouldReturn3() {
        StreamApiSample01 streamApiSample01 = new StreamApiSample01();
        assertEquals(5, streamApiSample01.StreamApiSimpleSample01());
        System.out.println("StreamApiSample01Test 5を返したので成功！");
    }

    @Test
    @DisplayName("StreamApiSample01クラスのテスト")
    void StreamApiSample02Test_shouldReturn10() {
        StreamApiSample01 streamApiSample01 = new StreamApiSample01();
        assertEquals(10, streamApiSample01.StreamApiSample02());
        System.out.println("StreamApiSample02Test 10を返したので成功！");
    }
}
