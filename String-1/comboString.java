public String comboString(String a, String b) {
	// if statement Solution
	
	if (a.length() < b.length()) {
	  return a + b + a;
	} else {
	  return b + a + b;
	}

	/*
	* Ternary Solution
	*
	* Ternary works as a single line if-else statement.
	* You can think of "?" as then and ":" as else.
	* The ternary statement below can be read as:
	* "IF the length of a is less than the length of b THEN return (a + b + a) ELSE return (b + a + b)"
	*/

	return (a.length() < b.length() ? a + b + a : b + a + b);
}