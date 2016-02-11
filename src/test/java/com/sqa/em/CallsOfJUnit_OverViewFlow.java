/**
 * File Name: InfoTest0.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016
 */
package com.sqa.em;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * InfoTest0 //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class CallsOfJUnit_OverViewFlow {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Runs before the Class executes - @BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Runs After the Class executes  - @AfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("\tRuns Setup the Class executes @Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("\tRuns Tear Down the Class executes @After");
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.IdentifyObject#display2DInfo(java.lang.Object[][])}
	 * .
	 */
	@Test
	public void testDisplay2DInfo() {
		System.out.println("\t\tTest for display display2DInfo @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.IdentifyObject#displayInfo(java.lang.Object)}
	 * .
	 */
	@Test
	public void testDisplayInfoObject() {
		System.out.println("\t\tTest for display displayInfoObject @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.IdentifyObject#displayInfo(java.lang.Object, java.lang.Object, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testDisplayInfoObjectObjectObjectArray() {
		System.out.println("\t\tTest for display displayInfoObjectObjectObjectArray");
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.IdentifyObject#get2DInfo(java.lang.Object[][])}
	 * .
	 */
	@Test
	public void testGet2DInfo() {
		System.out.println("\t\tTest for display get2DInfo");
	}

	/**
	 * Test method for
	 * {@link com.sqa.em.util.helper.IdentifyObject#getInfo(java.lang.Object)}.
	 */
	@Test
	public void testGetInfo() {
		System.out.println("\t\tTest for display getInfo");
	}
}
