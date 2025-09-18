import java.util.Locale;

public class PrintFun {
    public static void main(String[] args) {
        // println() , print(), printf();

        System.out.println("Hello World"); // use for new line takes only 1 argument
        // system -> jdk environment
        // out -> console

        System.out.print("print ()"); // No new line also take  1 argument
        int a = 10;
        int b = 20;
        String c = "Sum";
        double number = 12345678 ;
        System.out.printf("%s of %d & %d : %d", c, a, b, a + b);// work as c/c++ printf()
        System.out.printf(Locale.JAPAN, "Japan Locale : %, .2f%n", number);
        System.out.println();

        // goes right to left
        System.out.println(a + b + c); // 30Sum
        System.out.println(c + a + b); // Sum1020
    }
}