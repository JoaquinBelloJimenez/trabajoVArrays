/**
 * Programa conjunto de Programación y S.informáticos.
 * @author Joaquin Bello Jiménez
 */

import java.util.Scanner;

public class TrabajoArray {
    //Parte principal
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //Creo los arrays
    String[] marca      = new String[10];
    String[] modelo     = new String[10];
    Double[] velocidad  = new Double[10];
    int[]    nnucleos   = new int[10];
    float[]  precio     = new float[10];
    
    //Ahora se crean 2 procesadores
        //Primer procesador
     marca[0]       = "Intel";
     modelo[0]      = "Core i7-6900K";
     velocidad[0]   = 3.2;
     nnucleos[0]    = 8;
     precio[1]      = 1188;
        //Segundo procesador
      marca[1] = "AMD";
      modelo[1] = "Ryzen 7 1800X";
      velocidad[1] = 4.0;
      nnucleos[1] = 8;
      precio[0] = 595;
      //Marcar los demás como no añadidos
     for (int i = 2; i < 10; i++) {
       marca[i] = "Nada";
       modelo[i] = "Nada";
       velocidad[i] = 0.0;
       nnucleos[i] = 0;
       precio[i] = 0;
     }
    //Una vez creados los procesadores se inicia el menú.
    int mOpcion = 0; //Variable que comprueba la opción del menú.
    int eFilaOp = -1; //Variable para opciónsobre filas.
    
    //Menú
   do{
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
        case 1: //Esta opción utiliza la función "mostrarLista"
          mostrarLista(marca,modelo,velocidad,nnucleos,precio);
        break;
        case 2: //Esta opción pide los datos y crea el procesador con la función "nuevo"
        System.out.print("\nIntroduce la marca del procesador: ");
        String eMarca = teclado.nextLine();
        System.out.print("\nIntroduce el modelo: ");
        String eModelo = teclado.nextLine();
        System.out.print("\nIntroduce la velocidad: ");
        Double eVelocidad = Double.parseDouble(teclado.nextLine());
        System.out.print("\nIntroduce el número de núcleos: ");
        int eNnucleos = Integer.parseInt(teclado.nextLine());
        System.out.print("\nIntroduce el precio del procesador: ");
        float ePrecio = Float.parseFloat(teclado.nextLine());
        System.out.println("________________________________________");
        nuevo(marca,modelo,velocidad,nnucleos,precio,eMarca,eModelo,eVelocidad,eNnucleos,ePrecio);
        System.out.print("\n¡Procesador añadido con éxito! ");
        break;
        case 3://Muestra la lista para que escojas cual editar
            mostrarLista(marca,modelo,velocidad,nnucleos,precio);
            System.out.print("\n¿Qué procesador vas a modificar? ");
            int eFila = Integer.parseInt(teclado.nextLine());
            if (marca[eFila-1].equals("Nada")){
             System.out.print("\n¿Confirmar modificación? 1:Si 2:No. ");
                eFilaOp = Integer.parseInt(teclado.nextLine());
              if (eFilaOp==1){
               System.out.print("\nFila vacía. ¿No ves que no hay nada?\n");
              }
            }else{
                eFila = eFila-1;
                 do{
                     do{ //Menú para escoger que apartado modificar
                        System.out.println("--MENÚ-EDICIÓN--");
                        System.out.println("|1.Marca:    "+marca[eFila]);
                        System.out.println("|2.Modelo:   "+modelo[eFila]);
                        System.out.println("|3.Veloidad: "+velocidad[eFila]);
                        System.out.println("|4.Nnúcleos: "+nnucleos[eFila]);
                        System.out.println("|5.Precio:   "+precio[eFila] + "€");
                        System.out.println("|6.salir       ");
                        System.out.println("-----------------");
                       eFilaOp = Integer.parseInt(teclado.nextLine());
                     }while (eFilaOp < 1 || eFilaOp > 6);
                      switch(eFilaOp){
                          case 1: //Editar la marca
                              System.out.print("\nNueva marca de procesador: ");
                              eMarca = teclado.nextLine();
                              marca[eFila] = eMarca;
                          break;
                          case 2: //Editar el modelo
                              System.out.print("\nNuevo modelo: ");
                              eModelo = teclado.nextLine();
                              modelo[eFila] = eModelo;
                          break;
                          case 3: //Editar la velocidad
                              System.out.print("\nNueva velocidad: ");
                              eVelocidad = Double.parseDouble(teclado.nextLine());
                              velocidad[eFila] = eVelocidad;
                          break;
                          case 4: //Editar los nucleos
                              System.out.print("\nNuevo número de núcleos: ");
                              eNnucleos = Integer.parseInt(teclado.nextLine());
                              nnucleos[eFila] = eNnucleos;
                          break;
                          case 5: //Editar el precio
                             System.out.print("\nNuevo precio: ");
                             ePrecio = Float.parseFloat(teclado.nextLine());
                             precio[eFila] = ePrecio;
                          break;
        
                      }
                 }while(eFilaOp != 6);
            }
        break;
        case 4: //Opción para eliminar un elementto de la lista.
            mostrarLista(marca,modelo,velocidad,nnucleos,precio);
            System.out.print("\n¿Qué procesador vas a eliminar? ");
            eFila = Integer.parseInt(teclado.nextLine());
            if (marca[eFila-1].equals("Nada")){
             System.out.print("\n¿Confirmar eliminación? 1:Si 2:No. ");
                eFilaOp = Integer.parseInt(teclado.nextLine());
              if (eFilaOp==1){
               System.out.print("\nFila vacía. ¿No ves que no hay nada?\n");
              }
            }else{
                eFila = eFila-1;
                System.out.print("\n¿Confirmar eliminación? 1:Si 2:No. ");
                eFilaOp = Integer.parseInt(teclado.nextLine());
                if (eFilaOp == 1){
                    marca[eFila] = "Nada"; //Escribe la marca como vacía "Nada".
                    System.out.print("\n¡Procesador eliminado con éxito!");
                }
            }
        break;
    }
    //Pausa creada para las 3 primeras opciones, para poder ver los datos msotrados.
       if (mOpcion <= 4) {
          System.out.print("\nINTRO: Seguir");
          teclado.nextLine();
      } else if (mOpcion == 5) {
        System.out.println("\n¡FIN DEL PROGRAMA!.");
       }
    
    }while (mOpcion != 5);
   
   }
    private static void mostrarLista(String[] mar, String[] mod, Double[] vel, int[] nnu, float[] pre) {
    System.out.println("\n  ├──────────────────────────────────────────────────────────────────────┤");
    System.out.printf("  │%13s        │%13s       │%14s    │%14s        │%14s        ", "MARCA","MODELO","VELOCIDAD","NÚCLEOS","PRECIO");
    for (int i = 0; i < mar.length; i++) {
      if (mar[i].equals("Nada")) {
      } else {
        System.out.printf("\n  ├──────────────────────────────────────────────────────────────────────┤");
        System.out.printf("\n%2d|%-22s│%-20s│%-18s│%-22s│%6.2f€              ",(i+1),mar[i],mod[i],vel[i],nnu[i],pre[i]);
      }
    }
    System.out.print("\n  ├──────────────────────────────────────────────────────────────────────┤");
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
