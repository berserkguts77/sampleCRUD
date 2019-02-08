package com.bonobono.web04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonobono.web04.mapper.SampleMapper;
import com.bonobono.web04.vo.Sample;

@Service
public class SampleService {
	@Autowired 
	private SampleMapper sampleMapper;
	
	public List<Sample> getSampleList(){
		// List<Sample> list = sampleMapper.selectSampleList();
		// return List<Sample> list;
		return sampleMapper.selectSampleList();
	}
	
	public Sample getSampleOne(){
		return null;
	}
	
	public int addSample(Sample sample) {
		// int result = sampleMapper.insertSample(sample);
		// return result; 이 방법도 좋지만 이게 더 세련되어보인다. 29기 코딩 참고
		return sampleMapper.insertSample(sample);
	}
	
	public int removeSample(Sample sample) {
		return 0;
	}
	
	public int modifySample(Sample sample) {
		return 0;
	}
	
}
