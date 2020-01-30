public String theEnd(String str, boolean front) {
	/*
	* Utilizing ternary operators again.
	* This can be read as "IF front is true THEN (?) return the first character ELSE (:) return the last character"
	*/
	return front ? str.substring(0, 1) : str.substring(str.length()-1);
}