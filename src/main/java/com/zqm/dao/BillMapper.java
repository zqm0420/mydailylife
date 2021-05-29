package com.zqm.dao;

import com.zqm.pojo.Bill;

import java.util.List;

public interface BillMapper {
    List<Bill> queryAllBills();
    Bill queryBillByID(int id);
    int addBill(Bill bill);
    int updateBill(Bill bill);
    int deleteBillByID(int id);
}
