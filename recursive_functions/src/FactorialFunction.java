public class FactorialFunction {

    public int factorialFunction(int n) {
        int result;
        if (n==1){
            result = 1;
        } else {
            result = factorialFunction(n-1)*n;
        }
        return result;
    }
    public static void main(String[] args) {
        FactorialFunction resultF = new FactorialFunction();
        int result = resultF.factorialFunction(4);
        System.out.println("factorial is "+result);
    }
}
