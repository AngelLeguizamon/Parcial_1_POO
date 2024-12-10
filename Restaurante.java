package restaurante;

import java.util.*;
public class Restaurante {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //try {                                                                 Se usa el try para manejar errores
            
            System.out.println("Bienvenido a UN Restaurante" );
            System.out.println("1) Menu" );
            System.out.println("2) Realizacion de pedidos" );
            System.out.println("digite el numero de la opcion deseada" );
            int opcion1 = s.nextInt();
            
            if (opcion1 == 1){
                System.out.println("MENU, Los platos disponibles son: " );
                System.out.println("A) Pasta,   B) Sopa,   C) Pollo" );
                System.out.println("1) Agregar plato" );
                System.out.println("2) Eliminar plato" );
                System.out.println("3) Modificar plato" );
                System.out.println("digite el numero de la opcion deseada" );
                int opcion2 = s.nextInt();
                
                if (opcion2 == 1){
                System.out.println("MENU/ Agregar plato" );
                
                System.out.println("Nombre del plato: " );
                String nn = s.nextLine();
                System.out.println(" " );
                String nombrePlato = s.nextLine();
                System.out.println("Tiempo de preparacion en minutos: " );
                int tiempo = s.nextInt();
                
                System.out.println("El plato creado es: " + nombrePlato);
                System.out.println("Tiempo de preparacion: " + tiempo + " minutos");
                
                System.out.println("1) Regresar a MENU" );
                System.out.println("digite el numero de la opcion deseada" );
                int opcion3 = s.nextInt();
                }
            
                
            } if (opcion1 == 2) {
                System.out.println("Realizacion de pedidos: " );
                System.out.println("Tienes los siguientes pedidos: " );
                System.out.println("1) 5 pedidos de Pasta" );
                System.out.println("2) 2 pedidos de Sopa" );
                System.out.println("3) 1 pedido de Pollo" );
                
                System.out.println("digite el numero de la opcion deseada" );
                int opcion4 = s.nextInt();
                
                if (opcion4 == 1) {
                    System.out.println("5 pedidos de Pasta para:" );
                    System.out.println("1) mesa 1 " );
                    System.out.println("2) mesa 2 " );
                    System.out.println("3) mesa 4 " );
                    System.out.println("4) CL 23 # 104-56 " );
                    System.out.println("5) CL 48 # 123-18 " );
                } if (opcion4 == 2) {
                    System.out.println("2 pedidos de Pasta para:" );
                    System.out.println("1) mesa 1 " );
                    System.out.println("5) CL 48 # 123-18 " );
                } if (opcion4 == 3) {
                    System.out.println("1 pedido1 de Pasta para:" );
                    System.out.println("1) CL 48 # 123-18  " );
                }
                
                
                
                
            }
            }

       
        
        //} catch (ImputMismatchExeption e) {                                      //Si se detecta la exepcion ImputMismatchExeption
        //    System.out.print("ERROR: No ingreso un valor valido");               //imprime mensaje de error
        //} 
   
        
        
    }
}



