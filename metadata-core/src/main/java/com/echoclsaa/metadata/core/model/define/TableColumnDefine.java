package com.echoclsaa.metadata.core.model.define;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TableColumnDefine extends Model {

    private String columnName;

    private String columnType;

    private String columnComment;

    private String columnDefault;
}
