package stringdatatype;

public class TestString {
    public static void main(String[] args) {
        String Lord1 = "Ram";
        String Lord = new String("Ram"); // create new string in heap
        String Lord2 = new String("Ram");// mens new memory location for LORD & LORD2
        String Lord4 = "Ram";// store in string pool
        // string pool is a special area in the heap memory where Java stores string literals.
        // string can not check equality like this in java
        System.out.println(Lord == Lord2);// false check address of string
        System.out.println(Lord1 == Lord4);// checking reference only

    }
}
