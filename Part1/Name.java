class Name{	
		
	public static void main(String [] args){
        String s = "nitin";
	String s1 = "";  
	for(int i=0; i<s.length(); i++){
	s1=s.charAt(i)+s1;
}

if(s1 == s){
System.out.println("no is palindrome");
}else{
System.out.println("no is not palindrome");
	
}
}
}