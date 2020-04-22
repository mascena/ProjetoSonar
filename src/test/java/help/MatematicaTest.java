package help;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatematicaTest {

	Matematica m = new Matematica();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testNumeroPar() {
		assertEquals(true, m.numeroPar(4));
	}

	@Test
	public void testAreaQuadrado() {
		assertEquals(9, m.areaQuadrado(3));
	}

	@Test
	public void testNumeroDivisivel() {
		assertEquals(true, m.numeroDivisivel(10, 5));
		assertEquals(true, m.numeroDivisivel(10, 2));
	}

}
