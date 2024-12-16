package com.echoclsaa.metadata.dag.model;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DagNode extends Model {
    private Object source;
}
