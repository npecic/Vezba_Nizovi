package com.company;



import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/**
 * Prvi primer vezbe 17 - Pogodi broj
 */
//        System.out.println("Zamiljam broj ...");
//
//        Random random = new Random ();
//
//        int zamisljeniBroj = random.nextInt(4);
//        System.out.println("Zamislio sam broj, probaj da pogodis");
//
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            int pokusaj = Integer.parseInt(scanner.nextLine());
//            if (pokusaj == zamisljeniBroj) {
//                System.out.println("Bravo pogodak!");
//                break;
//            } else {
//                System.out.println("Pokusaj ponovo!");
//            }
//
//        }

        /**
         * Drugi primer -
         */

//        while  (true){
//            System.out.println("Zamiljam broj ...");
//
//            Random random = new Random ();
//
//            int zamisljeniBroj = random.nextInt(4);
//            System.out.println("Zamislio sam broj, probaj da pogodis");
//
//
//            while (true) {
//                Scanner scanner = new Scanner(System.in);
//                int pokusaj = Integer.parseInt(scanner.nextLine());
//                if (pokusaj == zamisljeniBroj) {
//                    System.out.println("Bravo pogodak!");
//                    break;
//                } else {
//                    System.out.println("Pokusaj ponovo!");
//                }
//
//            }
//        }

        /**
         * Treci primer -  Nizovi
         */
//
//        int nizBrojeva[] = {1,2,3,4,5,6,7,8,9,0}; // clanovi niza
////        Object[] nizObjeekata = {1, "sd"}; // Nizovi objekata - u slucaju da su svi objekti
//
//        System.out.println(nizBrojeva[0]);
//        System.out.println(nizBrojeva[1]);
//        System.out.println(nizBrojeva[2]);
//        System.out.println(nizBrojeva[3]);
//
        /**
         * Cetvrti primer -  Nizovi u for petlji
         */
//
//        int nizBrojeva[] = {1,2,3,4,5,6,7,8,9,0};
//
//
//        for (int i = 0; i < 4; i++){
//            System.out.println(nizBrojeva[i]);
//        }

        /**
         * Peti -  Nizovi u for petlji - length
         */
//
//        int nizBrojeva[] = {1,2,3,4,5,6,7,8,9,0};
//
//        for (int i = 0; i < nizBrojeva.length; i++){
//            System.out.println(nizBrojeva[i]);
//        }
// ///       System.out.println(nizBrojeva.length);
//

        /**
         * Sesti -  Nizovi u for petlji - length
         */
//
//        int nizBrojeva[] = {1,2,3,4,5,6,7,8,9,0};
//
//        for (int j : nizBrojeva){
//            System.out.println(j);
//        }


        /**
         * Sedmi -  Nizovi - Kako kreirati niz sa vrednostima koje ne znam koje ce biti
         */

//        int nizBrojeva[] = new int [5];
//
//        nizBrojeva[0] = 10;
//        nizBrojeva[1] = 10;
//        nizBrojeva[2] = 10;
//        nizBrojeva[3] = 10;
//        nizBrojeva[4] = 10;
//
//        nizBrojeva[2] = 11;
//
//
//        System.out.println(nizBrojeva[2]);
//


        /**
         * Osmi -  Nizovi - dvodimenzionalni niz
         */

 //      int nizBrojeva[][] = new int [3][];
        int nizBrojeva[][] = {
                {1,2,3},
                {4,5,6,7},
                {7,8,9}
        };
        System.out.println(nizBrojeva [1][2]);




    }
}
