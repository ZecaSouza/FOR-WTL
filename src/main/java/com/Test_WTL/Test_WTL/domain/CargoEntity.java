package com.Test_WTL.Test_WTL.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "cargo")
public class CargoEntity extends AbstractEntity<Long> {

    @NotBlank(message = "O nome do cargo é obrigatório.")
    @Size(max = 60, message = "O nome do cargo deve conter no máximo 60 caracteres.")
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @NotNull(message = "Selecione o departamento relativo ao cargo.")
    @ManyToOne
    @JoinColumn(name = "departamento_id_fk")
    private DepartamentoEntity departamento;

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
}

