package com.zqm.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Bill {
    private int id;
    private SpendingCategory sc;
    private double money;
    private Date payDate;
    private String detail;
}
