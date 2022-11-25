package com.phoenixdian.io.entity;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private Integer age;
    private static final long serializationUID=1L;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}