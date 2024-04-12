/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ASUS
 */
public class Debug {

	public Debug() {
		log("Class này được tạo ra để in các nội dung ra log");
	}

	public static void log(String text) {
		System.out.println(" <-----DEBUG-----> " + text);
	}

	public static void debugParams() {

	}
}
