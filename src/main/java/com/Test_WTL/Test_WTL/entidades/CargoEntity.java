package com.Test_WTL.Test_WTL.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_cargo")
public class CargoEntity extends AbstractEntity<Long>{

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private DepartamentoEntity departamento;

    @OneToMany(mappedBy = "cargo")
    private List<FuncionarioEntity> funcionario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DepartamentoEntity getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoEntity departamento) {
        this.departamento = departamento;
    }

    public List<FuncionarioEntity> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<FuncionarioEntity> funcionario) {
        this.funcionario = funcionario;
    }
}
