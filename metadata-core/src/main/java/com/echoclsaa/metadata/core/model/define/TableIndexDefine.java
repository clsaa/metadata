package com.echoclsaa.metadata.core.model.define;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TableIndexDefine extends Model {

    private String indexName;

    private String indexType;

    private String indexColumns;

    private String indexComment;
}
