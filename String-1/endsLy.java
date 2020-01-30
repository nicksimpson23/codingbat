public boolean endsLy(String str) {
	/*
	* This problem introduces Java's .equals method. When initially attempting to solve this one,
	* I tried to compare the two strings via ==. This will not work in this context. I'm not sure
	* as to why the .equals method is not explained anywhere on the codingbat website like the
	* substring method is.
	*/

	// if statement Solution
	if (str.length >= 2) {
		return str.substring(str.length()-2).equals("ly");
	}
	return false;

	// Ternary Operator Solution
	return str.length() >= 2 ? (str.substring(str.length()-2).equals("ly")) : false;
}