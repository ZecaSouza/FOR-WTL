package com.Test_WTL.Test_WTL.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    @Override
    public String toString() {
        return "id =" + id;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity<?> that = (AbstractEntity<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}