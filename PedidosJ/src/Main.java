import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(25, new Date(), 10.5, "prueba");
        pedido.solicitar();
        pedido.cancelarPedido();
        pedido.cancelarPedido();
    }
}