import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class PoleDeklarace {

    public static void main(String[] args) {
        Random r = new Random(100);


        int[] pole = null;

        pole = new int[11];

        pole[0] = 15;
        pole[10] = 33547;
        System.out.println(pole[0]);
        printIndex(pole, 0);



        for(int i = 0; i < pole.length ; i++) {
            pole[i] = r.nextInt(1000) ;
        }

        tiskniCelePole(pole);
        tiskniCelePoleForEach(pole);

        Arrays.sort(pole);

        System.out.println(Arrays.toString(pole));

        System.out.println("Nize pracujeme s dvourozmernym polem");

        int[][] pole2 = new int[3][3];
        pole2 = new int[][] {
                {1,2,3},
                {2,3,4, 5},
                {4}
        };

        System.out.println(Arrays.toString(pole2[0]));
        System.out.println(Arrays.toString(pole2[1]));
        System.out.println(Arrays.toString(pole2[2]));

        for (int i = 0; i < pole2.length; i++) {

            for (int j = 0; j < pole2[i].length; j++) {
                System.out.print(pole2[i][j]);
                System.out.print(',');
            }
            System.out.print('\n');
        }

        varargMetoda('c', 10, 42, 123, 11);

        varargMetoda('z', pole);

    }

    //static void varargMetoda(char c, int argument2, int argument3)

    static void varargMetoda(char c, int... argument) {
        System.out.println("\n\n Zavolana metoda s vararg");
        System.out.println("Predan znak : " + c);

        System.out.println("delka pole : " + argument.length);

        System.out.println(Arrays.toString(argument));


    }


    static void tiskniCelePoleForEach(int[] pole) {
        System.out.println("Tiskneme cele pole pomoci for-each : ");
        for(int hodnota : pole) {
            System.out.print(hodnota);
            System.out.print(",");
        }
        System.out.print("\n");
    }


    static void tiskniCelePole(int[] pole) {
        System.out.println("Tiskneme cele pole : ");

        for(int i = 0; i < pole.length ; i++) {
            System.out.print(pole[i]);
            System.out.print(",");
        }


        System.out.print("\n");
    }



    static void printIndex(int[] pole, int index ) {
        if(pole != null && pole[index] > 10) {
            System.out.println(pole[index]);
        }

        if(pole.length > 10) {
            System.out.println(pole[10]);
        }

        System.out.print("Posledni index pole : " + (pole.length - 1) + ", hodnota posledniho prvku: " );
        System.out.println(pole[pole.length - 1]);



    }


}
