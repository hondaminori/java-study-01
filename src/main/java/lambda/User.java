package lambda;

public class User {
    private int id;
    private int age;

    public User(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return 20 <= age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", age=" + age + "]";
    }
}

/*
何もPredicateを使わなくても、普通にuser.isAdult()で成人かどうかを判定できる。
やりたければuser.getAge() >= 20 のようにしてもよい。ただし、

>= 20 のような条件判定は、暫定的なものなら良い。
しかしこれをいろんなところでやってしまうと、20の値が変わった時に修正箇所が多くなり良くない。

ユーザに関するロジックは全てUserクラスに集約させるべきという考え方もある。

*/
