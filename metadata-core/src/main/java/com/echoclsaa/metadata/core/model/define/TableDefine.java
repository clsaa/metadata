package com.echoclsaa.metadata.core.model.define;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TableDefine extends Model {

    private String tableName;

    private String tableComment;

    private List<TableColumnDefine> tableColumnDefines;

    private List<TableIndexDefine> tableIndexDefines;
}
