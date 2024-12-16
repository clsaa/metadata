package com.echoclsaa.metadata.common.model;

import lombok.Data;

import java.util.Map;

@Data
public class Model {

    private String tenant;

    private String namespace;

    private String code;

    private Integer order;

    private String name;

    private String description;

    private String type;

    private String subType;

    private String scene;

    private String subScene;

    private String version;

    private String uniqueCode;

    private String rowStatus;

    private Long rowVersion;

    private String bizStatus;

    private Map<String, Object> features;
}
