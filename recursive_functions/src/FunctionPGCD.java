
public class FunctionPGCD {
        public int functionPGCD(int a, int b) {
        int result;
        if (b == 0) {
            result = a;
        } else {
           result = functionPGCD(b,a%b);
        }
        return result;
    }


//    public int functionPGCD(int a, int b) {
//        //int r = a % b;
//        int result;
//        if (a == b) {
//            result = a;
//        } else {
//            if (a > b) {
//                result = functionPGCD(a-b, b);
//            } else {
//                result = functionPGCD(b, b-a);
//            }
//        }
//        return result;
//    }


        public static void main (String[]args){
            FunctionPGCD resultF = new FunctionPGCD();
            int result = resultF.functionPGCD(96, 36);
            System.out.println("PGCD is " + result);
        }
    }
