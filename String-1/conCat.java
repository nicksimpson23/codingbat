public String conCat(String a, String b) {
	String answer = "";
	if (a.length() > 0 && b.length() > 0) {
		if (a.substring(a.length()-1).equals(b.substring(0, 1))) {
			return a.substring(0, a.length()-1) + b.substring(0);
		}
	}
	return a + b;
}