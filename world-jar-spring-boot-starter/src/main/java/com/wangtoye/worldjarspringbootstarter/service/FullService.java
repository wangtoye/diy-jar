package com.wangtoye.worldjarspringbootstarter.service;

/**
 * @author wangtoye
 * @date 2020/4/1
 * @description
 */
public class FullService {
    private WorldService worldService;

    public WorldService getWorldService() {
        return worldService;
    }

    public void setWorldService(WorldService worldService) {
        this.worldService = worldService;
    }

    public String print() {
        return "wangtoye:" + worldService.print();
    }
}
