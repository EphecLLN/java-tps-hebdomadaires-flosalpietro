package tp3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceTest {

	@Test
	public void testCarre() {
		Calculatrice calc = new Calculatrice();
		assertEquals(0, calc.carre(0));
		assertEquals(1, calc.carre(1));
		assertEquals(1, calc.carre(-1));
		assertEquals(4, calc.carre(2));
		assertEquals(4, calc.carre(-2));

	}

}
