/**
 * Programa conjunto de Programación y S.informáticos.
 * @author Joaquin Bello Jiménez
 */

import java.util.Scanner;

public class El_final {
    //Parte principal
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Creo los arrays
    String[] marca      = new String[10];
    String[] modelo     = new String[10];
    Double[] velocidad  = new Double[10];
    int[]    nnucleos   = new int[10];
    float[]  precio     = new float[10];
    
    //Ahora se crean 2 procesadores
    for (int i = 0; i < 10; i++) {
     marca[0] = "Intel";
     marca[1] = "AMD";
     if (i > 1) {
       marca[i] = "Nada";
     }
    }
    for (int i = 0; i < 10; i++) {
      modelo[0] = "Core i7-6900K";
      modelo[1] = "Ryzen 7 1800X";
      if (i > 1) {
        modelo[i] = "Nada";
       }
      }
    for (int i = 0; i < 10; i++) {
    velocidad[0] = 4.0;
    velocidad[1] = 3.2;
    if (i > 1) {
      velocidad[i] = 0.0;
     }
    }
    for (int i = 0; i < 10; i++) {
    nnucleos[0] = 8;
    nnucleos[1] = 8;
    if (i > 1) {
      nnucleos[i] = 0;
     }
    }
    for (int i = 0; i < 10; i++) {
      precio[0] = 595;
      precio[1] = 1188;
      if (i > 1) {
        precio[i] = 0;
      }
    }
    
    //Una vez creados los procesadores se inicia el menú.
    int mOpcion = 0; //Variable que comprueba la opción del menú.
    
    //Menú
    do{
        System.out.println("--MENÚ-PROCESADORES--");
        System.out.println("|1.Listar           |");
        System.out.println("|2.Añadir           |");
        System.out.println("|3.Modificar        |");
        System.out.println("|4.Borrar           |");
        System.out.println("|5.Salir            |");
        System.out.println("--------------------");
        mOpcion = Integer.parseInt(teclado.nextLine());
    }while (mOpcion < 1 || mOpcion > 5);
        
    switch(mOpcion){
        case 1:
          mostrarLista(marca,modelo,velocidad,nnucleos,precio);
        break;
        case 2:
        System.out.print("\nIntroduce la marca del procesador: ");
        String eMarca = teclado.nextLine();
        System.out.print("\nIntroduce el modelo: ");
        String eModelo = teclado.nextLine();
        System.out.print("\nIntroduce la velocidad: ");
        Double eVelocidad = Double.parseDouble(teclado.nextLine());
        System.out.print("\nIntroduce el número de núcleos: ");
        int eNnucleos = Integer.parseInt(teclado.nextLine());
        System.out.print("\nIntroduce el precio del procesador: ");
        float ePrecio = Float.parseFloat(teclado.nextLine());;
        System.out.println("________________________________________");
        nuevo(marca,modelo,velocidad,nnucleos,precio,eMarca,eModelo,eVelocidad,eNnucleos,ePrecio);
        System.out.print("\n¡Procesador añadido con éxito! ");
        
        break;
        case 3:
            
        break;
        case 4:
            
        break;
    }
    
    
    }
    private static void mostrarLista(String[] mar, String[] mod, Double[] vel, int[] nnu, float[] pre) {
    System.out.println("\n  ├────────────────────────────────────────────────────────────────────────────────────────────────────────┤");
    System.out.printf("  │%13s        │%13s       │%14s    │%14s        │%14s        │", "MARCA","MODELO","VELOCIDAD","NÚCLEOS","PRECIO");
    for (int i = 0; i < mar.length; i++) {
      if (mar[i].equals("Nada")) {
      } else {
        System.out.printf("\n  ├────────────────────────────────────────────────────────────────────────────────────────────────────────┤");
        System.out.printf("\n%2d|%-22s│%-20s│%-18s│%-22s│%6.2f              │",(i+1),mar[i],mod[i],vel[i],nnu[i],pre[i]);
      }
    }
    System.out.print("\n  ├────────────────────────────────────────────────────────────────────────────────────────────────────────┤");
  }

    private static void nuevo(String[] mar, String[] mod, Double[] vel, int[] nnu, float[] pre,
            String eMarca, String eModelo, Double eVelocidad, int eNnucleos, float ePrecio) {
    boolean salir = false;
    for (int i = 0; i < mar.length && !salir; i++) {
      if (mar[i].equals("Nada")) {
        mar[i]   = eMarca;
        mod[i]   = eModelo;
        vel[i]   = eVelocidad;
        nnu[i]   = eNnucleos;
        pre[i]   = ePrecio;
        salir    = true;
      }
    }
  }
}