package conditionalOperators;

public class ConditionalsTest {
    public static void main(String[] args) {
        // logical operators
        // && AND
        // || OR
        // ! NOT

        int a = 20 ;
        int b = 10 ;
        char  c= 'b';
        boolean tier = true;
        int exp = 3;
        System.out.println(tier && exp >= 5);
        System.out.println(tier || exp >= 5);
        System.out.println(c+ 0);

        // conditional operators
        int age = 16;
        String Name = "Raja bishnoi";
        boolean pass = false;

        if(age > 18){
            System.out.println("welcome to the party");
        }else if( !pass ){
            System.out.println("try when u are adult");
        }else{
            System.out.println("welcome to the VIP party");
        }


        String day = "Someday";

        switch (day){
            case "Sunday": System.out.println("sunday"); break;
            case "Monday": System.out.println("monday"); break;
            case "Tuesday": System.out.println("tuesday"); break;
            case "Wednesday": System.out.println("wednesday"); break;
            case "Thursday": System.out.println("thursday"); break;
            case "Friday": System.out.println("friday"); break;
            case "Saturday": System.out.println("saturday"); break;
            default: System.out.println("No day Its funday");
        }
    }
}
