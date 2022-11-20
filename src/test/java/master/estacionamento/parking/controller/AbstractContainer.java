package master.estacionamento.parking.controller;

import org.testcontainers.containers.PostgreSQLContainer;

public abstract class AbstractContainer {

    static final PostgreSQLContainer POSTGRE_SQL_CONTAINER;

    static {
        POSTGRE_SQL_CONTAINER = new PostgreSQLContainer("");
        POSTGRE_SQL_CONTAINER.start();

        System.out.println("**************" + POSTGRE_SQL_CONTAINER.getJdbcUrl());

        System.setProperty("spring.datasource.url", POSTGRE_SQL_CONTAINER.getJdbcUrl());
        System.setProperty("spring.datasource.username", POSTGRE_SQL_CONTAINER.getUsername());
        System.setProperty("spring.datasource.password", POSTGRE_SQL_CONTAINER.getPassword());

    }

}
