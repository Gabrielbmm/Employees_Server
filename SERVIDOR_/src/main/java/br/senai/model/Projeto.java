package br.senai.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity(name = "projeto")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max=100)
    @NotNull
    private String nome;
    private Date datainicial;

    @Column(name="data_final")
    private Date dataFinal;

    @Size(max = 60)
    private String status;

    private double orcamento;

    //getter and setter
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Date getDatainicial() {return datainicial;}
    public void setDatainicial(Date datainicial) {this.datainicial = datainicial;}

    public Date getDataFinal() {return dataFinal;}
    public void setDataFinal(Date dataFinal) {this.dataFinal = dataFinal;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public double getOrcamento() {return orcamento;}
    public void setOrcamento(double orcamento) {this.orcamento = orcamento;}

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", datainicial=" + datainicial +
                ", dataFinal=" + dataFinal +
                ", status='" + status + '\'' +
                ", orcamento=" + orcamento +
                '}';
    }
}
