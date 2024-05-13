import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        menu();
    }


    /**
     * Este metodo muestra por pantalla un menu que permita el usuario interactuar con el sistema
     */
    public static void menu() {
    GestionUsuarioss gestionUsuarios = new GestionUsuarioss();
    GestionViajess gestionViajes = new GestionViajess(); // Crear una instancia de GestionViajess

    int respuesta=0;
    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación de compartir coche!");

        if (!gestionUsuarios.getUsuarioLogueado()){
            System.out.println("Menu:\n 1.Registrar Usuario \n 2.Iniciar Sesión \n 0.Salir");
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    gestionUsuarios.registrarUsuario();
                    break;
                case 2:
                    gestionUsuarios.iniciarSesion();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro sistema");
            }
        }
        if (gestionUsuarios.getUsuarioLogueado()){
            System.out.println("Menu:\n 1.mostrarUsuario \n 2.mostrar Usuario Actual \n 3.Buscar Viajes Disponibles \n 4. Publicar Viaje \n 5. Mostrar Viaje \n 0.Salir");
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    gestionUsuarios.mostrarUsuarios();
                    break;
                case 2:
                    gestionUsuarios.mostrarUsuario();
                    break;
                case 3:
                    gestionViajes.buscarViajesDisponibles(); // Llamar a la función buscarViajesDisponibles de GestionViajess
                    break;
                case 4:
                    gestionViajes.publicarViaje();
                    break;
                case 5:
                    gestionViajes.mostrarViajes();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro sistema");
            }
        }


    } while (respuesta != 0);


}}