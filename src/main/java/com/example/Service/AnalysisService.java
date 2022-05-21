package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.AnalysisModel;
import com.example.Repository.AnalysisRepository;
@Service
public class AnalysisService {
    @Autowired
    AnalysisRepository analysisRepository;

    public void addAnalysis(AnalysisModel analysisModel){
        analysisRepository.addAnalysis(analysisModel);
    }
}
