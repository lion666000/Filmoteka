import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Kolik filmu?");
        int pocetFilmu = sc.nextInt();
        sc.nextLine();
        Film[] poleFilmu = new Film[pocetFilmu];

        for (int i = 0; i < pocetFilmu; i++) {
            System.out.println("Nazev filmu "+(i+1)+":");
            String nazev = sc.nextLine();
            System.out.println("Rok vydani:");
            int rokVydani = sc.nextInt();
            System.out.println("Hodnoceni:");
            int hodnoceni = sc.nextInt();
            System.out.println("Pocet hercu:");
            int pocetHercu = sc.nextInt();
            sc.nextLine();

            Herec[] poleHercu = new Herec[pocetHercu];

            for (int h = 0; h < pocetHercu; h++) {
                System.out.println("Jmeno herce "+(i+1)+":");
                String jmeno = sc.nextLine();
                System.out.println("Rok narozeni:");
                int rokNarozeni = sc.nextInt();
                sc.nextLine();
                poleHercu[h] = new Herec (jmeno, rokNarozeni);


            }


            poleFilmu[i] = new Film (nazev, rokVydani, hodnoceni, poleHercu) ;

        }

        Film nejlepeHodnocenyFilm = poleFilmu[0];
        for (Film film : poleFilmu) {
            if (film.getHodnoceni() > nejlepeHodnocenyFilm.getHodnoceni()) {
                nejlepeHodnocenyFilm = film;
            }
        }
        System.out.println("Nejlepe hodnoceny film: "+nejlepeHodnocenyFilm.getNazev());

    }
}