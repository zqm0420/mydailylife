package com.zqm.service;

import com.zqm.pojo.SpendingCategory;

import java.util.List;

public interface SpendingCategoryService {
    List<String> queryAllCategory();

    SpendingCategory queryByName(String name);
}
