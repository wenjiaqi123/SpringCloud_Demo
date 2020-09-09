package com.gsm.service.impl;

import com.gsm.dao.TxDao;
import com.gsm.entity.Money;
import com.gsm.service.TxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TxServiceImpl implements TxService {
    @Autowired
    private TxDao txDao;

    @Override
    public String updateSth(String from, String to, String money) {
        Money money1 = Money.builder()
                .userName(from)
                .money(-Integer.decode(money))
                .build();
        txDao.updateSth(money1);

        int i = 1/0;

        Money money2 = Money.builder()
                .userName(to)
                .money(Integer.decode(money))
                .build();
        txDao.updateSth(money2);
        return "success";
    }

    @Override
    public List<Money> getAll() {
        List<Money> list = txDao.getAll();
        return list;
    }
}
