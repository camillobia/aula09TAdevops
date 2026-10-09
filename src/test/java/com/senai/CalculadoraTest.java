package com.senai;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
     //Anotação para dizer que a função é de teste 
@Test 
void testarsoma(){
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.somar(3, 2);
    //metodo assertEquals compara o resultado que esperamos com o 
    assertEquals(5, resultado);
}
    @Test 
void testarmultiplicacao(){
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.multiplicar(3, 2);
    //metodo assertEquals compara o resultado que esperamos com o 
    assertEquals(6, resultado);
}
}






