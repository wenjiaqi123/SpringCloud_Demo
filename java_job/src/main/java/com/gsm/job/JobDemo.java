package com.gsm.job;

import com.gsm.utils.JobUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Configuration
@EnableScheduling
public class JobDemo {


    // 网站地址 https://cron.qqe2.com/
    @Scheduled(cron = "* * * * * ?")
    //@Scheduled(cron = "${job.time}")
    public void myJob() {
        LocalDateTime now = LocalDateTime.now();
        String time = now.getYear() + "年" + now.getMonthValue() + "月" + now.getDayOfMonth() + "日" + now.getHour() + "时" + now.getMinute() + "分" + now.getSecond() + "秒";
        System.out.println(time);
        JobUtils.exec();
    }
}