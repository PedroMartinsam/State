package domains.state;

import domains.Pedido;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PagoState implements State {

    private Pedido pedido;

    public PagoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        try {
            throw new Exception("Operação não suportada - pedido já foi pago");
        } catch (Exception ex) {
            Logger.getLogger(CanceladoState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(new CanceladoState(pedido));
    }

    @Override
    public void despacharPedido() {
        this.pedido.setEstadoAtual(new EnviadoState(pedido));
    }


}
