package com.echoclsaa.metadata.core.model.define;

import com.echoclsaa.metadata.common.model.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class EntityDefine extends Model {

    List<EntityFieldDefine> entityFieldDefineDefines;

}