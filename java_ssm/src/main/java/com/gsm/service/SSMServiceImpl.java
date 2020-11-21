package com.gsm.service;

import com.gsm.dao.SSMDao;
import com.gsm.entity.Money;
import com.gsm.service.SSMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SSMServiceImpl implements SSMService {
    @Autowired
    private SSMDao ssmDao;

    @Override
    public String updateSth(String from, String to, String money) {
        Money money1 = Money.builder()
                .userName(from)
                .money(-Integer.decode(money))
                .build();
        ssmDao.updateSth(money1);

        int i = 1/0;

        Money money2 = Money.builder()
                .userName(to)
                .money(Integer.decode(money))
                .build();
        ssmDao.updateSth(money2);
        return "success";
    }

    @Override
    public List<Money> getAll() {
        List<Money> list = ssmDao.getAll();
        return list;
    }
}
