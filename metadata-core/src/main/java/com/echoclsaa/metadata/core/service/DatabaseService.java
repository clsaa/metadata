package com.echoclsaa.metadata.core.service;

import com.echoclsaa.metadata.core.model.define.DatabaseDefine;
import com.echoclsaa.metadata.core.model.instance.DataSourceInstance;

public interface DatabaseService {

    DatabaseDefine parseDatabase(DataSourceInstance dataSourceInstance, boolean parseTableDefine);

}
