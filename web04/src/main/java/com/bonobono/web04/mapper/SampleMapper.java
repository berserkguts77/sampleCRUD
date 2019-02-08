package com.bonobono.web04.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bonobono.web04.vo.Sample;

@Mapper
public interface SampleMapper {
	// 1. 전체 목록 검색
	List<Sample> selectSampleList();
	
	// 2. 입력
	int insertSample(Sample sample);
	
	
	
}
