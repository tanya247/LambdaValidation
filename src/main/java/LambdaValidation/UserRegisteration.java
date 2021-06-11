package LambdaValidation;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {






	static String validFirstNameFormat = "^[A-Z][a-z]{2,}";
	static String validLastNameFormat = "^[A-Z][a-z]{2,}";
	static String validEmailRegex = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})";
	static String validMobileNo = "^[0-9]{2}[ ][0-9]{10}$";
	static String validPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
	public static void main(String[] args) {


		IRegexMatcher firstnameChecker = (regex,userInput) -> {



			Pattern compile =Pattern.compile(regex ); 

			Matcher match= compile.matcher(userInput);

			Boolean result = match.matches();

			return result;

		};







		IRegexMatcher lastnameChecker = (regex,userInput) -> {



			Pattern compile =Pattern.compile(regex ); 

			Matcher match= compile.matcher(userInput);

			Boolean result = match.matches();

			return result;

		};


		IRegexMatcher mobileNoChecker = (regex,userInput) -> {



			Pattern compile =Pattern.compile(regex ); 

			Matcher match= compile.matcher(userInput);

			Boolean result = match.matches();

			return result;

		};







		IRegexMatcher emailChecker = (regex,userInput) -> {



			Pattern compile =Pattern.compile(regex ); 

			Matcher match= compile.matcher(userInput);

			Boolean result = match.matches();

			return result;

		};



		 System.out.println(firstnameChecker.match(validFirstNameFormat, "Ta"));
		 System.out.println(firstnameChecker.match(validFirstNameFormat, "tanya"));
		 System.out.println(firstnameChecker.match(validFirstNameFormat, "Tanya"));
		 System.out.println(lastnameChecker.match(validLastNameFormat, "Ka"));
		 System.out.println(lastnameChecker.match(validLastNameFormat, "kansal"));
		 System.out.println(lastnameChecker.match(validLastNameFormat, "Kansal"));
		 System.out.println(emailChecker.match(validEmailRegex , "abc250725@gmail.com"));
		 System.out.println(emailChecker.match(validEmailRegex , "abc"));
		 System.out.println(emailChecker.match(validEmailRegex , "abc100@yahoo.com"));
		 System.out.println(mobileNoChecker.match(validMobileNo, "91"));
		 System.out.println(mobileNoChecker.match(validMobileNo, "123456789023456789"));
		 System.out.println(mobileNoChecker.match(validMobileNo, "91 1234567890"));		 



	}

}