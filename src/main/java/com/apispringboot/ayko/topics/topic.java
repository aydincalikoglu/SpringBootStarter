package com.apispringboot.ayko.topics;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class topic {

    @Id
    private String id;
    private String name;
    private String description;



    public topic() {
    }


    public topic(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }



}
