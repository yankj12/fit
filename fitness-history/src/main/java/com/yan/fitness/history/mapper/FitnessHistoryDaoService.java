package com.yan.fitness.history.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.yan.fitness.history.schema.FitnessHistory;

@Mapper
public interface FitnessHistoryDaoService {

	List<FitnessHistory> findFitnessHistoriesAndPaging(Map<String, Object> condition);
	
	Integer countFitnessHistory(Map<String, Object> condition);
}
