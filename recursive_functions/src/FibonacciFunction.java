public class FibonacciFunction {

    public int fibonacciFunction(int n){
        int result;
        if (n==0 || n==1){
          result = n;
        } else {
            result = fibonacciFunction(n-1) + fibonacciFunction(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        FibonacciFunction resultF = new FibonacciFunction();
        int result = resultF.fibonacciFunction(16);
        System.out.println("fibonacci is "+result);
    }
}
