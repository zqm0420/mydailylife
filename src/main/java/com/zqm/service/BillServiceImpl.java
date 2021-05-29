package com.zqm.service;

import com.zqm.dao.BillMapper;
import com.zqm.dao.SpendingCategoryMapper;
import com.zqm.pojo.Bill;
import com.zqm.pojo.SpendingCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService{
    @Autowired
    BillMapper billMapper;
    @Autowired
    SpendingCategoryMapper spendingCategoryMapper;

    @Override
    public List<Bill> queryAllBills() {
        return billMapper.queryAllBills();
    }

    @Override
    public Bill queryBillByID(int id) {
        return billMapper.queryBillByID(id);
    }

    @Override
    public int addBill(Bill bill) {
        return billMapper.addBill(bill);
    }

    @Override
    public int updateBill(Bill bill) {
        return billMapper.updateBill(bill);
    }

    @Override
    public int deleteBillByID(int id) {
        return billMapper.deleteBillByID(id);
    }


}
