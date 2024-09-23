import org.example.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void testeSoma() {
        int result = calculadora.soma(2,3);
        assertEquals(5, result);  // Verifica se o resultado da soma está correto. Resultado esperado: 5
    }
    @Test
    public void testeSubtracao() {
        int result = calculadora.subtrai(5,3);
        assertEquals(2, result);  // Verifica se o resultado da subtração está correto
    }

    @Test
    public void testeMultiplicacao() {
        int result = calculadora.multiplica(2,3);
        assertEquals(6, result);  // Verifica se o resultado da multiplicação está correto
    }

    @Test
    public void testeDivisao() {
        int result = calculadora.divide(6,3);
        assertEquals(2, result);  // Verifica se o resultado da divisão está correto
    }

    @Test
    public void testDivisaoPorZero() {
        // Testa se a divisão por zero lança a exceção correta
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(5,0);
        });
    }
}
