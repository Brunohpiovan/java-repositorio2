package entities;

public class Conta {
    private Integer numero;
    private String titular;
    protected double saldo;

    public Conta(){
    }

    public Conta(Integer numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double quantidade){
        this.saldo -= quantidade + 5.0;
    }

    public void deposito(double quantidade){
        this.saldo += quantidade;
    }

}
