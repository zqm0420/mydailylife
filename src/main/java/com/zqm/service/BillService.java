package com.zqm.service;

import com.zqm.pojo.Bill;

import java.util.List;

public interface BillService {
    List<Bill> queryAllBills();
    Bill queryBillByID(int id);
}
