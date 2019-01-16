package com.taoge.common.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: taoge
 * @Date: 2019/1/15 9:45
 * @Version 1.0
 */
public class PageVo<T> implements Serializable {
    private int count;
    private int currpage;
    private int size;
    private List<T> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrpage() {
        return currpage;
    }

    public void setCurrpage(int currpage) {
        this.currpage = currpage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
