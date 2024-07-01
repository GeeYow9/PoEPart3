
package poe.part.pkg3;

public class UserLogin {
 String enteredUsername; // Entered username during login
 String enteredPassword; // Entered password during login
 String firstName; // User's first name
 String lastName; // User's last name
 String password; // User's password
 String username; // User's username
 // Check if the username is valid
 public boolean checkUsername() {
 if (username.length() <= 5 && username.contains("_")) {
 return true;
 }
 return false;
 }
 // Check if the password meets complexity requirements
 public boolean checkPasswordComplexity() {
 boolean hasCapitalLetter = false;
 boolean hasNumber = false;
 boolean hasSpecialChar = false;
 if (password.length() >= 8) {
 for (char ch : password.toCharArray()) {
 if (Character.isUpperCase(ch)) {
 hasCapitalLetter = true;
 } else if (Character.isDigit(ch)) {
 hasNumber = true;
 } else if (!Character.isLetterOrDigit(ch)) {
 hasSpecialChar = true;
 }
 }
 }
 return hasCapitalLetter && hasNumber && hasSpecialChar;
 }
 // Register the user by checking username and password validity
 public String registerUser() {
 if (checkUsername()) {
 System.out.println("Username successfully captured.");
 } else {
 System.out.println("Username is not correctly formatted. Please ensure that your Username contains an underscore and is no more than 5 characters in length.");
 }
 if (checkPasswordComplexity()) {
 System.out.println("Password successfully captured.");
 } else {
 System.out.println("Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
 }
 if (checkUsername() && checkPasswordComplexity()) {
 System.out.println("The two above conditions have been met and the user has been registered successfully.");
 } else {
 if (!checkPasswordComplexity()) {
 System.out.println("The Password does not meet the complexity requirements.");
 }
 if (!checkUsername()) {
 System.out.println("The username is incorrectly formatted.");
 }
 }
 return "";
 }
 // Validate user login
 public boolean loginUser() {
 return username.equals(enteredUsername) && password.equals(enteredPassword);
 }
 // Return login status message
 public String returnLoginStatus() {
 if (loginUser()) {
 System.out.println("Successful login");
 System.out.println("Welcome " + firstName + " " + lastName + " it is great to see you again.");
 } else {
 System.out.println("A failed login");
 System.out.println("Username or Password incorrect please try again");
 }
 return "";
 }
}
