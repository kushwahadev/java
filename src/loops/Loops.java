package loops;

public class Loops {
    public static void main(String[] args) {
        // Loops

        // initialization , condition , update
        int i = 0;
        while (i < 10) {
            System.out.println("whie loop i -> " + i);
            i++;
        }

        do{
            System.out.println("do while loop and i : " + i);
            i++;
        }while (i<20);

        for (int j = 0; j < i; j++) {
            System.out.println("j = " + j);
        }

        // Loop inside loop are nested loops...

        for (int j = 0; j < 10; j++) {
            for (int k = 0; k <=j ; k++) {
                System.out.print("#");
            }                               
            System.out.println();

        }

    }
}
