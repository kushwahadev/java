public class DataType {
    public static void main(String[] args) {

        // call to print daa types
        //dataTypes();

        // arithmetic operators
        //mathsOperations();

        // Bitwise operations
        //biteOperations();

    }

    // data Types
    public static void dataTypes(){
        //data types;
        byte byteNum = Byte.MAX_VALUE;
        int intNum = Integer.MAX_VALUE;
        short shortNum = Short.MAX_VALUE;
        long longNum = Long.MAX_VALUE;
        float floatNum = Float.MAX_VALUE;
        double doubleNum = Double.MAX_VALUE;
        char charNum = 'a';
        boolean boolNum = true;
        System.out.println(byteNum);
        System.out.println(intNum);
        System.out.println(shortNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(charNum);
        System.out.println(boolNum);

        float num = 10.66f; // without f consider int

        int newNum = (int) num ; // convert into int first because num is float and int have a short range than float so in default gives error because change into float is lose some value.


    }

    // arithmetic Operations
    public static void mathsOperations(){
        int a = 10;
        int b = 5;
        int c= 2;
        System.out.println("sum of a & b : " + a+b );
        System.out.println("difference of a & c : " + (a-c));
        System.out.println("multiplication of a X b : " + (a*b));
        System.out.println("division of a & b : " + (a/b));

        int d = a + b * c;
        int e = a - b /c ;
        int f = a * b / c;

        System.out.println("10 + 5 * 2 = " + d);
        System.out.println("10 - 5 / 2 = " + e);
        System.out.println("10 * 5 / 2 = " + f);
        System.out.println(" a++ = " + a++);
        System.out.println(" a-- = " + a--);
        System.out.println("++b = " + ++b);
        System.out.println("--b = " + --b);

        byte num  = 10;
       // num = num + 5; gives error because default value consider as int
        num = (byte) (num + 5); // change int to byte
    }

    // bitwise operators
    public static void biteOperations(){
        // operands
        // AND &
        // OR |
        // NOT ~
        // XOR ^
        // left shift <<
        // right shift >>
        // unsinged right shift >>>
        //         | xor  |  & |    ^
        // 0    0  | 0    | 0  |    0
        // 0    1  | 1    | 0  |    1
        // 1    0  | 1    | 0  |    1
        // 1    1  | 1    | 1  |    0

        int a = 10;
        int b = 8;

        System.out.println( " bit of a : " + Integer.toBinaryString(a) + " bit of b : " + Integer.toBinaryString(b));
        int c = a & b;
        int d = a | b;
        System.out.println("a & b : " + c);
        System.out.println(" bit of c : " + Integer.toBinaryString(c));
        System.out.println("a | b : " + d);
        System.out.println(" bit of d : " + Integer.toBinaryString(d));
        int e = a ^ b;
        int f = a << 1 ;
        System.out.println("a ^ b : " + e);
        System.out.println("bit of e : " + Integer.toBinaryString(e));
        System.out.println(" a << 1 : " + f);
        System.out.println("a >> 1 : " + Integer.toBinaryString(f));

    }
}
