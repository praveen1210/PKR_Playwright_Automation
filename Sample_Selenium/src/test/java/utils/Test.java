package utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	
//	 public static void main(String[] args) {
//	        String sentence = "Visitor request created successfully.\nOTP - 2205";
//
//	        // Define a regular expression pattern to match the OTP
//	        Pattern pattern = Pattern.compile("OTP - (\\d+)");
//	        Matcher matcher = pattern.matcher(sentence);
//
//	        // Check if the pattern is found
//	        if (matcher.find()) {
//	            // Extract the OTP value
//	            String otpValue = matcher.group(1);
//	            System.out.println("OTP: " + otpValue);
//	        } else {
//	            System.out.println("OTP not found in the sentence.");
//	        }
//	
//}
	 
	  public static void main(String[] args) {
		   
		  
		  int length = 10; // specify the length of the random string
		  Random random = new Random();
	        StringBuilder stringBuilder = new StringBuilder();

	        for (int i = 4; i < length; i++) {
	            // Generate a random letter within the limit of 26 (uppercase letters)
	            char randomLetter = (char) ('A' + random.nextInt(26));
	            System.out.println(randomLetter);
	            stringBuilder.append(randomLetter);
	            System.out.println(stringBuilder.append(randomLetter));
	        }
//	        String randomString = generateRandomString(length);
	        System.out.println("Random String: " + stringBuilder.length());
	    }

//	    private static String generateRandomString(int length) {
//	        Random random = new Random();
//	        StringBuilder stringBuilder = new StringBuilder();
//
//	        for (int i = 0; i < length; i++) {
//	            // Generate a random letter within the limit of 26 (uppercase letters)
//	            char randomLetter = (char) ('A' + random.nextInt(26));
//	            stringBuilder.append(randomLetter);
//	        }
//
//	        return stringBuilder.toString();
//	    }
}
