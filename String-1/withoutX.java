public String withoutX(String str) {
	if (str.length() > 1) {
		return str.substring(str.charAt(0) == 'x' ? 1 : 0, str.charAt(str.length()-1) == 'x' ? str.length()-1 : str.length());
	} else if (str.length() == 1 && str.charAt(0) == 'x') {
		return "";
	}
	return str;
}