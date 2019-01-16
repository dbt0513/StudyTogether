package com.taoge.common.test;

import com.taoge.common.util.Base64Util;
import com.taoge.common.util.EncryptUtil;

/**
 * @Author: taoge
 * @Date: 2019/1/16 11:52
 * @Version 1.0
 */
public class Pass_Test {
    public static void main(String[] args) {
        System.out.println("AES秘钥："+ Base64Util.base64Enc(EncryptUtil.createAESKey()));
    }
}
