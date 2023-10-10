package com.Test_WTL.Test_WTL.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tb_departamentos")
public class DepartamentoEntity extends AbstractEntity<Long>{

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<CargoEntity> cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CargoEntity> getCargo() {
        return cargo;
    }

    public void setCargo(List<CargoEntity> cargo) {
        this.cargo = cargo;
    }

}
