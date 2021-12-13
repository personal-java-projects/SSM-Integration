package com.example.controller;

import com.example.domain.Account;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // 保存
    // produces指定响应数据的数据类型,解决响应乱码
    @RequestMapping(value = "/save", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String save(Account account) throws IOException {
        accountService.save(account);

        return "保存成功";
    }

    // 查询
    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView) throws IOException {
        List<Account> accountList = accountService.findAll();

        modelAndView.addObject("accountList", accountList);
        modelAndView.setViewName("accountList");

        return modelAndView;
    }
}
