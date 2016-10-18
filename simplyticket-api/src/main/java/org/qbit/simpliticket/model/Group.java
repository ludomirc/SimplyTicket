package org.qbit.simpliticket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Benek on 18.10.2016.
 */
@Entity
@Table(name = "GROUPS")
public class Group extends AbstractEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "GROUP_ID", nullable = false, unique = true)
    private String groupId;

}
