package com.echoclsaa.metadata.core.spi;


public interface DataSourceDelegator {

    String getType();


    Object getDataSource();

    DataSourceExecuteResponse executeDML(DataSourceExecuteRequest request);
}
