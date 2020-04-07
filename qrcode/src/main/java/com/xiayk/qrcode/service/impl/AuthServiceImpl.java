package com.xiayk.qrcode.service.impl;

import com.google.zxing.WriterException;
import com.xiayk.qrcode.service.AuthService;
import com.xiayk.qrcode.utils.Qrcode;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created with IDEA
 * Description:
 *
 * @author: xiayk
 * @date: 20/4/7 下午3:53
 **/
@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public byte[] getLoginQrcode() throws IOException, WriterException {
        String UUID = Qrcode.getQRCodeUUID();
        //UUID存入redis
        //略...
        return Qrcode.getQRCodeImage(UUID);
    }

    @Override
    public String getLoginQrocdeUUID() {
        String UUID = Qrcode.getQRCodeUUID();
        //UUID存入redis
        //略...
        return UUID;
    }

    @Override
    public int isScan(String uuid) {
        //验证redis UUID状态
        return 0;
    }
}
