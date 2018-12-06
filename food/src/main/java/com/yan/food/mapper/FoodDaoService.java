package com.yan.food.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.yan.food.schema.Food;

@Mapper
public interface FoodDaoService {

	void insertFood(Food food);
	
	Food findFitnessHistoriesById(Integer id);
	
	List<Food> findFitnessHistoriesByTrainingDay(String trainingDay); 
	
	List<Food> findFitnessHistoriesAndPaging(Map<String, Object> condition);
	
	Integer countFood(Map<String, Object> condition);
}
