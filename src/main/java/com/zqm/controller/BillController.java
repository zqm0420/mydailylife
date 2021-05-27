package com.zqm.controller;

import com.zqm.pojo.Bill;
import com.zqm.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private BillService billService;

    @GetMapping("/queryAll")
    public String queryAllBills(Model model){
        List<Bill> bills = billService.queryAllBills();
        model.addAttribute("bills", bills);
        return "bill";
    }
}
