package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar("1+1+5");
		assertEquals(7, soma);
	}

}
