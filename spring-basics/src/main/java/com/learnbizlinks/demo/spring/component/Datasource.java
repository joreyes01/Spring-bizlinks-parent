package com.learnbizlinks.demo.spring.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// Java 11 - 15 (import jakarta.snsns.sss) JEE2
// Java 17
//@Component
public class Datasource {
    public void getDatasource() {
        //TODO Objeto de tipo Datasorce -> URL, user, password, puertos, conecction, ddl
        System.out.println("Se ha obtenido el datasource");
    }

    @PostConstruct//Luego de inicializar la inyección de dependeica (Spring Context)
    //ComandLineRunner
    public void init () {
        System.out.println("Ejecuta Query");
    }

    @PreDestroy//Antes de terminar Spring Context), ejecuto el método
    //Cerrar manualmente el ctx de Spring
    //Eliminar el Bean creado
    public void cleanUp() {
        System.out.println("Estoy invocandome luego de terminar la aplicación");
    }
}
