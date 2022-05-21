package com.example.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AnalysisModel {

    private int id;
    private LocalDateTime Up_date;
    private boolean Result;
    private  double Record_len;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  LocalDateTime getUp_date(){
        return Up_date;
    }
    public void setUp_date(LocalDateTime Up_date) {
        this.Up_date = Up_date;
    }
    public  boolean getResult(){
        return Result;
    }
    public void setResult(boolean Result) {
        this.Result = Result;
    }public  double getRecord_len(){
        return Record_len;
    }
    public void setRecord_len(double Record_len) {
        this.Record_len = Record_len;
    }

}