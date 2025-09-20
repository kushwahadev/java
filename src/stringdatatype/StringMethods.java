package stringdatatype;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Dev Kushwaha";
        String anotherName = "    ruthless Sharma   ";

        // Methods in String
        System.out.println(name.toUpperCase());// name in upper case
        System.out.println(name.toLowerCase());// name in lower case
        System.out.println(name.charAt(6));// char on at index 6
        System.out.println(name.indexOf('a'));// first presence index of a
        System.out.println(name.lastIndexOf('a')); // last index of a
        System.out.println(name.lastIndexOf("Kushwaha",6));// start from index 4
        System.out.println(anotherName.trim().length());// remove space from right and left then gives length if string
        System.out.println(name.endsWith("a"));
        System.out.println(name.startsWith("f"));
        System.out.println(name.substring(0,3));
        System.out.println(name.contains("u"));
        String s  = "       ";
        String s1 = "       ";
        System.out.println(s.isEmpty());//false
        System.out.println(s.isBlank());// true
        System.out.println(name.equals(anotherName));
        System.out.println(s1.equalsIgnoreCase(s));
        System.out.println(anotherName.replace("Sharma", "Panipat").concat(" Beast"));
    }
}
