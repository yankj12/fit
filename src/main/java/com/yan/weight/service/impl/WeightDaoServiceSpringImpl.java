package com.yan.weight.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.yan.weight.schema.Weight;
import com.yan.weight.service.facade.WeightDaoService;
import com.yan.weight.utils.jdbc.JdbcUtil;

@Service
public class WeightDaoServiceSpringImpl implements WeightDaoService{


	@Override
	public boolean insertWeight(Weight weight) {
		boolean result = false;
		weight.setInsertTime(new Date());
		weight.setUpdateTime(new Date());
		
		SqlSession sqlSession = JdbcUtil.getSqlSession(true);
		
		String statement = MAPPER_NAME_SPACE + "." + "insertWeight";
		sqlSession.insert(statement, weight);
		
		sqlSession.close();
		
		result = true;
		return result;
	}

	public int countWeight(){
		SqlSession sqlSession = JdbcUtil.getSqlSession(true);
		
		String statement = MAPPER_NAME_SPACE + "." + "countWeight";
		int count = sqlSession.selectOne(statement);
		
		sqlSession.close();
		return count;
	}
	
	@Override
	public List<Weight> queryWeights() {
		SqlSession sqlSession = JdbcUtil.getSqlSession(true);
		
		String statement = MAPPER_NAME_SPACE + "." + "queryWeights";
		List<Weight> weights = sqlSession.selectList(statement);
		
		sqlSession.close();
		return weights;
	}
	
	public Weight queryWeightById(int id) {
		SqlSession sqlSession = JdbcUtil.getSqlSession(true);
		
		String statement = MAPPER_NAME_SPACE + "." + "queryWeights";
		Weight weight = sqlSession.selectOne(statement, id);
		
		sqlSession.close();
		return weight;
	}
}
