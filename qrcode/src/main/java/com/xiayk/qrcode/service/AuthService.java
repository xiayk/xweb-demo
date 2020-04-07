package com.xiayk.qrcode.service;

import com.google.zxing.WriterException;

import java.io.IOException;

/**
 * Created with IDEA
 * Description:
 *
 * @author: xiayk
 * @date: 20/4/7 下午2:53
 **/
public interface AuthService {

    /**
     * 生成登录二维码
     * @return
     */
    byte[] getLoginQrcode() throws IOException, WriterException;

    /**
     * 生成登录二维码UUID
     * @return
     */
    String getLoginQrocdeUUID();

    /**
     * 轮询验证二维码状态
     * @param uuid
     * @return
     */
    int isScan(String uuid);
}
