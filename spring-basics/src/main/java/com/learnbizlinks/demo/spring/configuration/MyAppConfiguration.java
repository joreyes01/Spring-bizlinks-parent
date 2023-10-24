package com.learnbizlinks.demo.spring.configuration;

import com.learnbizlinks.demo.spring.model.Address;
import com.learnbizlinks.demo.spring.model.PersonClass;
import com.learnbizlinks.demo.spring.model.PersonRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(value = "com.learnbizlinks.demo.spring")
@PropertySource(value = "classpath:application.properties")
public class MyAppConfiguration {

    Environment env;

    public MyAppConfiguration(Environment env) {
        this.env = env;
    }

    @Bean
    public void initEnvironmentVariables() {
        System.out.println(env.getProperty("myapp.name"));
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean(name = "name1")
    public String name() {
        return "Jorge";
    }

    @Bean
    public String name2() {
        return "Mateo";
    }

    @Bean
    public Address address1() {
        return new Address("Lima", "Lima", "SMP", "Jr. Los canelos 242");
    }

    @Bean
    @Primary
    public PersonRecord personRecord() {
        return new PersonRecord("Marco", 11, new Address("Lima", "Lima", "SMP", "Jr. Los canelos 242"));
    }

    @Bean
    public PersonClass personUsingClass() {
        return new PersonClass("Jorge Aaron", 27, "Jr. Los canelos 242");
    }

    @Bean
    public PersonRecord personMethodCall() {
        return new PersonRecord(name(), age(), address1());
    }

    @Bean
    public PersonRecord personParameters(@Qualifier(value = "name1") String name2, int age, Address address) {
        return new PersonRecord(name2, age, address);
    }

//    @Bean(name = "myDatasource")
//    public Datasource datasource() {
//        return new Datasource();
//    }

}
