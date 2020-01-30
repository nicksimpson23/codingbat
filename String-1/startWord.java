public String startWord(String str, String word) {
	// if statement Solution
	if (str.length() > 0) {
		word = str.charAt(0) + word.substring(1, word.length());
	} else {
		word = "";
	}
	if (str.length() >= word.length() && str.substring(0, word.length()).equals(word)) {
		return word;
	}
	return "";
	
	// ternary Solution
	word = str.length() > 0 ? str.charAt(0) + word.substring(1, word.length()) : "";
	return str.length() >= word.length() && str.substring(0, word.length()).equals(word) ? word : "";
}