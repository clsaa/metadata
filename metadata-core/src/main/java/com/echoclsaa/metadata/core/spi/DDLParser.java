package com.echoclsaa.metadata.core.spi;

import com.echoclsaa.metadata.core.model.define.TableDefine;

public interface DDLParser {

    TableDefine parseTable(String createTableScript);

}
