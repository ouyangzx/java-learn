package org.acme.spring.data.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fruit {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String color;

    @OneToOne()
    private Type type;


    public Fruit() {
    }

    public Fruit(String name, String color,Type type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
