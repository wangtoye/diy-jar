package com.wangtoye.worldjarspringbootstarter.service;

/**
 * @author wangtoye
 * @date 2020/4/1
 * @description
 */
public class WorldService {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String print() {
        return "hello" + word;
    }

}
