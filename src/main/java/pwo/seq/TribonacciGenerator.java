package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa służąca do wyliczania elementów ciągu Tribonacciego
 * 
 * @author Kacper Papiński
 * @version 1.0.0
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

    /**
     * Ustawienie początkowych wartości ciągu Tribonacciego
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Powoduje, że metoda {@link #nextTerm()} rozpoczyna od 0.<br>
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Zwraca kolejny wyraz ciągu
     * @return Obecnie wyznaczony wyraz ciągu
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
