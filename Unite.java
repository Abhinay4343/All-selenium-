package testpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Unite {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(" BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(" AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println(" Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(" After");
	}

	@Test
	public void test() {
		System.out.println("Test");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}

}
