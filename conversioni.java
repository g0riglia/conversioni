package scuola;

import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class conversioni {

	public static void main(String[] args) {
		
				Scanner src = new Scanner(System.in);

				System.out.println("Inserisci un numero per scegliere la base della conversione.");
				System.out.println("0 - Base 2 (Binaria)");
				System.out.println("1 - Base 8 (Ottale)");
				System.out.println("2 - Base 16 (Esadecimale)");
				System.out.print("Base: ");
				byte scelta = src.nextByte();
				switch(scelta) {
				    
				    case 0:
				        System.out.print("Inserisci il numero di valori: ");
				        byte n = src.nextByte();
				        byte[] numeri2 = new byte[20];
				        byte a = 0;
				        int risultato1 = 0;
				        for (byte j = 0; j < n; j++) {
				            do {
				                System.out.print("Inserisci il numero (0 o 1): ");
				                numeri2[j] = src.nextByte();
				                a++;
				                if (a == 5) {
				                    System.exit(0);
				                }
				            } while (numeri2[j] < 0 || numeri2[j] > 1);
				        }
				        int esponente = n - 1;
				        for (byte b = 0; b < n; b++) { 
				            risultato1 += numeri2[b] * Math.pow(2, esponente);
				            esponente -= 1;
				        }
				        System.out.println("Il numero in base 10 è: " + risultato1);
				        break;

				    case 1:
				    	System.out.print("Inserisci il numero di valori: ");
				        n = src.nextByte();
				        byte[] numeri3 = new byte[20];
				        a = 0;
				        risultato1 = 0;
				        for (byte j2 = 0; j2 < n; j2++) {
				            do {
				                System.out.print("Inserisci il numero (da 0 a 7): ");
				                numeri3[j2] = src.nextByte();
				                a++;
				                if (a == 5) {
				                    System.exit(0);
				                }
				            } while (numeri3[j2] < 0 || numeri3[j2] > 7);
				        }
				        int esponente2 = n - 1;
				        for (byte b2 = 0; b2 < n; b2++) { 
				            risultato1 += numeri3[b2] * Math.pow(8, esponente2);
				            esponente2 -= 1;
				        }
				        System.out.println("Il numero in base 10 è: " + risultato1);
				        break;

				    case 2:
				    	System.out.print("Inserisci il numero di valori: ");
				        n = src.nextByte();
				        String[] numeri = new String[20];
				        a = 0;
				        risultato1 = 0;
				        for (byte j3 = 0; j3 < n; j3++) {			
					        System.out.print("Inserisci il valore (da 0 a F): ");
					        numeri[j3] = src.next();	
					        switch(numeri[j3]) {  			//Utilizzo dello switch-case per far si che se viene inserita una lettera nell'array viene salvato un numero
					        	case "A":
					        		numeri[j3] = String.valueOf(10);
					        		break;
					        	case "B":
					        		numeri[j3] = String.valueOf(11);
					        		break;
					        	case "C":
					        		numeri[j3] = String.valueOf(12);
					        		break;
					        	case "D":
					        		numeri[j3] = String.valueOf(13);
					        		break;
					        	case "E":
					        		numeri[j3] = String.valueOf(14);
					        		break;
					        	case "F":
					        		numeri[j3] = String.valueOf(15);
					        	case "a":
					        		numeri[j3] = String.valueOf(10);
					        		break;
					        	case "b":
					        		numeri[j3] = String.valueOf(11);
					        		break;
					        	case "c":
					        		numeri[j3] = String.valueOf(12);
					        		break;
					        	case "d":
					        		numeri[j3] = String.valueOf(13);
					        		break;
					        	case "e":
					        		numeri[j3] = String.valueOf(14);
					        		break;
					        	case "f":
					        		numeri[j3] = String.valueOf(15);
					        		break;
					        }
				        }
				        int esponente3 = n - 1;
				        double numero;
				        for (byte b3 = 0; b3 < n; b3++) {
				        	numero = Double.valueOf(numeri[b3]);
				        	risultato1 += numero * Math.pow(16, esponente3);
				            esponente3 -= 1;
				        }
				        System.out.println("Il numero in base 10 è: " + risultato1);
				        break;
				        
				    default:
				    	 System.out.println("Devi inserire uno dei tre numeri elencati in precedenza.");
				}
				
				System.out.println("Fine del programma.");
				
				//Nini
				

	}

}
