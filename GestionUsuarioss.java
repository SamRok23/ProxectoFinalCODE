import java.util.Scanner;

public class GestionUsuarioss {
    Scanner scanner = new Scanner(System.in);
    Usuario[] usuarios;
    static int contadorUsuarios;

    boolean usuarioLogueado;


    String usuarioActual;

    public GestionUsuarioss() {
        this.usuarios = new Usuario[50];
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public boolean getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(boolean usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    /**
     * Este metodo permite resgistrarte en la aplicacion con tu nombre correo y contraseña.
     */
    public void registrarUsuario() {
        System.out.println("Por favor, registre un nuevo usuario:");
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();
        Usuario nuevoUsuario = new Usuario(nombreUsuario, correoElectronico, contrasena);
        usuarios[contadorUsuarios] = nuevoUsuario;
        contadorUsuarios++;

        System.out.println("Usuario registrado con éxito.");
    }

    /**
     *  Este metodo permite iniciar sesion con el nombre con el cual te registrarte
     *    esto significa que si no pones el mismo nombre o contraseña falla.
     * @return devolvera verdadero o falso si el inicio de sesion es exitoso
     */
    public boolean iniciarSesion() {
        System.out.println("Por favor, inicie sesión:");
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        for(int contador=0;contador<contadorUsuarios;contador++){
                if(nombreUsuario.equals(this.usuarios[contador].getNombreUsuario())){
                    if(contrasena.equals(this.usuarios[contador].getContrasena())){
                        System.out.println("Login Exitoso");
                        this.setUsuarioLogueado(true);
                        this.usuarioActual= nombreUsuario;
                        return true;
                    }
                }
            }
        System.out.println("Login Fallido");

        return false;
    }

    /**
     * Este metodo muestra los usuarios registrados en el sistema
     */
    public void mostrarUsuarios (){
        for(int contador=0;contador<contadorUsuarios;contador++){
            System.out.println("Usuario:" + contador +"**********************************************");
            System.out.println("nombreUsuario: " + usuarios[contador].getNombreUsuario());
            System.out.println("correoUsuario: " + usuarios[contador].getCorreoElectronico());
        }
    }

    public void mostrarUsuario(){
        if(this.usuarioActual!=null){
            System.out.println("el usuario actual es: "+ usuarioActual);
        }
        else {
            System.out.println("ninguna sesion iniciada");
        }
    }


}
