package unrestaurante;

import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {                                  // Se declara la clase "MenuPrincipal"

    public void MostrarMenu() {                               // Método "MostrarMenu" de la clase "MenuPrincipal"

        Scanner scan = new Scanner(System.in);                // Se crea un objeto "scan" de la clase "Scanner"
        int opcionElegida = 0;                                // Se declara una Variable para guardar la elección del usuario
        boolean ProgramaActivo = true;                        // se declara variable para ejecutar mientras sea true

        do {                                                  // Bucle para mostrar el menú
            try {

                System.out.println("                                   ");
                System.out.println("                                   ");
                System.out.println("                                   ");

                System.out.println("----Bienvenido a UN Restaurante----");
                System.out.println("1) Platos del día");
                System.out.println("2) Realización de pedidos");
                System.out.println("3) Salir");
                System.out.println("_____________________________________");
                System.out.println("Digite el número de la opción deseada:");

                opcionElegida = scan.nextInt();               // Se pide un numero entero al usuario

                switch (opcionElegida) {
                    case 1:
                        MostrarPlatosDelDia(scan);            // Se ejecuta el metodo "MostrarPlatosDelDia" con parametro scan para no crearlo varias veces
                        break;
                    case 2:
                        MostrarRealizacionDePedidos(scan);
                        break;
                    case 3:
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("Gracias por usar UN restaurante.");
                        ProgramaActivo = false;               //Se cambia la condicion del bucle para finalizarlo
                        break;
                    default:                                  //De no ocurrir ninguna de las opciones anteriores...
                        System.out.println("Opción inválida, intente otra vez.");
                        break;
                }

            } catch (InputMismatchException e) {              // Captura errores al ingresar valores no válidos
                System.out.println("ERROR: Ingrese un valor numérico válido.");
                scan.nextLine();                              // Limpia el scanner
                opcionElegida = 0;                            // Reinicia la opción para continuar el bucle
            } catch (NoSuchElementException e) {System.out.println("Gracias por usar UN restaurante.");}

        } while (ProgramaActivo == true);                       // El bucle se ejecuta hasta que se elige la opción 4 (Salir)

        scan.close();                                         // Cierra el Scanner al finalizar
    }

    private void MostrarPlatosDelDia(Scanner scan) {                      // Método "MostrarMenu" de la clase "MenuPrincipal"

        int opcionElegida = 0;                                // Se declara una Variable para guardar la elección del usuario
        boolean SubMenu1Activo = true;                        // se declara variable para ejecutar mientras sea true

        do {                                                  // Bucle para mostrar el menú
            try {
                System.out.println("                                   ");
                System.out.println("                                   ");
                System.out.println("                                   ");

                System.out.println("-----------Platos del Dia----------");
                System.out.println("-Pasta, -Sopa, -Pollo");
                System.out.println("1) Agregar plato");
                System.out.println("2) Eliminar plato");
                System.out.println("3) Atras");
                System.out.println("_____________________________________");
                System.out.println("Digite el número de la opción deseada:");

                opcionElegida = scan.nextInt();               // Se pide un numero entero al usuario

                switch (opcionElegida) {
                    case 1:
                        System.out.println("Ingresa nombre del plato.");
                        break;
                    case 2:
                        System.out.println("Estas seguro de eliminar?");
                        break;
                    case 3:
                        SubMenu1Activo = false;
                        break;
                    default:
                        System.out.println("Opción inválida, intente otra vez.");
                        break;
                }

            } catch (InputMismatchException e) {              // Captura errores al ingresar valores no válidos
                System.out.println("ERROR: Ingrese un valor numérico válido.");
                scan.nextLine();                              // Limpia el scanner
                opcionElegida = 0;                            // Reinicia la opción para continuar el bucle
            }
        } while (SubMenu1Activo == true);                         // El bucle se ejecuta hasta que se elige la opción 4 (Salir)
    }    

    private void MostrarRealizacionDePedidos(Scanner scan) {                               // Método "MostrarMenu" de la clase "MenuPrincipal"

        int opcionElegida = 0;                                // Se declara una Variable para guardar la elección del usuario
        boolean SubMenu2Activo = true;                        // se declara variable para ejecutar mientras sea true

        do {                                                  // Bucle para mostrar el menú
            try {
                System.out.println("                                   ");
                System.out.println("                                   ");
                System.out.println("                                   ");

                System.out.println("------Realizar Pedidos del Dia-----");
                System.out.println("-Pasta, -Sopa, -Pollo");
                System.out.println("1) Entregar pedido");
                System.out.println("2) Rechazar pedido");
                System.out.println("3) Atras");
                System.out.println("_____________________________________");
                System.out.println("Digite el número de la opción deseada:");

                opcionElegida = scan.nextInt();               // Se pide un numero entero al usuario

                switch (opcionElegida) {
                    case 1:
                        System.out.println("Se notifico al Cliente.");
                        System.out.println("Tu pedido llegara en menos de una hora.");
                        break;
                    case 2:
                        System.out.println("Se notifico al Cliente.");
                        System.out.println("Lo sentimos, tu pedido fue rechazado");
                        break;
                    case 3:
                        SubMenu2Activo = false;
                        break;
                    default:
                        System.out.println("Opción inválida, intente otra vez.");
                        break;
                }

            } catch (InputMismatchException e) {              // Captura errores al ingresar valores no válidos
                System.out.println("ERROR: Ingrese un valor numérico válido.");
                scan.nextLine();                              // Limpia el scanner
                opcionElegida = 0;                            // Reinicia la opción para que el bucle continue
            }

        } while (SubMenu2Activo == true);                         // El bucle se ejecuta hasta que se elige la opción 4 (Salir)

    }    

}
