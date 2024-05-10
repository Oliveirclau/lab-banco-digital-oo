public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

    }
}
