package lambda;

public class FunctionalInterfaceSampleImpl {
    public int operation(int i, int j) {
        FunctionalInterfaceSample calc = (a, b) -> a + b;

        int result = calc.operate(i, j);
        return result;
    }
}
