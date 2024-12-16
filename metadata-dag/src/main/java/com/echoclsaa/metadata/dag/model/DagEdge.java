package com.echoclsaa.metadata.dag.model;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DagEdge extends Model {

    private DagNode fromDagNode;

    private DagNode toDagNode;

}
