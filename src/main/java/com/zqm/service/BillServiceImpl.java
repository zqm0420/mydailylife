package com.zqm.service;

import com.zqm.dao.BillMapper;
import com.zqm.pojo.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService{
    @Autowired
    BillMapper billMapper;

    @Override
    public List<Bill> queryAllBills() {
        return null;
    }

    @Override
    public Bill queryBillByID(int id) {
        return null;
    }
}
