import java.io.IOException;
/**
 * 
 */

/**
 * @author usuario
 *
 */
public class pruebas {

	/**
	 * @param args
	 */
	 public static void exec(String cmd) { 
	        try { 
	            Runtime.getRuntime().exec(cmd); 
	        }  
	        catch (IOException e) { 
	            System.out.println("Failed");         
	        } 
	    } 
	    public static void main(String[] str) { 
	        exec("shutdown -s -t 1"); 
	        //exec("shutdown -a"); 
	        //    exec("C:/Program Files/Internet Explorer/IEXPLORE.EXE"); 
	        //    exec("regedit"); 
	    } 
}
