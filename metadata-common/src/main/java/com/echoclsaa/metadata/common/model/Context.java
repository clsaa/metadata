package com.echoclsaa.metadata.common.model;

import lombok.Data;

import java.util.Map;

@Data
public class Context {

    private Map<String, Object> input;

    private Map<String, Object> buffer;

    private Map<String, Object> output;

}
