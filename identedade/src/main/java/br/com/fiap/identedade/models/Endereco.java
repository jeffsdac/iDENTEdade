package br.com.fiap.identedade.models;

public class Endereco {

    private int cdClinica;
    private String logradouro;
    private String estado;
    private int numero;
    
    public Endereco(int cdClinica, String logradouro, String estado, int numero) {
        this.cdClinica = cdClinica;
        this.logradouro = logradouro;
        this.estado = estado;
        this.numero = numero;
    }

    public int getCdClinica() {
        return cdClinica;
    }

    public void setCdClinica(int cdClinica) {
        this.cdClinica = cdClinica;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
}
