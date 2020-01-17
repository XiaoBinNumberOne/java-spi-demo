package com.spi.demo;

/**
 * @author xiaobin
 * @date 2020/1/17 0017 10:09
 * @desc
 */
public class ClientTest {

    public static void main(String[] args) {
        SPIClient spiClient = SPIClient.create();
        spiClient.print();
    }
}
