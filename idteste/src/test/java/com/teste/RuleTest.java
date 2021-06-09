package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTest {
	
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder(); //Classe temporaria 
	
	@Test
	public void shouldCreateNewFileInTemporaryFolder() throws IOException {
		File created = tmpFolder.newFile("file.text"); //Aqui esta sendo criado um arquivo temporario
		
		assertTrue(created.isFile()); //Verrificar se o arquivo foi criado
		assertEquals(tmpFolder.getRoot(), created.getParentFile()); //Verifica se o root da pasta temporaria é o mesmo do arquivo criado 
	}

}
