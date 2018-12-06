package com.yan.food.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.yan.food.schema.Nutrition;

@Mapper
public interface NutritionDaoService {

	void insertNutrition(Nutrition nutrition);
	
	Nutrition findFitnessHistoriesById(Integer id);
	
	List<Nutrition> findFitnessHistoriesByTrainingDay(String trainingDay); 
	
	List<Nutrition> findFitnessHistoriesAndPaging(Map<String, Object> condition);
	
	Integer countNutrition(Map<String, Object> condition);
}
