/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio30 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 30");
		int caballo[]= new int[7];
		int mc[]= new int[7];
//		int caballo1=0; int caballo2=0;
//		int c1=0;int c2=0;
		String tc[]=new String[7];
		String tc1=" "; String tc2=" ";
		for (int i = 0; i < 7; i++) {
			mc[i]=(int) (Math.random()*5)+1;
		}
//		int mc1= (int) (Math.random()*5)+1;
//		int mc2= (int) (Math.random()*5)+1;
		int comodin=0; int comodin2=0;
		while (comodin2 < 5) {
//			System.out.println(tc1 + "C1");
//			System.out.println(tc2 + "C2");
			for(int i=0;i<7;i++){
				int j=i+1;
				System.out.println(tc[i]+"C"+j);
			}
		
//			while (comodin <= mc1) {
//				tc1 = tc1 + "\t";
//				comodin++;
//				c1++;
//			}
//			comodin = 0;
//			while (comodin <= mc2) {
//				tc2 = tc2 + "\t";
//				comodin++;
//				c2++;
//			}
//			comodin = 0;
			for (int i = 0; i < 7; i++) {
				mc[i]=(int) (Math.random()*5)+1;
				for(int j=0; j<mc[i];j++){
					tc[i]=tc[i]+"\t";
				}
			}
	
//			mc1= (int) (Math.random()*5)+1;
//			mc2= (int) (Math.random()*5)+1;
			comodin2++;
			
			Thread.sleep(2000); {
				
			}
		}
		
		
		
		
}	
	
}
