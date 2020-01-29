package sample_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTestCases {

	@Test
	public void test() {
	
		assertEquals("Hello", new TestClass().fun());
	}

}
