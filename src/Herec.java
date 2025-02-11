import java.util.Scanner;
public class Herec {
    static Scanner sc = new Scanner(System.in);
    private String jmeno;
    private int rokNarozeni;
    private Herec[] poleHercu;
    String kos;

    public Herec[] getPoleHercu() {
        return poleHercu;
    }

    public Herec() {
        System.out.println("Pocet hercu ve filmu");
        int x = sc.nextInt();
        poleHercu = new Herec[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Jmeno herce"+i);
            jmeno = sc.nextLine();
            System.out.println("Rok narozeni");
            rokNarozeni = sc.nextInt();
            kos = sc.nextLine();
            poleHercu[i] = jmeno +", "+ rokNarozeni;
        }
    }

}
