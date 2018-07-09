package com.yan.weight.service.facade;

import java.util.List;
import java.util.Map;

import com.yan.weight.schema.Weight;

public interface WeightDaoService {

public final static String MAPPER_NAME_SPACE ="com.yan.weight.mapping.WeightMapper";

	boolean insertWeight(Weight weight);
	
	int countWeight(Map<String, Object> condition);
	
	/**
	 * 不通过分页查询出来数据
	 * @param condition
	 * @return
	 */
	List<Weight> queryWeights(Map<String, Object> condition);
	
	/**
	 * 通过分页查询出来数据
	 * @param condition
	 * @return
	 */
	List<Weight> queryWeightsAndPaging(Map<String, Object> condition);
	
	Weight queryWeightById(int id);
}
