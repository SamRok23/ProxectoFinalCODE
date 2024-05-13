import java.util.Scanner;

public class GestionViajess {

    Scanner scanner = new Scanner(System.in);
    GestionUsuarioss usuarios=new GestionUsuarioss();

    Viaje[]viajes =new Viaje[50];
    int contadorViajes=0;
    /**
     * Este metodo gestiona la busquedaViajesDisponibles sin recibir parametros
     *
     */
    public void buscarViajesDisponibles() {
            // Búsqueda de viaje
            System.out.println("Por favor, introduzca el punto de origen:");
            String puntoOrigen = scanner.nextLine();
            System.out.println("Por favor, introduzca el punto de destino:");
            String puntoDestino = scanner.nextLine();
            System.out.println(" Buscando viajes disponibles desde: " + puntoOrigen  + " a " + puntoDestino);
            System.out.println("Por favor, introduzca la fecha (DD/MM/AAAA):");
            String fecha = scanner.nextLine();
            System.out.println("Por favor, introduzca el número de plazas disponibles:");
            int plazasDisponibles = scanner.nextInt();
            System.out.println(" ¡Perfecto! el día " + fecha + " tendrá su coche preparado " );
            System.out.println(" Si no desea realizar otra operación, pulse 0 ");

            // Aquí puedes continuar con la lógica de búsqueda de viajes usando los datos ingresados por el usuario
        }
    /**
     * Este metodo gestiona la creacion y publicación de viajes  sin recibir parametros
     *
     */
    public void publicarViaje() {

        System.out.println("Ahora con este método podras crear tu viaje y publicarlo");
        System.out.println("Introduzca la duración deseada del viaje (en horas):");
        int duración = scanner.nextInt();

        System.out.println("¿Qué tipo de transporte desea utilizar?");
        scanner.nextLine(); // Consumir nueva línea pendiente
        TipoDeTransporte tipoDeTransporte = TipoDeTransporte.valueOf(scanner.nextLine());

        System.out.println("Por favor, introduzca la fecha (DD/MM/AAAA):");
        String fecha = scanner.nextLine();

        System.out.println("¿Número de plazas deseado?");
        int numeroPlazas = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea pendiente

        System.out.println("Introduzca la ciudad de origen");
        String ciudadOrigen = scanner.nextLine();

        System.out.println("Introduzca la ciudad de destino");
        String ciudadDestino = scanner.nextLine();


        Viaje viaje = new Viaje(duración, tipoDeTransporte, numeroPlazas, usuarios.usuarioActual, ciudadDestino, ciudadOrigen, fecha);
        viajes[contadorViajes]=viaje;
        this.contadorViajes++;
        System.out.println(" ¡Perfecto su viaje ha sido creado con éxito! ");
        System.out.println("Ahora le pondremos los datos que nos ha dado usted para ver si no nos hemos equivocado: ");

        System.out.println(" duración: " + duración);
        System.out.println(" TipoDeTransporte: " + tipoDeTransporte);
        System.out.println(" mumeroDePlazas: " + numeroPlazas);
        System.out.println(" ciudadOrigen: " + ciudadOrigen);
        System.out.println(" ciudadDestino: " + ciudadDestino);
        System.out.println(" fecha: " + fecha);



    }
    public void mostrarViajes (){
        for(int contador=0;contador<contadorViajes;contador++){
            System.out.println("Viaje:" + contador +"**********************************************");
            System.out.println("Ciudad de Origen: " + viajes[contador].getCiudadOrigen());
            System.out.println("Ciudad de Destino: " + viajes[contador].getCiudadDestino());
            System.out.println("Fecha: " + viajes[contador].getFecha());


        }
    }
}

