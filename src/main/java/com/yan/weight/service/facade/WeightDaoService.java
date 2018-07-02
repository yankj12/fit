package com.yan.weight.service.facade;

import java.util.List;

import com.yan.weight.schema.Weight;

public interface WeightDaoService {

public final static String MAPPER_NAME_SPACE ="com.yan.weight.mapping.WeightMapper";

	boolean insertWeight(Weight weight);
	
	int countWeight();
	
	List<Weight> queryWeights();
	
	Weight queryWeightById(int id);
}
