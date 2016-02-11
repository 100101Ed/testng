/**
 * File Name: IdentifyObject.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016 Create a helper class to add to your framework which
 * gives information on any class you create. The method signatures are below.
 * Try to implement one at a time. Create a test case for each method.
 */
package com.sqa.em.util.helper;

/**
 * IdentifyObject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class IdentifyObject {

	// Methods which call Object methods getClass().getSimpleName(), toString(),
	// and in a readable form both to display and get String value of Object
	public static void display2DInfo(Object[][] objects) {
	}

	public static void displayInfo(Object obj) {
		System.out.println("Name (Package + Class): " + obj.getClass().getName());
		System.out.println("Package name: " + obj.getClass());
		// System.out.println(obj.toString());
		System.out.println("Class name: " + getInfo(obj));
		// System.out.println(obj.getClass());
	}

	public static void displayInfo(Object obj1, Object obj2, Object... objN) {
	}

	public static String get2DInfo(Object[][] objects) {
		return "";
	}

	public static String getInfo(Object obj) {
		return obj.getClass().getSimpleName();
	}
}
