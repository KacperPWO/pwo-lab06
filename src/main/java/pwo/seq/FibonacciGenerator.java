package pwo.seq;

import java.math.BigDecimal;

/**
 * lasa służąca do wyliczania elementów ciągu Fibonacciego
 * 
 * @author Kacper Papiński
 * @version 1.0.0
 */
public class FibonacciGenerator extends Generator {

    /**
     * Ustawienie początkowych wartości ciągu Fibonacciego
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Powoduje, że metoda {@link #nextTerm()} rozpoczyna od 0.<br>
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Zwraca kolejny wyraz ciągu
     * @return Obecnie wyznaczony wyraz ciągu
     */
    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
