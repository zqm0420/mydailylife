package com.zqm.service;

import com.zqm.dao.SpendingCategoryMapper;
import com.zqm.pojo.SpendingCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpendingCategoryServiceImpl implements SpendingCategoryService{
    @Autowired
    private SpendingCategoryMapper spendingCategoryMapper;

    @Override
    public List<String> queryAllCategory() {
        return spendingCategoryMapper.queryAllCategory();
    }

    @Override
    public SpendingCategory queryByName(String name) {
        return spendingCategoryMapper.queryByName(name);
    }
}
