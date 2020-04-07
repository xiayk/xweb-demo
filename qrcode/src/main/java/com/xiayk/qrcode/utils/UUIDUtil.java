package com.xiayk.qrcode.utils;

import java.util.UUID;

/**
 * Created with IDEA
 * Description:
 *
 * @author: xiayk
 * @date: 20/4/7 下午3:48
 **/
public class UUIDUtil {

    protected static String getUUID(){
        return UUID.randomUUID().toString();
    }
}
