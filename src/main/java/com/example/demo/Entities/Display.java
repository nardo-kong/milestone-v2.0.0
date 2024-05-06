package com.example.demo.Entities;
import javax.persistence.*;

@Entity
@Table(name = "displaytable")
public class Display {

    @Id
    @Column(name = "dt")
    private String dt;

    private Integer totalFlt;

    private Integer finishedFlt;

    private Float finishRate;

    private Long delayedNum;

    private Float delayedRate;

    private Long delayingNum;

    private Float delayingRate;

    private Long totalDelayeding;

    // getter and setter
    public String getDt() {
        return dt;
    }

    public Integer getTotalFlt() {
        return totalFlt;
    }

    public Integer getFinishedFlt() {
        return finishedFlt;
    }

    public Float getFinishRate() {
        return finishRate;
    }

    public Long getDelayedNum() {
        return delayedNum;
    }

    public Float getDelayedRate() {
        return delayedRate;
    }

    public Long getDelayingNum() {
        return delayingNum;
    }

    public Float getDelayingRate() {
        return delayingRate;
    }

    public Long getTotalDelayeding() {
        return totalDelayeding;
    }

}