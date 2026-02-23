package lambda;

import java.util.function.Supplier;

public class SupplierSample {
    public String printIfNeeded(boolean flag, Supplier<String> messageSupplier) {
        if (flag) {
            return messageSupplier.get();
        }
        return "";
    }
}

/*
Supplier<T>は、引数を受け取らず、戻り値Tを返す関数型インターフェース。
get()メソッドを持つ。

遅延実行バージョン

flagがtrueの時だけmessageSupplier.get()が実行される。
例1) ログ出力などで、ログレベルが高い時だけログメッセージを生成したい場合
例2) ログメッセージの生成にコストがかかる場合
*/