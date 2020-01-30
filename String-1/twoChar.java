public String twoChar(String str, int index) {
	/* 
	*  if statement Solution
	*
	*  This if statement validates the "index" param.
	*  If the index is less than 0 or greater than the length of the string,
	*  it's not an accessable character of the string.
	*/
	if (index > 0 && index + 1 < str.length()) {
		// return the characters of the string that start at index and two positions after
		return str.substring(index, index+2);
	};
	// return the first two characters of the string
	return str.substring(0, 2);

	// ternary solution
	return (index > 0 && index + 1 < str.length()) ? str.substring(index, index + 2) : str.substring(0, 2);
}