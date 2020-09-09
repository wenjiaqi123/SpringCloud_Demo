package com.gsm.dao;

import com.gsm.entity.Money;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SSMDao {
    List<Money> getAll();

    void updateSth(Money money);
}
