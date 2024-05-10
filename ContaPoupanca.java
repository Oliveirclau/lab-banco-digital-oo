public class ContaPoupanca extends Conta{

    private double taxaDeJuros;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
