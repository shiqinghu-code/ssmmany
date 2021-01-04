package com.qing.hu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qing.hu.entity.EctCnAccountPowerLog;
import com.qing.hu.service.IEctCnAccountPowerLogService;


@RestController
@RequestMapping("/ectcnaccountpowerlog")
public class EctCnAccountPowerLogController {
    @Autowired
    IEctCnAccountPowerLogService ectCnAccountPowerLogService;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<EctCnAccountPowerLog> getEctCnAccountPowerLogList() {
        return ectCnAccountPowerLogService.findAll();
    }
}