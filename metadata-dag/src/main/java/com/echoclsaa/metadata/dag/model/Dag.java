package com.echoclsaa.metadata.dag.model;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Dag extends Model {

    private List<DagNode> rootDagNodes;

    private List<DagEdge> dagEdges;

    private List<DagNode> dagNodes;
}

