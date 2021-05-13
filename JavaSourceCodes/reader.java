/**
 * @(#)reader.java
 *
 *
 * @author 
 * @version 1.00 2014/8/3
 */
import java.io.*; 
public class reader {
        
    /**
     * Creates a new instance of <code>reader</code>.
     */
    public reader() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
	char c; 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Enter characters, 'q' to quit."); 
// read characters 
do { 
c = (char) br.read(); 
System.out.println(c); 
} while(c != 'q'); 
} 
}
    

