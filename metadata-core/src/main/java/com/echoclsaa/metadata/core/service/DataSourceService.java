package com.echoclsaa.metadata.core.service;

import com.echoclsaa.metadata.core.model.define.DataSourceDefine;
import com.echoclsaa.metadata.core.model.instance.DataSourceInstance;

public interface DataSourceService {

    DataSourceInstance generateDataSource(DataSourceDefine dataSourceDefine);

}
