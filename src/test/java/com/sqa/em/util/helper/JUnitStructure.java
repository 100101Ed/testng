/**
 * File Name: numbersTest.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 11, 2016
 */
package com.sqa.em.util.helper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * numbersTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
@RunWith(Parameterized.class)
public class JUnitStructure {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { "Test 1", 5, 6, 11 }, { "Test 2", 50, 16, 66 }, { "Test 3", 35, 46, 81 },
				{ "Test 4", 4, 6, 10 }, { "Test 5", 45, 5, 50 }, { "Test 6", 5, 6, 100 } };
		return data;
	}

	String label;

	int num1;

	int num2;

	int expected;

	public JUnitStructure(String label, int num1, int num2, int expected) {
		this.label = label;
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}

	@Test
	public void addNumbersTest() {
		System.out.println(this.label);
		IdentifyObject.display2DInfo(getData());
		int total = this.num1 + this.num2;
		Assert.assertEquals(this.expected, total);
		System.out.println("Passed " + total);
	}
}