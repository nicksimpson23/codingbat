public String deFront(String str) {    
	String answer = "";
	if (str.substring(0, 1).equals("a")) {
		answer += "a";
	}
	if (str.substring(1, 2).equals("b")) {
		answer += "b";
	}
	answer += str.substring(2);
	return answer;
}