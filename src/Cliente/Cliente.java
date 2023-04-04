package Cliente;

public class Cliente {
        private String nombre;
        private String apellido;
        private String telefono;
        private String tipo;
        private String direccion;

        public Cliente(String nombre, String apellido, String telefono, String tipo, String direccion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.telefono = telefono;
            this.tipo = tipo;
            this.direccion = direccion;
        }

        // getters y setters
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public String getTelefono() {
            return telefono;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        public String getDireccion() {
            return direccion;
        }
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", tipo='" + tipo + '\'' +
                    ", direccion='" + direccion + '\'' +
                    '}';
        }

    }

