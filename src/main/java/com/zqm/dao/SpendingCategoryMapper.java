package com.zqm.dao;

import com.zqm.pojo.SpendingCategory;

import java.util.List;

public interface SpendingCategoryMapper {
    List<String> queryAllCategory();

    SpendingCategory queryByName(String name);
}
