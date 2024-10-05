import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

private GradeBook gradeBook1;
private GradeBook gradeBook2;

	@BeforeEach
	void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		gradeBook1.addScore(85);
		gradeBook1.addScore(90);
		gradeBook2.addScore(75);
		gradeBook2.addScore(80);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	void testAddScore() {
		gradeBook1.addScore(95);
	    assertEquals("85.0 90.0 95.0", gradeBook1.toString());
	    assertEquals(3, gradeBook1.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(175, gradeBook1.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(85, gradeBook1.minimum());
		
	}

	@Test
	void testFinalScore() {
		assertEquals(175, gradeBook1.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, gradeBook1.getScoreSize());
        gradeBook1.addScore(95);
        assertEquals(3, gradeBook1.getScoreSize());
	}

	@Test
	void testToString() {
		assertEquals("85.0 90.0", gradeBook1.toString());
        assertEquals("75.0 80.0", gradeBook2.toString());
        gradeBook2.addScore(85);
        assertEquals("75.0 80.0 85.0", gradeBook2.toString());
	}

}
