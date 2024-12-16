package com.echoclsaa.metadata.common.enums;

import java.math.BigDecimal;
import java.util.Date;

public enum TypeMappingEnums {
    
    STRING("STRING", "STRING", "varchar", String.class),
    DECIMAL("DECIMAL", "DECIMAL", "decimal", BigDecimal.class),
    INTEGER("INTEGER", "INTEGER", "int", Integer.class),
    BASIC_INTEGER("BASIC_INTEGER", "BASIC_INTEGER", "int", int.class),
    LONG("LONG", "LONG", "bigint", Long.class),
    BASIC_LONG("BASIC_LONG", "BASIC_LONG", "bigint", long.class),
    DATE("DATE", "DATE", "datetime", Date.class);

    TypeMappingEnums(String code, String desc, String jdbcType, Class javaType) {
        this.code = code;
        this.desc = desc;
        this.jdbcType = jdbcType;
        this.javaType = javaType;
    }


    private final String code;
    private final String desc;
    private final String jdbcType;
    private final Class javaType;

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public Class getJavaType() {
        return javaType;
    }

    public static TypeMappingEnums of(String code) {
        for (TypeMappingEnums value : TypeMappingEnums.values()) {
            if (value.name().equals(code)) {
                return value;
            }
        }
        return null;
    }

    public static TypeMappingEnums of(Class clazz) {
        for (TypeMappingEnums value : TypeMappingEnums.values()) {
            if (value.getJavaType().equals(clazz)) {
                return value;
            }
        }
        return null;
    }
}
