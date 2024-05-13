public class Usuario {
        private String nombreUsuario;
        private String correoElectronico;
        private String contrasena;


        public Usuario(String nombreUsuario, String correoElectronico, String contrasena) {
            this.nombreUsuario = nombreUsuario;
            this.correoElectronico = correoElectronico;
            this.contrasena = contrasena;
        }


        public String getNombreUsuario() {
            return nombreUsuario;
        }

        public void setNombreUsuario(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }
    }


