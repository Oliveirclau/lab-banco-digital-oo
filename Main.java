public class Main {
    public static void main(String[] args) {
        Cliente claudio = new Cliente();
        claudio.setNome("Cláudio");

        Conta cc = new ContaCorrente(claudio);
        Conta poupanca = new ContaPoupanca(claudio);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimir();
        poupanca.imprimir();
    }
}
