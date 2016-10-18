package org.qbit.simpliticket.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Benek on 17.10.2016.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable, Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private int version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.id == null) return false;

        if (o instanceof AbstractEntity && o.getClass().equals(this.getClass())) {
            return this.id.equals(((AbstractEntity) o).id);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
        return hash;
    }
}
