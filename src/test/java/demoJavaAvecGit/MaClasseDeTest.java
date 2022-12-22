package demoJavaAvecGit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class MaClasseDeTest {
	FonctionMathematique fct = new FonctionMathematique();
	@Test
	void test() {
		assertEquals(10, fct.addition(2, 8));
	}

	@BeforeEach
	void avantChaque() {
		fct = new FonctionMathematique();
		//Avant chaque test
	}
	@AfterEach
	void apresChaqueTest() {
		fct = null;
	}
	@BeforeAll
	static void avantLePremierTest() {
		//S'éxcute une fois avant le premier test
		//
	}
	@AfterAll
	static void apresLeDernierTest() {
		//S'exécute une fois après le dernier test
	}
	@Test
	void factorielTest() {
		FonctionMathematique fct = new FonctionMathematique();
		assertEquals(6, fct.factoriel(3));
	}

	@Test
	void factorialExceptionTest() {
		assertThrows(FactorielException.class,() -> {
			fct.factoriel(0);
		});
	}
}