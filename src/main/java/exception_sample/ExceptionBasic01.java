package exception_sample;

public class ExceptionBasic01 {
    public int divisionOrException02(int i, int j) {
        System.out.println("int i = " + i + " : int j = " + j);

        if (j <= 0) {
            throw new IllegalArgumentException("引数が0未満"); // 【1】
        }
        return i / j;
    }
}
