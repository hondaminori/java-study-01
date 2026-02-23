package exception_sample;

public class ExceptionBasic {
    public int divisionOrException(int i, int j){
        System.out.println("int i = " + i + " : int j = " + j);
        
        try {
            int result = i / j;
            return result;
        } catch (ArithmeticException ae) {
            System.out.println("例外が発生しました: " + ae.getMessage());
            return -1;
        }
    }
}
