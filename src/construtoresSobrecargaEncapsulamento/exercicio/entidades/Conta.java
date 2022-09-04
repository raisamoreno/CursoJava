package construtoresSobrecargaEncapsulamento.exercicio.entidades;

import java.util.Scanner;

public class Conta {

    private String numeroDaConta;
    private String titular;
    private double deposito;
   

    public Conta(String numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public Conta(String numeroDaConta, String titular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.deposito = deposito;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDeposito() {
        return deposito;
    }

    public void depositar(double dinheiroDepositadoNaConta) {
            deposito += dinheiroDepositadoNaConta;
    }

    public void sacar(double dinheiroDepositadoNaConta) {

        deposito -= dinheiroDepositadoNaConta + 5.0;

    }

    public String toString(){
        return "Conta " +
                numeroDaConta +
                ", titular: " +
                titular +
                ", saldo: $ " +
                String.format("%.2f", deposito);
    }

}
