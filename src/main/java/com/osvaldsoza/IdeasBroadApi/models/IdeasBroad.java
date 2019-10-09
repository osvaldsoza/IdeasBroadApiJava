package com.osvaldsoza.IdeasBroadApi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "idea")
@Setter
@Getter
public class IdeasBroad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String title;
    private String description;
}
