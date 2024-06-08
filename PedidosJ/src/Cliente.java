import java.util.List;

    public class Cliente {
        private int idCliente;
        private String nombre;
        private String direccion;
        private String telefono;
        private String correo;
        private int edad;
        private List<Pedido> pedidos;

        public Cliente(int idClienteC, String nombreC, String direccionC, String telefonoC, String correoC, int edadC, List<Pedido> pedidoC) {
            this.idCliente = idClienteC;
            this.nombre = nombreC;
            this.direccion = direccionC;
            this.telefono = telefonoC;
            this.correo = correoC;
            this.edad = edadC;
            this.pedidos = pedidoC;
        }

        public void agregarPedido(Pedido pedido) {
            System.out.println("Agregando pedido");
        }

        public void eliminarPedido(Pedido pedido) {
            System.out.println("Eliminando pedido");
        }

        public void actualizarDatos() {
            System.out.println("Actualizando datos");
        }

        public void verHistorial() {
            System.out.println("Historial de pedido");
        }

        public int getIdCliente() {
            return this.idCliente;
        }

        public void setIdCliente(int idCliente) {
            this.idCliente = idCliente;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return this.direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return this.telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getCorreo() {
            return this.correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public List<Pedido> getPedidos() {
            return this.pedidos;
        }

        public void setPedidos(List<Pedido> pedidos) {
            this.pedidos = pedidos;
        }
}
