package com.qing.hu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qing.hu.entity.EctCnAfterReport;
import com.qing.hu.service.IEctCnAfterReportService;


@RestController
@RequestMapping("/ectcnafterreport")
public class EctCnAfterReportController {
    @Autowired
    IEctCnAfterReportService ectCnAfterReportService;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<EctCnAfterReport> getEctCnAfterReportList() {
        return ectCnAfterReportService.findAll();
    }
}