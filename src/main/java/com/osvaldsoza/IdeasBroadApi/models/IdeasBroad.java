package com.osvaldsoza.IdeasBroadApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "idea")
@Setter
@Getter
public class IdeasBroad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @NotNull
    private String title;
    @NotNull
    private String description;
}
