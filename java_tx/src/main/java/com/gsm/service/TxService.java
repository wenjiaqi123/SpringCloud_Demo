package com.gsm.service;

import com.gsm.entity.Money;

import java.util.List;

public interface TxService {
    String updateSth(String from, String to, String money);

    List<Money> getAll();
}
