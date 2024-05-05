package com.example.demo.Entities;
import javax.persistence.*;

@Entity
@Table(name = "displaytable_fltnum")
public class DisplayNum {

    @Id
    @Column(name = "dt")
    private String dt;

    private Integer totalFlt;

    private Integer finishedFlt;

    private Float finishRate;

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

}