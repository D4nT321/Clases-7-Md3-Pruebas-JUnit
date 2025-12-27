

package com.devsenior;

//import static org.junit.jupiter.api.Assertions.assertEquals; PRUEBA ANTERIOR - NO COORE TEST
//import static org.junit.jupiter.api.Assertions.assertThrows; PRUEBA ANTERIOR - NO COORE TEST
import static org.junit.jupiter.api.Assertions.*; // IMPORTACION SIMPLIFICADA DE TODAS LAS FUNCIONES DE ASSERTIONS
import org.junit.jupiter.api.Test; // IMPORTACION DE LA ANOTACION TEST




public class CalculadoraTest {

    // El tipo Test es parte de JUnit y se usa para marcar un metodo como metodo de prueba
    // El metodo de prueba es aquel que verifica que una funcionalidad de la clase Calculadora funciona correctamente
    // El metodo assertEquals se usa para comparar el resultado esperado con el resultado obtenido 
    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.sumar(5, 3));    
    }

    @Test
    void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.restar(5, 3));    
    }

    @Test
    void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(5, 3));    
    }

    @Test
    void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));    
    }

    @Test
    // Lambda que lanza la excepcion
    // Expresion lambda sirve para definir un metodo sin nombre, ejemplo: () -> {}
    // El codigo que se espera que lance la excepcion va dentro de las llaves {} 
    void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(5, 0);
        });
        assertEquals("El divisor no puede ser cero.", exception.getMessage());

    }
    

}
