package com.example.demo.Entities;

public class Step {
    
    private String name;
    private String finishedNum;
    private String totalNum;

    public Step(String name, String finishedNum, String totalNum) {
        this.name = name;
        this.finishedNum = finishedNum;
        this.totalNum = totalNum;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFinishedNum() {
        return finishedNum;
    }

    public void setFinishedNum(String finishedNum) {
        this.finishedNum = finishedNum;
    }

    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }
    
}