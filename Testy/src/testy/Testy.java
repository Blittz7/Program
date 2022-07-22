/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testy;

import testy.Klient;
import testy.Agencja;
import java.util.Scanner;

public class Testy {

    public static void main(String[] args) {

        System.out.println("Witaj w programie do wycen drukarni.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj szerokość wydruku.");
        int width = scan.nextInt();

        System.out.println("Podaj długość wydruku wydruku.");
        int length = scan.nextInt();

        System.out.println("Ceny dla Agencji czy Klienta? Jeśli chcesz wybrać Agencja wpisz 1, a gdy Klienta wpisz 2");
        int path = scan.nextInt();
        int path1 = 1;
        int path2 = 2;
        if (path == path1) {
            Agencja a = new Agencja();
            int x = a.getArea(width, length);

            System.out.println("Lista materiałów dostępnych do druku:");

            a.materialy();
            System.out.println("Wybierz materiał który Cię interesuje poprzez wpisanie liczby poprzedzającej nazwę materiału.");
            int list = scan.nextInt();

            System.out.println("Czy wydruk ma być zalaminowany? Jeśli tak to wpisz 1, jeśli nie to wpisz 2.");
            int czyLam = scan.nextInt();
            int lam = 1;
            int nolam = 2;

            if (czyLam == lam) {
                a.laminaty();
                System.out.println("Wybierz laminat który Cię interesuje poprzez wpisanie liczby poprzedzającej nazwę materiału.");
                int list2 = scan.nextInt();

                System.out.println("Czy wydruk ma być nacinany? Jeśli tak to wpisz 1, jeśli nie to wpisz 2");
                int czyNac = scan.nextInt();
                int nac = 1;
                int noNac = 2;

                if (czyNac == nac) {
                    System.out.println("Cena wydruku wynosi:" + " " + a.matLamNac(list, list2) + " " + "zł");
                } else if (czyNac == noNac) {
                    System.out.println("Cena wydruku wynosi:" + " " + a.matLam(list, list2) + " " + "zł");
                }

            } else if (czyLam == nolam) {

                System.out.println("Czy wydruk ma być nacinany? Jeśli tak to wpisz 1, jeśli nie to wpisz 2");
                int czyNac = scan.nextInt();
                int nac = 1;
                int noNac = 2;

                if (czyNac == nac) {
                    System.out.println("Cena wydruku wynosi:" + " " + a.matNac(list) + " " + "zł");
                } else if (czyNac == noNac) {
                    System.out.println("Cena wydruku wynosi:" + " " + a.mat(list) + " " + "zł");
                }

            }

        } else if (path == path2) {
            Klient a = new Klient();
            int x = a.getArea(width, length);

            System.out.println("Lista materiałów dostępnych do druku:");

            a.materialy();
            System.out.println("Wybierz materiał który Cię interesuje poprzez wpisanie liczby poprzedzającej nazwę materiału.");
            int list = scan.nextInt();

            System.out.println("Czy wydruk ma być zalaminowany? Jeśli tak to wpisz 1, jeśli nie to wpisz 2.");
            int czyLam = scan.nextInt();
            int lam = 1;
            int nolam = 2;

            if (czyLam == lam) {
                a.laminaty();
                System.out.println("Wybierz laminat który Cię interesuje poprzez wpisanie liczby poprzedzającej nazwę materiału.");
                int list2 = scan.nextInt();

                System.out.println("Czy wydruk ma być nacinany? Jeśli tak to wpisz 1, jeśli nie to wpisz 2");
                int czyNac = scan.nextInt();
                int nac = 1;
                int noNac = 2;

                if (czyNac == nac) {
                    System.out.println("Cena wydruku wynosi:" + " " + a.matLamNac(list, list2) + " " + "zł");
                } else if (czyNac == noNac) {
                    System.out.println("Cena wydruku wynosi:" + " " + a.matLam(list, list2) + " " + "zł");
                }

            } else if (czyLam == nolam) {

                System.out.println("Czy wydruk ma być nacinany? Jeśli tak to wpisz 1, jeśli nie to wpisz 2");
                int czyNac = scan.nextInt();
                int nac = 1;
                int noNac = 2;

                if (czyNac == nac) {
                    System.out.println("Cena wydruku wynosi:" + " " + a.matNac(list) + " " + "zł");
                } else if (czyNac == noNac) {
                    System.out.println("Cena wydruku wynosi:" + " " + a.mat(list) + " " + "zł");
                }

            }
        }
    }

}
