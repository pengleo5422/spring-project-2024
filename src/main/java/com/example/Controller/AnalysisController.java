package com.example.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AnalysisModel;
import com.example.Service.AnalysisService;

import java.time.LocalDateTime;

@RestController
public class AnalysisController {
    @Autowired
    AnalysisModel analysisModel;

    @Autowired
    AnalysisService analysisService;
    @RequestMapping("/")
    public String hello(){
        analysisModel = new AnalysisModel();
        analysisModel.setRecord_len(20);
        analysisModel.setUp_date(LocalDateTime.now());
        analysisModel.setResult(true);
        analysisService.addAnalysis(analysisModel);
        return "New analysis added";
    }

}
