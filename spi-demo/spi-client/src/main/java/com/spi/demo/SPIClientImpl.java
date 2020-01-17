package com.spi.demo;

/**
 * @author xiaobin
 * @date 2020/1/17 0017 10:02
 * @desc
 */
public class SPIClientImpl implements SPIClient {

    @Override
    public void print() {
        System.out.println("客户端接入");
    }
}
