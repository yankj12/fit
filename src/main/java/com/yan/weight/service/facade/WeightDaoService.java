package com.yan.weight.service.facade;

import java.util.List;
import java.util.Map;

import com.yan.weight.schema.Weight;

public interface WeightDaoService {

public final static String MAPPER_NAME_SPACE ="com.yan.weight.mapping.WeightMapper";

	boolean insertWeight(Weight weight);
	
	int countWeight(Map<String, Object> condition);
	
	List<Weight> queryWeights(Map<String, Object> condition);
	
	Weight queryWeightById(int id);
}
