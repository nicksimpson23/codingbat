public String lastChars(String a, String b) {
	// if statement solution
	String answer = "";
	if (a.length() != 0) {
	  answer = a.substring(0, 1);
	} else {
	  answer = "@";
	}
	if (b.length() != 0) {
	  answer += b.substring(b.length()-1); // you can use += to add to a variable
	} else {
	  answer += "@";
	}
	return answer;
	
	// ternary solution (this is one of the situations in which an if statement is more readable)
	return (a.length() != 0 ? a.substring(0, 1) : "@") + (b.length() != 0 ? b.substring(b.length()-1) : "@");
  }