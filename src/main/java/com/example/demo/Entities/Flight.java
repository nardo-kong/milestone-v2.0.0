package com.example.demo.Entities;

import java.util.List;

public class Flight {
    private String fltNum;
    private String legArr;
    private String schDepTime;
    private int progress;
    private String actDepTime;
    private List<Step> steps;

    public Flight(String fltNum, String legArr, String schDepTime, int progress, String actDepTime, List<Step> steps) {
        this.fltNum = fltNum;
        this.legArr = legArr;
        this.schDepTime = schDepTime;
        this.progress = progress;
        this.actDepTime = actDepTime;
        this.steps = steps;
    }

    // getters and setters
    public String getFltNum() {
        return fltNum;
    }

    public void setFltNum(String fltNum) {
        this.fltNum = fltNum;
    }

    public String getLegArr() {
        return legArr;
    }

    public void setLegArr(String legArr) {
        this.legArr = legArr;
    }

    public String getSchDepTime() {
        return schDepTime;
    }

    public void setSchDepTime(String schDepTime) {
        this.schDepTime = schDepTime;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getActDepTime() {
        return actDepTime;
    }

    public void setActDepTime(String actDepTime) {
        this.actDepTime = actDepTime;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}