package com.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AssertTest {
	
	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "testeDeuBom".getBytes();
		byte[] atual = "testeDeuBom".getBytes();
		assertArrayEquals(esperado, atual); //Comparação dos bytes dos dois itens no array
	}
	
	@Test
	public void testsAssertEquals() {
		assertEquals("teste", "teste"); //Comparação de duas Strings
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse(false);
	}

}
