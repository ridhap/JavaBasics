public class ReverseString1 {
	public String reverseMyString(String str){		
		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
		return buffer.toString();
	}
	public String reverseMyStringWithoutBuffer(String str){
		int length = str.length();
		String original = str;
		String reverse = "";
		for(int i = length-1; i>=0; i--){
			reverse = reverse + original.charAt(i);			
		}		
		return reverse;
	}
	public static void main(String[] args){	
		
		ReverseString rs = new ReverseString();
		System.out.println("Reversed String using Buffer: "
                          +rs.reverseMyString("Hello world"));
		System.out.println("Reversed String without Buffer: 
                         "+rs.reverseMyStringWithoutBuffer("Hello world"));
	}

}