package mdtrmQ2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTests {

	@Test
	public void personConstructorRejectsInvalidTitle() {
		try {
			Person person2 = new Person("Robert", "Manager", 500);
			assertTrue("Works correctly when used correctly", person2.getYComp() == 26000);
		} catch (Exception ex) {
			fail("This shouldn't happen");
		}
		try {
			Person person1 = new Person("Alan", "Useless", 19.50);
			fail("Exception not thrown");
		} catch (Exception ex) {
			assertEquals(ex.getMessage(), "Unacceptable title");
		}

	}

}
