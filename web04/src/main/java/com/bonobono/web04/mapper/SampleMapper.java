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
	
	// 3. 삭제
	int deleteSample(int sampleId);
	
	// 4. 수정 폼
	List<Sample> selectSampleOne(int sampleId);
	
	// 5. 수정 액션!
	int updateSample(Sample sample);
}
