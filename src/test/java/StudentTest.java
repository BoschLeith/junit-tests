import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
	Student bosch;

	@Before
	public void setUp(){
		bosch = new Student(1, "Bosch");
	}

	@Test
	public void testStudent(){
		assertNotNull(bosch);
	}

	@Test
	public void testGetID(){
		assertEquals(1, bosch.getId(), 0);
	}

	@Test
	public void testGetName(){
		assertEquals("Bosch", bosch.getName());
	}

	@Before
	public void setUpGrade(){
		bosch.addGrade(90);
	}

	@Test
	public void testAddGrade(){
		assertNotNull(bosch.grades);
		assertTrue(bosch.grades.contains(90));
	}

	@Test
	public void testGetGrades(){
		ArrayList<Integer> test = new ArrayList<>();
		test.add(90);
		assertEquals(bosch.getGrades(), test);
	}

	@Test
	public void testGetGradeAverage(){
		bosch.addGrade(100);
		assertEquals(95, bosch.getGradeAverage(), 0);
	}

	@Test
	public void testUpdateGrade(){
		ArrayList<Integer> test = new ArrayList<>();
		test.add(100);
		assertEquals(bosch.updateGrade(90, 100), test);
	}

	@Test
	public void testRemoveGrade(){
		bosch.addGrade(100);
		ArrayList<Integer> test = new ArrayList<>();
		test.add(100);
		assertEquals(test, bosch.removeGrade(90));
	}
}
