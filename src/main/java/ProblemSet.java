/**

    * File: Practice Problem Set 3
	* Author: Mansoor Muhammad
	 * Date Created: April 1, 2026
	 * Date Last Modified: April 6, 2026

        */

import java.util.Scanner;
public class ProblemSet {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input an email");
		

	}
public static String emailFormat(String email){
int firstAt = email.indexOf('@'); // finds the first instance of @
int lastAt = email.lastIndexOf('@'); // finds another instance of !

if (firstAt == -1 || firstAt != lastAt) { // validates
     return "Invalid";
}
if (email.startsWith(".") || email.endsWith(".")) { // checks dots at beginning and end
	 return "Invalid";
}
if (email.contains(" ")) { //checks for spaces
 return "Invalid";
}
int atIndex = email.indexOf('@'); 
String local = email.substring(0, atIndex); // makes substring
if (local.length() < 1 || local.length() > 64) { //checks length
 return "Invalid";
}
String domain = email.substring(atIndex + 1); // locates "."
if (!domain.contains(".")) {  //validates
 return "Invalid";
}
int lastDot = email.lastIndexOf('.');//
String domelength = email.substring(lastDot + 1);// checks "." at domain

if (domelength.length() < 2 || domelength.length() > 6) {//checks length of domain
 return "Invalid";
}
return "valid";

}
}
