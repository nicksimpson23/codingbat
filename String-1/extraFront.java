public String extraFront(String str) {
	String newString = str.length() >= 2 ? str.substring(0, 2) : str;
	return newString + newString + newString;
}