package com.Test_WTL.Test_WTL.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "departamento")
@Table(name = "departamento")
public class DepartamentoEntity extends AbstractEntity<Long>{


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
