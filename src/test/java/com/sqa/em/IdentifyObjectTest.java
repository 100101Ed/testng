/**
 * File Name: IdentifyObjectTest.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016
 */
package com.sqa.em;

import org.junit.Test;

import com.sqa.em.util.helper.IdentifyObject;

/**
 * IdentifyObjectTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class IdentifyObjectTest {

	@Test
	public void TestObject() {
		RequestInputTest input = new RequestInputTest();
		IdentifyObject obj = new IdentifyObject();
		System.out.println(obj.getInfo(obj));
		obj.displayInfo(obj);
	}
}
