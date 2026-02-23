package StreamApiSample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiSample01 {
    public long StreamApiSimpleSample01() {
        List<Integer> list = Arrays.asList(8, 4, 1, 10, 4, 2, 5, 6, 9, 4);
        long count = list.stream()
                .filter(x -> x % 2 == 0) // filterはPredicateを引数に取る。偶数だけを残す
                .distinct()
                .count();
        System.out.println("偶数かつ重複を除いた数の個数は " + count);
        return count;
    }

    public long StreamApiSample02() {
        List<Integer> list = Arrays.asList(8, 4, 1, 10, 4, 2, 5, 6, 9, 4);
        // メソッド参照を使ってみたかっただけ
        list.stream()
            .forEach(System.out::println);
        return list.size();
    }

    public void StreamSample03() {
        // ofは順次ストリームを返すファクトリーメソッド
        Stream.of(8, 4, 1, 10, 4, 2, 5, 6, 9, 4)
            .forEach(System.out::println);
    }

    public void StreamSample04() {
        // プリミティブ型専用のストリームというのもある
        IntStream.range(0, 30)
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);      
    }

    public void StreamSample05() {
        Stream.of(8, 4, 1, 10, 4, 2, 5, 6, 9, 4)
            .map(x -> x * 2)
            .forEach(System.out::println);
    }

    // 上記は表示しかしてないけど、これをリストで欲しい場合はこうする。
    public void StreamSample06() {
        List<Integer> list = Stream.of(8, 4, 1, 10, 4, 2, 5, 6, 9, 4)
            .map(x -> x * 2)
            .toList();
        System.out.println(list);
    }

    // 終端操作サンプル
    public int StreamSample07() {
        List<String> strLlist = Arrays.asList("Kenya", "Saitoh", "Java", "Stream");
        int strLength = strLlist.stream()
            .mapToInt(str -> str.length())
            .reduce((result, param) -> result + param)
            .orElse(0);

        return strLength;
    }
}









/* 参考
https://github.com/KenyaSaitoh/learn_java_advanced/blob/main/04_lambda_stream/src/main/java/pro/kensait/java/advanced/lsn_4_2_1/Main.java
*/