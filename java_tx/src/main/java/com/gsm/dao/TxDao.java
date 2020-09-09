package com.gsm.dao;

import com.gsm.entity.Money;

import java.util.List;

public interface TxDao {
    void updateSth(Money money);

    List<Money> getAll();
}
