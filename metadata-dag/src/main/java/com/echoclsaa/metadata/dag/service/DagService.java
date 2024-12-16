package com.echoclsaa.metadata.dag.service;

import com.echoclsaa.metadata.dag.model.Dag;
import com.echoclsaa.metadata.dag.model.DagEdge;
import com.echoclsaa.metadata.dag.model.DagNode;

import java.util.List;

public interface DagService {

    Dag parseDag(List<DagNode> dagNodes, List<DagEdge> dagEdges);

    boolean hasCycle(Dag dag);

    List<DagNode> topologicalDagNodes(Dag dag);
}
