package tp3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExercicesTDDTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void testEstPair(){
		assertEquals("true", estPair(2));	
	}

	public void testPerimetreCarre(){
		assertEquals(40, perimetreCarre(10));
		assertEquels(null, perimetreCarre())
	}
	
	public void testContientCaractere(){
		assertEquals("false", contientCaractere("s","poiuytreza"));
		
	}
}
