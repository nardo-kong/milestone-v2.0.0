package com.example.demo.Entities;
import javax.persistence.*;

@Entity
@Table(name = "finaltable_withthreshold")
public class FinalTable {

    @Id
    @Column(name = "FLT_NUM")
    private Integer fltNum;

// 总数
    @Column(name = "acceptance_total_num")
    private Integer acceptanceTotalNum;

// 准时完成数
    @Column(name = "acceptance_intime_num")
    private Integer acceptanceIntimeNum;

// 准时完成率
    @Column(name = "acceptance_intime_rate")
    private Float acceptanceIntimeRate;

// 目前为止完成数
    @Column(name = "acceptance_now_num")
    private Integer acceptanceNowNum;

// 目前未知完成率
    @Column(name = "acceptance_complete_rate")
    private Float acceptanceCompleteRate;

// 目前状态
    @Column(name = "acceptance_status")
    private String acceptanceStatus;

    @Column(name = "awb_total_num")
    private Integer awbTotalNum;

    @Column(name = "awb_intime_num")
    private Integer awbIntimeNum;

    @Column(name = "awb_intime_rate")
    private Float awbIntimeRate;

    @Column(name = "awb_now_num")
    private Integer awbNowNum;

    @Column(name = "awb_complete_rate")
    private Float awbCompleteRate;

    @Column(name = "awb_status")
    private String awbStatus;

    @Column(name = "uld_total_num")
    private Integer uldTotalNum;

    @Column(name = "uld_intime70_num")
    private Integer uldIntime70Num;

    @Column(name = "uld_intime70_rate")
    private Float uldIntime70Rate;

    @Column(name = "uld_intime100_num")
    private Integer uldIntime100Num;

    @Column(name = "uld_intime100_rate")
    private Float uldIntime100Rate;

    @Column(name = "uld_now_num")
    private Integer uldNowNum;

    @Column(name = "uld_complete_rate")
    private Float uldCompleteRate;

    @Column(name = "uld_status")
    private String uldStatus;

    @Column(name = "handover_total_num")
    private Integer handoverTotalNum;

    @Column(name = "handover_intime50_num")
    private Integer handoverIntime50Num;

    @Column(name = "handover_intime50_rate")
    private Float handoverIntime50Rate;

    @Column(name = "handover_intime100_num")
    private Integer handoverIntime100Num;

    @Column(name = "handover_intime100_rate")
    private Float handoverIntime100Rate;

    @Column(name = "handover_now_num")
    private Integer handoverNowNum;

    @Column(name = "handover_complete_rate")
    private Float handoverCompleteRate;

    @Column(name = "handover_status")
    private String handoverStatus;

    @Column(name = "NOTOC_status")
    private String notocStatus;

    @Column(name = "landingend_status")
    private String landingEndStatus;

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

    private String flightStatus;

// 目前到哪一步了
    @Column(name = "process")
    private String process;

// 整体的完成百分比
    @Column(name = "process_percent")
    private Float processPercent;

    // Getters and Setters
    // Please implement the getters and setters here
    public Integer getFltNum() {
        return fltNum;
    }

    public Integer getAcceptanceTotalNum() {
        return acceptanceTotalNum;
    }

    public Integer getAcceptanceIntimeNum() {
        return acceptanceIntimeNum;
    }

    public Float getAcceptanceIntimeRate() {
        return acceptanceIntimeRate;
    }

    public Integer getAcceptanceNowNum() {
        return acceptanceNowNum;
    }

    public Float getAcceptanceCompleteRate() {
        return acceptanceCompleteRate;
    }

    public String getAcceptanceStatus() {
        return acceptanceStatus;
    }

    public Integer getAwbTotalNum() {
        return awbTotalNum;
    }

    public Integer getAwbIntimeNum() {
        return awbIntimeNum;
    }

    public Float getAwbIntimeRate() {
        return awbIntimeRate;
    }

    public Integer getAwbNowNum() {
        return awbNowNum;
    }

    public Float getAwbCompleteRate() {
        return awbCompleteRate;
    }

    public String getAwbStatus() {
        return awbStatus;
    }

    public Integer getUldTotalNum() {
        return uldTotalNum;
    }

    public Integer getUldIntime70Num() {
        return uldIntime70Num;
    }

    public Float getUldIntime70Rate() {
        return uldIntime70Rate;
    }

    public Integer getUldIntime100Num() {
        return uldIntime100Num;
    }

    public Float getUldIntime100Rate() {
        return uldIntime100Rate;
    }

    public Integer getUldNowNum() {
        return uldNowNum;
    }

    public Float getUldCompleteRate() {
        return uldCompleteRate;
    }

    public String getUldStatus() {
        return uldStatus;
    }

    public Integer getHandoverTotalNum() {
        return handoverTotalNum;
    }

    public Integer getHandoverIntime50Num() {
        return handoverIntime50Num;
    }

    public Float getHandoverIntime50Rate() {
        return handoverIntime50Rate;
    }

    public Integer getHandoverIntime100Num() {
        return handoverIntime100Num;
    }

    public Float getHandoverIntime100Rate() {
        return handoverIntime100Rate;
    }

    public Integer getHandoverNowNum() {
        return handoverNowNum;
    }

    public Float getHandoverCompleteRate() {
        return handoverCompleteRate;
    }

    public String getHandoverStatus() {
        return handoverStatus;
    }

    public String getNotocStatus() {
        return notocStatus;
    }

    public String getLandingEndStatus() {
        return landingEndStatus;
    }

    public String getLegDep() {
        return legDep;
    }

    public String getLegArr() {
        return legArr;
    }

    public String getSchDepTime() {
        return schDepTime;
    }

    public String getEstDepTime() {
        return estDepTime;
    }

    public String getActDepTime() {
        return actDepTime;
    }

    public String getProcess() {
        return process;
    }

    public Float getProcessPercent() {
        return processPercent;
    }

    public String getFlightStatus() {
        return flightStatus;
    }
}
