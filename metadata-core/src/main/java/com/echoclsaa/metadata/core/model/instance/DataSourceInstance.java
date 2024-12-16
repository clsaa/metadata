package com.echoclsaa.metadata.core.model.instance;

import com.echoclsaa.metadata.common.model.Model;
import com.echoclsaa.metadata.core.model.define.DataSourceDefine;
import com.echoclsaa.metadata.core.spi.DataSourceDelegator;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataSourceInstance extends Model {

    private DataSourceDefine define;

    private DataSourceDelegator dataSource;

}
