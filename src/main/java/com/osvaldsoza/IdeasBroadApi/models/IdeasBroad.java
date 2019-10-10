package com.osvaldsoza.IdeasBroadApi.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "idea")
@Setter
@Getter
public class IdeasBroad {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public Long id;
    private String title;
    private String description;
}
