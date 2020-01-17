package com.spi.demo;

import java.util.ServiceLoader;

/**
 * @author xiaobin
 * @date 2020/1/17 0017 9:59
 * @desc
 */
public interface SPIClient {

    static SPIClient create() {
        ServiceLoader<SPIClient> load = ServiceLoader.load(SPIClient.class);
        return load.iterator().next();
    }

    void print();
}
