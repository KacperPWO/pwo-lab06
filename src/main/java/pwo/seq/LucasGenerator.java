package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa służąca do wyliczania elementów ciągu Lucasa
 * 
 * @author Kacper Papiński
 * @version 1.0.0
 */
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Ustawienie początkowych wartości ciągu Lucasa
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Powoduje, że metoda {@link #nextTerm()} rozpoczyna od 2.<br>
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Zwraca kolejny wyraz ciągu
     * @return Wartość wyrazu ciągu
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
