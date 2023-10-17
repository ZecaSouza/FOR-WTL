package com.Test_WTL.Test_WTL.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "departamento")
public class DepartamentoEntity extends AbstractEntity<Long>{

    @NotBlank(message = "Informe um nome")
    @Size(min = 3, max = 60, message = "O nome do departamento deve ter entre {min} e {max} caracteres.")
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<CargoEntity> cargos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CargoEntity> getCargo() {
        return cargos;
    }

    public void setCargo(List<CargoEntity> cargo) {
        this.cargos = cargo;
    }

}
