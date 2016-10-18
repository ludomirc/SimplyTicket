package org.qbit.simpliticket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Benek on 18.10.2016.
 */
@Entity
@Table(name = "SUPPLIER")
public class Supplier extends AbstractEntity {

    @Column(name = "NAME", nullable = false)
    private String Name;

    @Column(name = "DESCRIPTION", nullable = false)
    private String Description;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
