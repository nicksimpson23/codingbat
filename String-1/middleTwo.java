public String middleTwo(String str) {
	/*
	* The first step is to find the character in the middle of the string.
	* To find this character, divide the length of your string by 2 and go back 1 (str.length()/2-1).
	* Then, to find the second character, you only have to divide the length of your string by 2.
	* However, given that we only want the one character, we have to provide a second value to
	* the substring function. By adding 1 to the position in the center of the string, we are telling
	* the function to only capture the single character. These two characters are then concatenated together.
	*/
	return str.substring(str.length()/2-1, str.length()/2) + str.substring(str.length()/2, str.length()/2+1);
}