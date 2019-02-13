package com.bonobono.web04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bonobono.web04.service.SampleService;
import com.bonobono.web04.vo.Sample;

@Controller
public class SampleController {
	@Autowired
	private SampleService sampleService;
	
	
	// 1. 입력폼
	@GetMapping("/addSample")
	public String addSample() {
		System.out.println("get 입력 잘 되나?");
		return "addSample"; // view 이름은 template 폴더에 addSample.html
	}
	// 2. 입력 액션
	@PostMapping("/addSampleAction")
	public String addSample(
			@RequestParam(value="sampleName") String sampleName) {
		// 애노테이션덕에 이제부턴 sampleName이 RequestParam(value="sampleName")과 같다.
		System.out.println(sampleName + "<-sampleName post 입력 잘 받았나?");
		Sample sample = new Sample();
		sample.setSampleName(sampleName);
		sampleService.addSample(sample);
		return "redirect:/sampleList"; // redirect이 아닌 다른 return 뒤에 주소는 forward방식이라 생각. 
	}
	// 3. 목록
	@GetMapping("/sampleList")
	public String sampleList(Model model) {//정보를 담아오기에 Model이 필요
		List<Sample> list = sampleService.getSampleList();
		model.addAttribute("list", list);
		return "sampleList";
	}
	// 4. 삭제 액션
	@RequestMapping("/removeSample")
	public String removeSample(
			@RequestParam(value="sampleId") int sampleId) {
		System.out.println(sampleId + "<-sampleId get 입력 잘 되나?");
		sampleService.removeSample(sampleId);
		return "redirect:/sampleList";
	}
	
	
	// 5. 수정 폼
	@RequestMapping("/modifySample")
	public String modifySample(
			Model model, @RequestParam(value="sampleId") int sampleId) {
		System.out.println(sampleId + "<-sampleId get 입력 잘 되나?");
		List<Sample> list = sampleService.getSampleOne(sampleId);
		model.addAttribute("list", list);// 정보를 옮기기 위해서 모델 사용
		return "modifySample";
	} 
	
	
	// 6. 수정 액션
	@RequestMapping(value="/modifySampleAction", method=RequestMethod.POST)
	// 포스트방식 정보를 받는 방법을 이유림학생의 코딩을 참고하였습니다.
	public String modifySample(Sample sample) {
		System.out.println(sample + "<-sample post 입력 잘 되나?");
		sampleService.modifySample(sample);
		return "redirect:/sampleList";
	}
	
	
}
