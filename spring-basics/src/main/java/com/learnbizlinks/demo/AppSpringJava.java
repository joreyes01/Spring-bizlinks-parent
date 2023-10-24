package com.learnbizlinks.demo;

import com.learnbizlinks.demo.spring.configuration.MyAppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TODO Intentar - Más de un archivo de configuración

public class AppSpringJava {

    // TODO 1: Configurar el contexto de Spring (@Configuration)
    // TODO 2: Crear el primer Spring Bean (@Bean)
    // TODO 3: Iniciar el contexto de Spring (Spring Context)
    // TODO 4: Mostrar los Beans inicializados

    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext(MyAppConfiguration.class);

        // TODO 1: Listar todos los Beans - ToString (Java 8) vs Java Records (Java 17 -15*)
//        System.out.println(ctx.getBean("age"));
//        System.out.println(ctx.getBean("name"));
//        System.out.println(ctx.getBean(Address.class));

//        for (int i=0; i< ctx.getBeanDefinitionCount(); i++) {
//            System.out.println(ctx.getBeanDefinitionNames()[i]);
//        }
        //API Stream foreach
//        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println(ctx.getBean("personRecord")); //toString
//        System.out.println(ctx.getBean("personUsingClass")); //toString -> Muestra espacio en memoria JVM -> Atributos

        // TODO 2: Relaciones entre Beans (Parámetro y Métodos) (Person.class & Beans: name, age, address)
//        System.out.println(ctx.getBean("personParameters"));
//        System.out.println(ctx.getBean("personMethodCall"));

        // TODO 3: Múltiple Candidatos a inyectar (Person.class) - @Primary
        //System.out.println(ctx.getBean(PersonRecord.class));

        // TODO 4: Múltiple Candidatos a inyectar (Person.class) - @Qualifier & Bean Names
        //System.out.println(ctx.getBean("personParameters"));

        // TODO 5: Usar los Spring Beans (class & casting)
//        ((Datasource)ctx.getBean("myDatasource")).getDatasource();
//        ctx.getBean(Datasource.class).getDatasource();

        // TODO LAB : Desacoplamiento nivel 3

        // TODO 6: Estereotipo @Component vs @Bean (Datasource.class)
        //ctx.getBean(Datasource.class).getDatasource();

        // TODO 7: Usando Componentes - Mismo Package
        //Done @Component vs @Beans
        // TODO 8: Usando Componentes - Distinto Package - Component Scan
        //Done

        // TODO 9 : @PostConstruct @PreDestroy (New Main class)
        //ctx.close();

        // TODO 10: Parametrizando @PropertySource (Config)
        // Clase de configuración - Inicialicen la aceptación de variables/parametros
        // Impriman en pantalla su Nombre
        // TODO 11: Spring Boot

        //// Actividad: 30 minutos (Evaluada) 5:38
        //- Clase(Record), (Lombok) Persona (String name, String lastname, int age)
        //- Agregarla al contexto de Spring @Configuration y @Bean
        //- Llenar los atributos de la clase persona con parámetros del archivo application.properties
        //- Mostrar en pantalla al Bean Persona con sus atributos

    }
}
