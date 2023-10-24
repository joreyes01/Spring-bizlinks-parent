package com.learnbizlinks.demo.spring.model;

//TODO Crear un nuevo Bean que retorno un atributo de Person(name, age, address) y mostarlo
//Tipo de clase implementado en Java 15
//Abstrae la lógica de los Java Beans (Serializable)
//Usualmente se utiliza en DTO's

public record PersonRecord(
        String name,
        int age,
        Address address
) {
}
