package lambda;

public class LambdaAndLocalVariable {
    public int add(int i, int j){
        int baseNumber = 10;

        // ラムダ式内でローカル変数を参照
        FunctionalInterfaceSample fis = (a, b) -> a + b + baseNumber;    
        
        // baseNumber = 20; // コンパイルエラーになる
        return fis.operate(i, j);
    }
}

/*
ラムダ式内でローカル変数を参照できる。
ラムダ式が生成されたときに、ローカル変数はキャプチャーされて不変になる。
自動的にfinalが付与され、変更は不可能。

*/