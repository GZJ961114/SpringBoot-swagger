package com.springbootSwagger.datax;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

@Slf4j
public class TestDatax {
    public static void main(String[] args) {
        try {
            log.info("start");

            String windowcmd = "cmd /c python datax.py D:\\environment\\datax\\mysqljob.json";
             log.info(windowcmd);
            //.exec("你的命令",null,new File("datax安装路径"));
            Process pr = Runtime.getRuntime().exec(windowcmd,null,new File("D:\\environment\\datax\\bin"));
            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                log.info(line);
            }
            in.close();
            pr.waitFor();
            log.info("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}