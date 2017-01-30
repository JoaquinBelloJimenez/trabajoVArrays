/*
 *Joaquín Bello Jiménez 
 */
import biblioteca8.Agrupadas;


public class TrabajoArray {
	
	public static void main (String args[]) {
    
     //Ejercicio 1 esCapicúa   
      if (biblioteca8.Agrupadas.esCapicua(1221)){
        System.out.println("el 1221 es capicua");
      }else{
        System.out.println("el 1221 no es capicua");
      }
      if (biblioteca8.Agrupadas.esCapicua(135)){
        System.out.println("el 135 es capicua");
      }else{
        System.out.println("el 135 no es capicua");
      }
    //Ejercicio 2 esPrimo
      if (biblioteca8.Agrupadas.esPrimo(14)){
        System.out.println("el 14 es primo");
      }else{
        System.out.println("el 14 no es primo");
      }
    //Ejercicio 3 esPrimo siguiente
        System.out.println("El siguiente número primo de 27 es: ");
        System.out.println(biblioteca8.Agrupadas.primoMayor(27));
    //Ejercicio 4 Potencia
        System.out.println("");
        
        
  }
	}

