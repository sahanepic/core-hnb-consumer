package com.sahanbcs.util;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class Logger {

    public static void loginfo(Class c, String str)   {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(c.getName());
        FileHandler fileHandler;

        try {
            fileHandler = new FileHandler("C:\\Users\\sahan_k\\Desktop\\sahan_k\\sahan-Crpto\\SahanCrypto\\log-smsService\\info\\smslog" +  Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE) + ".txt",true);
            logger.addHandler(fileHandler);
            SimpleFormatter sf = new SimpleFormatter();
            fileHandler.setFormatter(sf);
            logger.log(Level.INFO, str);
            fileHandler.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void logerror(Class c, String str)   {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(c.getName());
        FileHandler fileHandler;

        try {
            fileHandler = new FileHandler("C:\\Users\\sahan_k\\Desktop\\sahan_k\\sahan-Crpto\\SahanCrypto\\log-smsService\\error\\smserrorlog" +  Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE)  + ".txt",true);
            logger.addHandler(fileHandler);
            SimpleFormatter sf = new SimpleFormatter();
            fileHandler.setFormatter(sf);
            logger.log(Level.WARNING, str);
            fileHandler.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static  void outln(String str){
        System.out.println(str);
    }
    public static  void out(String str){
        System.out.print(str);
    }
}
