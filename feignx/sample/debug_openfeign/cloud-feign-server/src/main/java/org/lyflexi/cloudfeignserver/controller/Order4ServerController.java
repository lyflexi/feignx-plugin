package org.lyflexi.cloudfeignserver.controller;

import org.lyflexi.cloudfeignapi.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lyflexi
 * @project: debuginfo_jdkToFramework
 * @Date: 2024/7/27 14:09
 */
@RestController
@RequestMapping("/prefix")
public class Order3ServerController {

    @GetMapping(value = "/order/get/{id}")
    public Order getPaymentById(@PathVariable("id") Long id)
    {
        return new Order(id, "order");
    }
}
