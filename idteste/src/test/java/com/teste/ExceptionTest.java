package com.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	
	//Teste para verificar se o Array est� vazio, no caso o teste espera a exce��o
	@Test(expected = IndexOutOfBoundsException.class) //Na declara��o do @Test est� sendo dito que � esperada a exce��o, que no caso � se o Array est� vazio. 
	public void empty() {
		List<String> Lista = new ArrayList<String>();
		
		Lista.get(0);
	}
	
	
	
	
	//@Rule
	//public ExpectedException thrown = ExpectedException.none();
	
	//@Test
	//public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
	//	List<Object> List = new ArrayList<Object>();
		
	//	thrown.expect(IndexOutOfBoundsException.class); //Ele espera o IndexOutOfException.class
	//	thrown.expectMessage("Index: 0, Size: 0"); //O teste passa se retornar essa mensagem, pois ela retornara caso a lista esteaja vazia.
		
	//	List.get(0);
		
//	}
	
	

}
