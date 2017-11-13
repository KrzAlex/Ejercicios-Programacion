import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int correcto=0, numero, resto, contLetras=0, verificar=0;
		String letra, nif,num, num2="0123456789";
		String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while(correcto!=1){
			do{
				verificar=0;
				System.out.println("Introduzca un NIF");
				nif=teclado.nextLine();
				nif=nif.toUpperCase();
				for(int i=0; i<nif.length()-1;i++){
					if(nif.indexOf(letras)!=1){
						contLetras++;
					}
				}
				if (contLetras<=2) {
					verificar++;
				}
			 for(int i=0; i<nif.length()-1;i++){
				 if(letras.indexOf(nif.substring(i,i+1))!=-1){
					 verificar++;
				 }
				 if(num2.indexOf(nif.substring(i,i+1))!=-1){
					 verificar++;
				 }
			 }
			 if(nif.length()==9){
				 verificar++;
			 }
			}while(verificar<=11);
			//while(!(nif.length()==9||contLetras>2));
			num=nif.substring(0, 8);
			letra=nif.substring(8, 9);
			if (nif.charAt(0)=='X'||nif.charAt(0)=='Y'||nif.charAt(0)=='Z') {//Miramos si el primer caracter es una letra y la sustituimos por el valor que tenga.
				if (nif.charAt(0)=='X') {
					nif=nif.replace('X', '0');
				}
				if (nif.charAt(0)=='Y') {
					nif=nif.replace('Y', '1');
				}				
				if (nif.charAt(0)=='Z') {
					nif=nif.replace('Z', '2');
				}
			}
			numero=Integer.parseInt(nif.substring(0, 8));//Pasamos la cadena de numeros a int.
			resto=numero%23;
			
			switch (resto) { //Case para controlar las letras del NIF
			case 0:
				if (letra.equals("T")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 1:
				if (letra.equals("R")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 2:
				if (letra.equals("W")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 3:
				if (letra.equals("A")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 4:
				if (letra.equals("G")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 5:
				if (letra.equals("M")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 6:
				if (letra.equals("Y")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 7:
				if (letra.equals("F")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 8:
				if (letra.equals("P")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 9:
				if (letra.equals("D")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 10:
				if (letra.equals("X")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 11:
				if (letra.equals("B")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 12:
				if (letra.equals("N")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 13:
				if (letra.equals("J")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 14:
				if (letra.equals("Z")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 15:
				if (letra.equals("S")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 16:
				if (letra.equals("Q")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 17:
				if (letra.equals("V")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 18:
				if (letra.equals("H")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 19:
				if (letra.equals("L")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 20:
				if (letra.equals("C")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 21:
				if (letra.equals("K")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			case 22:
				if (letra.equals("E")) {
					correcto++;
				}else{
					System.out.println("Error");
				}
				break;
			
			default:
				break;
			}
		}
		System.out.println("NIF Válido");
	}

}
