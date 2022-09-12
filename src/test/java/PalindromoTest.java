import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PalindromoTest {
    private String[] palabrasIngresadas;
    private String[] palabrasIngresadas2;
    private boolean[] resultadosEsperados;

    @BeforeEach
    public void init(){
        palabrasIngresadas = new String[] {"200", "","Reconocer", "arbol", "la tele letal", "amA amA"};
        resultadosEsperados = new boolean[] {false, true, true, false, true, true};
    }

    @Test
    @DisplayName("Caso de prueba es cuadrado magico")
    public void esPalindromoTest(){
        for (int i = 0; i < palabrasIngresadas.length; i++) {
            boolean resultadoObtenido = Palindromo.esPalindromo(palabrasIngresadas[i]);
            assertEquals(resultadoObtenido, resultadosEsperados[i]);
        }
    }


}
