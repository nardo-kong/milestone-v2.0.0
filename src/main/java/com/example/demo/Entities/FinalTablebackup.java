package com.example.demo.Entities;

import javax.persistence.*;

@Entity(name = "finaltable")
public class FinalTablebackup {

    @Id
    @Column(name = "FLT_NUM")
    private Integer fltNum;

    // 在时限前 acceptance 的完成率
    @Column(name = "acceptance_intime_num")
    private Integer acceptanceIntimeNum;

    // acceptance 的全部数量
    @Column(name = "acceptance_total_num")
    private Integer acceptanceTotalNum;

    // acceptance的准时完成率
    @Column(name = "acceptance_intime_rate")
    private Float acceptanceIntimeRate;

    @Column(name = "awb_intime_num")
    private Integer awbIntimeNum;

    @Column(name = "awb_intime_rate")
    private Float awbIntimeRate;

    @Column(name = "awb_total_num")
    private Integer awbTotalNum;

    // 过去100%时间的完成数量
    @Column(name = "uld_intime100_num")
    private Integer uldIntime100Num;

    // 过去100%时间的完成率
    @Column(name = "uld_intime100_rate")
    private Float uldIntime100Rate;

    // 过去70%时间的完成数量
    @Column(name = "uld_intime70_num")
    private Integer uldIntime70Num;

    // 过去70%时间的完成率
    @Column(name = "uld_intime70_rate")
    private Float uldIntime70Rate;

    @Column(name = "uld_total_num")
    private Integer uldTotalNum;

    @Column(name = "handover_intime100_num")
    private Integer handoverIntime100Num;

    @Column(name = "handover_intime100_rate")
    private Float handoverIntime100Rate;

    @Column(name = "handover_intime50_num")
    private Integer handoverIntime50Num;

    @Column(name = "handover_intime50_rate")
    private Float handoverIntime50Rate;

    @Column(name = "handover_total_num")
    private Integer handoverTotalNum;

    @Column(name = "loadsheet_intime_rate")
    private Float loadsheetIntimeRate;

    @Column(name = "LEG_DEP")
    private String legDep;

    @Column(name = "LEG_ARR")
    private String legArr;

    @Column(name = "SCH_DEP_TIME")
    private String schDepTime;

    @Column(name = "EST_DEP_TIME")
    private String estDepTime;

    @Column(name = "ACT_DEP_TIME")
    private String actDepTime;

    // 目前完成到哪个步骤了
    @Column(name = "process")
    private String process;

    // 当前步骤完成率
    @Column(name = "process_percent")
    private Float processPercent;

    // Getters and Setters
    // Please implement the getters and setters here

    public Integer getFltNum() {
        return fltNum;
    }
    public void setFltNum(Integer fltNum) {
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

    public String getActDepTime() {
        return actDepTime;
    }

    public void setActDepTime(String actDepTime) {
        this.actDepTime = actDepTime;
    }

    public Float getProcessPercent() {
        return processPercent;
    }

    public void setProcessPercent(Float processPercent) {
        this.processPercent = processPercent;
    }

    public Float getAwbIntimeRate() {
        return awbIntimeRate;
    }

    public void setAwbIntimeRate(Float awbIntimeRate) {
        this.awbIntimeRate = awbIntimeRate;
    }

    public Float getUldIntime100Rate() {
        return uldIntime100Rate;
    }

    public void setUldIntime100Rate(Float uldIntime100Rate) {
        this.uldIntime100Rate = uldIntime100Rate;
    }

    public Float getHandoverIntime100Rate() {
        return handoverIntime100Rate;
    }

    public void setHandoverIntime100Rate(Float handoverIntime100Rate) {
        this.handoverIntime100Rate = handoverIntime100Rate;
    }

    public Float getLoadsheetIntimeRate() {
        return loadsheetIntimeRate;
    }

    public void setLoadsheetIntimeRate(Float loadsheetIntimeRate) {
        this.loadsheetIntimeRate = loadsheetIntimeRate;
    }


}

