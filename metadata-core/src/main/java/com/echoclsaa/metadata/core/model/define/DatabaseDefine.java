package com.echoclsaa.metadata.core.model.define;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DatabaseDefine extends Model {

    private String databaseName;

    private String databaseComment;

    private String databaseType;

    private List<TableDefine> tableDefines;
}
