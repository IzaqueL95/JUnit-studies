package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTest {
	
	@Test
	public void somaDois(){
		
		int valorA = 1;
		int valorB = 2;
		
		//int soma = 0;
		
		CalculadoraNova calc = new CalculadoraNova();
		
		int soma = calc.somar(valorA, valorB);
		
		
		assertEquals(3, soma);
		
	}
	
	@Test
	public void somaTres(){
		
		int valorA = 1;
		int valorB = 2;
		int valorC = 3;
		//int soma = 0;
		
		CalculadoraNova calc = new CalculadoraNova();
		
		int soma = calc.somar(valorA, valorB, valorC);
		
		
		assertEquals(6, soma);
		
	}

}
