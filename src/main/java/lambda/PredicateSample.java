package lambda;

import java.util.function.Predicate;

public class PredicateSample {
    public boolean isCheckAdult(User user, Predicate<User> predicate) {
        return predicate.test(user);
    }
}

/*
Predicate<T>は、引数Tを受け取り、booleanを返す関数型インターフェース。
test(T t)メソッドを持つ。

user.isAdult() を普通に使えばいいのだが、Predicateを使うサンプルということで
若干無理やりPredicateを使っている。
*/