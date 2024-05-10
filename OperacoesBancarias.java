public interface OperacoesBancarias {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, OperacoesBancarias contaDestino);
    void imprimir();
}
