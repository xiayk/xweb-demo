package com.xiayk.qrcode.controller;

import com.google.zxing.WriterException;
import com.xiayk.qrcode.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created with IDEA
 * Description:
 *
 * @author: xiayk
 * @date: 20/4/7 下午2:43
 **/
@RestController
@RequestMapping("/auth/")
public class IndexController {

    @Autowired
    private AuthService authService;

    @PostMapping("qrcode")
    public byte[] qrcode() throws IOException, WriterException {
        return authService.getLoginQrcode();
    }

    @PostMapping("UUID")
    public String qrcodeUUID(){
        return authService.getLoginQrocdeUUID();
    }

    @RequestMapping("isScan")
    public int isScan(@RequestParam("uuid") String uuid){
        return authService.isScan(uuid);
    }
}
