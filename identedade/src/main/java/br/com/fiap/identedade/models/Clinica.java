package br.com.fiap.identedade.models;

public class Clinica {

    private int cdClinica;
    private String nome;
    private String email;
    private String senha;

    public Clinica(int cdClinica, String nome, String email, String senha) {
        this.cdClinica = cdClinica;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getCdClinica() {
        return cdClinica;
    }

    public void setCdClinica(int cdClinica) {
        this.cdClinica = cdClinica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}
