package com.example.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.model.AnalysisModel;
@Repository
public class AnalysisRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addAnalysis(AnalysisModel analysisModel){
        System.out.println("EXECUTE INSERT MEMBER");
        jdbcTemplate.update("INSERT INTO analysis(up_date, result, record_len) "
                        + "VALUES (?,?,?)",analysisModel.getUp_date(),
                analysisModel.getResult(),analysisModel.getRecord_len());
    }

}
