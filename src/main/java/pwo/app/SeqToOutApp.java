package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa służąca do pobierania argumentów i wyświetlania wyników w konsoli.
 * @author Kacper Papiński
 * @version 1.0.0
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Metoda sprawdzająca poprawność podanych argumentów
     * @param args argumenty genratora
     * @return true jesli poprawne, false jeśli niepoprawne
     */
    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }
        return seqType != null && from >= 0 && to >= 0;
    }

    /**
     * Metoda wyświetlająca wynik w konsoli
     * @return true
     */
    @Override
    protected boolean wirteSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(seqType.getGenerator(), from, to));
        return true;
    }

    /**
     * Metoda wykonawcza programu
     * @param args argumenty generatora
     */
    @Override
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");
        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to");
            return;
        }
        wirteSeq();
    }

}
