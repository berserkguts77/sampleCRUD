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
		return null;
	}
	
	public Sample getSampleOne(){
		return null;
	}
	
	public int addSample(Sample sample) {
		return 0;
	}
	
	public int removeSample(Sample sample) {
		return 0;
	}
	
	public int modifySample(Sample sample) {
		return 0;
	}
	
}
