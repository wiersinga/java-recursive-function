public class SyracuseFunction {
    public int syracuseFunction(int N, int i) {
        int result;

            if (i == 0 && N>0) {
                result = N;
            } else {
                if (syracuseFunction(N, i - 1) % 2 == 0) {
                    result = syracuseFunction(N, i - 1) / 2;
                } else {
                    result = syracuseFunction(N, i - 1) * 3 + 1;
                }
            }
            return result;

    }
    public static void main(String[] args) {
        SyracuseFunction resultF = new SyracuseFunction();
        int result = resultF.syracuseFunction(15,8);
        System.out.println("syracuse is "+result);
    }
}
