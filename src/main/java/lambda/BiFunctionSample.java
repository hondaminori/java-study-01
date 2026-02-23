package lambda;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public int operation(
            BiFunction<Integer, Integer, Integer> bifunction, 
            int i, 
            int j) {

        return bifunction.apply(i, j);
    }
}

/*
参考サイト
https://github.com/KenyaSaitoh/learn_java_advanced

*/