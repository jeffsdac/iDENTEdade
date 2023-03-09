package br.com.fiap.identedade.models;

public class Consulta {

    private int cdConsulta;
    private int cdUsuario;
    private int cdClinica;
    private String nomeMedico;
    private String descricao;
    private float preco;


    public Consulta(int cdConsulta, int cdUsuario, int cdClinica, String nomeMedico, String descricao, float preco) {
        this.cdConsulta = cdConsulta;
        this.cdUsuario = cdUsuario;
        this.cdClinica = cdClinica;
        this.nomeMedico = nomeMedico;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCdConsulta() {
        return cdConsulta;
    }
    public void setCdConsulta(int cdConsulta) {
        this.cdConsulta = cdConsulta;
    }

    public int getCdUsuario() {
        return cdUsuario;
    }
    public void setCdUsuario(int cdUsuario) {
        this.cdUsuario = cdUsuario;
    }
    public int getCdClinica() {
        return cdClinica;
    }
    public void setCdClinica(int cdClinica) {
        this.cdClinica = cdClinica;
    }
    public String getNomeMedico() {
        return nomeMedico;
    }
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    

    
}
