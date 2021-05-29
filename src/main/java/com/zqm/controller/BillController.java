package com.zqm.controller;

import com.zqm.dao.SpendingCategoryMapper;
import com.zqm.pojo.Bill;
import com.zqm.pojo.SpendingCategory;
import com.zqm.service.BillService;
import com.zqm.service.SpendingCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
//@SessionAttributes("allCategory")
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;
    @Autowired
    private SpendingCategoryService spendingCategoryService;

    @GetMapping("/queryAll")
    public String queryAllBills(Model model){
        List<Bill> bills = billService.queryAllBills();
        model.addAttribute("bills", bills);
        return "bill";
    }

    //跳转到增加账单界面
    @RequestMapping("/toAddBill")
    public String toAddBill(Model model){
        List<String> allCategory = spendingCategoryService.queryAllCategory();
        model.addAttribute("allCategory", allCategory);
        return "addBill";
    }

    //增加账单界面
    @PostMapping("/addBill")
    public String addBill(Bill bill){
        SpendingCategory sc = spendingCategoryService.queryByName(bill.getSc().getName());
        bill.setSc(sc);
        billService.addBill(bill);
        return "redirect:/bill/queryAll";
    }

    //跳转到账单修改界面
    @GetMapping("/toUpdate")
    public String toUpdate(int id, Model model){
        List<String> allCategory = spendingCategoryService.queryAllCategory();
        model.addAttribute("allCategory", allCategory);
        Bill bill = billService.queryBillByID(id);
        System.out.println(bill);
        model.addAttribute("bill", bill);
        return "updateBill";
    }

    //修改账单界面
    @PostMapping("/updateBill")
    public String updateBill(Bill bill){
        SpendingCategory sc = spendingCategoryService.queryByName(bill.getSc().getName());
        bill.setSc(sc);
        System.out.println(bill);
        billService.updateBill(bill);
        return "redirect:/bill/queryAll";
    }

    //删除界面
    @RequestMapping("/deleteBill")
    public String deleteBill(int id){
        billService.deleteBillByID(id);
        return "redirect:/bill/queryAll";
    }
}
