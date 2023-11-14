package pwo.app;

/**
 * Klasa zawierajaca funkcje main, przyjmująca argumenty przy uruchomieniu.
 * @author Kacper Papiński
 * @version 1.0.0
 */
public class Sequence {

    /**
     * Metoda główna programu, zwracająca wynik zależny od ilości odanych argumentów - wynik w konsoli lub w pliku txt
     * @param args argumenty, określające zakres i rodzaj ciągu, oraz nazwę pliku do zapisu wyników
     */
    public static void main(String[] args) {

        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to [fileName]");
        }
    }
}
