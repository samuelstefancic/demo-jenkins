package demoJavaAvecGit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaClasseDeTest {

	@Test
	void test() {
		FonctionMathematique fct = new FonctionMathematique();
		assertEquals(10, fct.addition(2, 8));

	}
	@Test
	void factorielTest() {
		FonctionMathematique fct = new FonctionMathematique();
		assertEquals(6, fct.factoriel(3));
	}
}
