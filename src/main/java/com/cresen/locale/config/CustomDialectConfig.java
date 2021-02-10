package com.cresen.locale.config;

import org.hibernate.dialect.PostgreSQL82Dialect;
import org.hibernate.type.StringType;
import org.springframework.context.annotation.Configuration;

import java.sql.Types;

@Configuration
public class CustomDialectConfig extends PostgreSQL82Dialect {

    public CustomDialectConfig() {
        super();
        registerHibernateType(Types.OTHER, StringType.INSTANCE.getName());

    }
}
