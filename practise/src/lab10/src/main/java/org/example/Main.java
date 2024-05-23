package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

interface Musician {
    void doCoding();
}

class Drummer implements Musician {
    @Override
    public void doCoding() {
        System.out.println("Drummer is drumming");
    }
}

class Guitarist implements Musician {
    @Override
    public void doCoding() {
        System.out.println("Guitarist is playing the guitar");
    }
}

class Trombonist implements Musician {
    @Override
    public void doCoding() {
        System.out.println("Trombonist is playing the trombone");
    }
}

@Configuration
class AppConfig {
    @Bean(name = "drummer")
    public Musician drummer() {
        return new Drummer();
    }

    @Bean(name = "guitarist")
    public Musician guitarist() {
        return new Guitarist();
    }

    @Bean(name = "trombonist")
    public Musician trombonist() {
        return new Trombonist();
    }
}


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Application <beanName>");
            return;
        }

        String beanName = args[0];

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Musician musician = context.getBean(beanName, Musician.class);
        musician.doCoding();
    }
}