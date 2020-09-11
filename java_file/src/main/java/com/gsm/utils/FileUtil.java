package com.gsm.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Component
@Slf4j
public class FileUtil {

    /**
     * 校验目录是否存在,不存在就创建
     *
     * @param directory
     * @return
     */
    public static boolean createDirectory(String directory) {
        File dir = new File(directory);
        if (!dir.exists()) {
            dir.mkdirs();
            return true;
        }
        return true;
    }

    /**
     * 存储单个 MultipartFile 文件到 dir 目录下
     * 文件名是指定名，确保唯一
     *
     * @param file      文件
     * @param directory 目录
     * @param fileName  文件名
     * @return 是否成功
     */
    public static boolean storeFileByName(MultipartFile file, String directory, String fileName) {
        //校验目录
        createDirectory(directory);
        //存储文件
        File f = new File(directory, fileName);
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            fos.write(file.getBytes());
            fos.flush();
            fos.close();
            log.info(directory + File.separator + fileName + " 存储成功");
        } catch (IOException e) {
            e.printStackTrace();
            log.error(directory + File.separator + fileName + " 存储失败");
        }
        return true;
    }
}