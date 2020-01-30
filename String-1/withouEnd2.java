public String withouEnd2(String str) {
	// if statement version
	if (str.length() > 2) {
	  return str.substring(1, str.length()-1);
	}
	return "";
	
	// Ternary Version
	return str.length() > 2 ? str.substring(1, str.length()-1) : "";
}