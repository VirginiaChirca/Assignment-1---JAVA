package library;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        book[] books = new book[10];
        library library = new library(books,0);
        boolean ok = true;

        while (ok) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduceti comanda a-adaugare, s-stergere, l-listare, o-oprire: ");
            try {
                String comanda = new String(in.readLine());
                switch (comanda) {
                    case "a": {
                        System.out.println("Ce iti doresti sa adaugi? album, roman");
                        try {
                            String tip = new String(in.readLine());
                            switch (tip) {
                                case "album": {
                                    System.out.println("Numele cartii este: ");
                                    String name = new String(in.readLine());
                                    System.out.println("Numarul de pagini ale cartii: ");
                                    Scanner inn = new Scanner(System.in);
                                    int nr_pag = inn.nextInt();
                                    System.out.println("Calitatea hartiei: ");
                                    String calitate = new String(in.readLine());
                                    album album = new album(calitate, name, nr_pag);
                                    library.add_book(album);
                                    break;
                                }
                                case "roman": {
                                    System.out.println("Numele cartii este: ");
                                    String name = new String(in.readLine());
                                    System.out.println("Numarul de pagini ale cartii: ");
                                    Scanner inn = new Scanner(System.in);
                                    int nr_pag = inn.nextInt();
                                    System.out.println("Tipul cartii: ");
                                    String tipul = new String(in.readLine());
                                    novel roman = new novel(tipul, name, nr_pag);
                                    library.add_book(roman);
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                    case "l": {
                        System.out.println("Cartile din biblioteca sunt: ");
                        library.afisare_carti();
                        break;
                    }
                    case "s": {
                        System.out.println("Numele cartii pe care doriti sa o stergeti este: ");
                        String carte_sters = new String(in.readLine());
                        library.delete_book(carte_sters);
                        break;
                    }
                    case "o": {
                        System.out.println("Am iesit din program");
                        ok = false;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}