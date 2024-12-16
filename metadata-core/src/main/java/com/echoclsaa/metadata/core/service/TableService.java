package com.echoclsaa.metadata.core.service;

import com.echoclsaa.metadata.core.model.define.TableDefine;

import java.util.List;

public interface TableService {

    List<TableDefine> parseTable(String sqlType, String createTableScripts);

}
