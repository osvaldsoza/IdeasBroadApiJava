package com.osvaldsoza.IdeasBroadApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Setter
@Getter
public class IdeasBroad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @NotNull
    private String title;
    @NotNull
    private String description;
//    @Column(name = "created", columnDefinition = "created default CURRENT_TIMESTAMP")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dateCreated;
}
