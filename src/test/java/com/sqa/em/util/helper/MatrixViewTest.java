/**
 * File Name: MatrixViewTest.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 11, 2016
 */
package com.sqa.em.util.helper;

// import junit.framework.Assert.*;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * MatrixViewTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class MatrixViewTest {

	@Test
	public void addingNumbersTest() {
		int expect = 3;
		int total = addNumber(4, 32);
		Assert.assertEquals(expect, total);
	}

	public int addNumber(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.IdentifyObject#display2DInfo(java.lang.Object[][])}
	 * .
	 */
	@Test
	public void testDisplay2DInfo() {
		Object[][] my2DMatrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		IdentifyObject.display2DInfo(my2DMatrix);
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.IdentifyObject#get2DInfo(java.lang.Object[][])}
	 * .
	 */
	@Test
	@Ignore
	public void testGet2DInfo() {
	}
}
