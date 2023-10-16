package com.Test_WTL.Test_WTL.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "cargo")
@Table(name = "cargo")
public class CargoEntity extends AbstractEntity<Long>{


    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "departamento_id_fk")
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
