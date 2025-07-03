package domains;

import domains.state.AguardandoPagamentoState;
import domains.state.State;

public class Pedido {

    private State estadoAtual;

    public Pedido(){
        System.out.println("Pedido aguardando pagamento");
        this.estadoAtual = new AguardandoPagamentoState(this);
    }
    public void sucessoAoPagar(){
        try {
            System.out.printf("Pedido Pago");
            this.estadoAtual.sucessoAoPagar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void cancelarPedido(){
        try {
            System.out.println("Pedido Cancelar");
            this.estadoAtual.cancelarPedido();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void despacharPedido(){
        try {
            System.out.println("Pedido Enviado");
            this.estadoAtual.despacharPedido();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void setEstadoAtual(State estadoAtual){
        this.estadoAtual = estadoAtual;
    }
}
