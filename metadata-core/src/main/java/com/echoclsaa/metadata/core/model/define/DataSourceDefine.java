package com.echoclsaa.metadata.core.model.define;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataSourceDefine extends Model {

    private String driver;

    private String url;

    private String username;

    private String password;
}
