package com.xiayk.qrcode.utils;

import com.google.zxing.WriterException;

import java.io.IOException;

/**
 * Created with IDEA
 * Description:
 *
 * @author: xiayk
 * @date: 20/4/7 下午2:57
 **/
public class Qrcode {

    public static byte[] getQRCodeImage(String text) throws IOException, WriterException {
        return QrcodeUtil.getQRCodeImage(getQRCodeUUID(), 100, 100);
    }

    public static byte[] getQRCodeImage(String text, int width, int height) throws IOException, WriterException {
        return QrcodeUtil.getQRCodeImage(text, width, height);
    }

    public static String getQRCodeUUID(){
        return UUIDUtil.getUUID();
    }
}
