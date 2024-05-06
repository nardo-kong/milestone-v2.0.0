package com.example.demo.Entities;
import javax.persistence.*;

@Entity
@Table(name = "finaltable_unfinished")
public class FinalTableUn {

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

    @Column(name = "loadingend_status")
    private String loadendStatus;

    @Column(name = "LEG_DEP")
    private String legDep;

    @Column(name = "LEG_ARR")
    private String legArr;

    @Column(name = "DEP_TIME")
    private String schDepTime;

    @Column(name = "EST_DEP_TIME")
    private String estDepTime;

    @Column(name = "ACT_DEP_TIME")
    private String actDepTime;

    private String acceptanceThreshold;

    private String awbThreshold;

    private String uldThreshold;

    private String handoverThreshold;

    @Column(name = "NOTOC_threshold")
    private String notocThreshold;

    @Column(name = "LoadEND_threshold")
    private String loadendThreshold;

    private String flightStatus;

    private String departureStatus;

    private String departureThreshold;

    private Integer uld70TotalNum;

    private Integer uld70NowNum;

    private Integer handover50TotalNum;

    private Integer handover50NowNum;

    @Column(name = "uld70_threshold")
    private String uld70Threshold;

    @Column(name = "handover50_threshold")
    private String handover50Threshold;

    @Column(name = "uld70_status")
    private String uld70Status;

    @Column(name = "handover50_status")
    private String handover50Status;

    private String manpowerThreshold;

    private String manpowerStatus;


    @Column(name = "handover_tow_threshold")
    private String TOWThreshold;

    @Column(name = "TOW_status")
    private String TOWStatus;

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

    public String getLoadendStatus() {
        return loadendStatus;
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

    public String getAcceptanceThreshold() {
        return acceptanceThreshold;
    }

    public String getAwbThreshold() {
        return awbThreshold;
    }

    public String getUldThreshold() {
        return uldThreshold;
    }

    public String getHandoverThreshold() {
        return handoverThreshold;
    }

    public String getNotocThreshold() {
        return notocThreshold;
    }

    public String getLoadendThreshold() {
        return loadendThreshold;
    }

    public String getDepartureStatus() {
        if (process.equals("completed")) {
            return "normal";
        } else {
            return "none";
        }
    }

    public String getDepartureThreshold() {
        return schDepTime;
    }

    public Integer getUld70TotalNum() {
        return (int) (uldTotalNum*0.7);
    }

    public Integer getUld70NowNum() {
        return (int) (uldTotalNum*0.7);
    }

    public Integer getHandover50TotalNum() {
        return (int) (handoverTotalNum*0.5);
    }

    public Integer getHandover50NowNum() {
        return (int) (handoverTotalNum*0.5);
    }

    public String getUld70Threshold() {
        return uld70Threshold;
    }

    public String getHandover50Threshold() {
        return handover50Threshold;
    }

    public String getUld70Status() {
        return uld70Status;
    }

    public String getHandover50Status() {
        return handover50Status;
    }

    public String getManpowerThreshold() {
        return manpowerThreshold;
    }

    public String getManpowerStatus() {
        return manpowerStatus;
    }

    public String getTOWStatus() {
        return TOWStatus;
    }

    public String getTOWThreshold() {
        return TOWThreshold;
    }
}
