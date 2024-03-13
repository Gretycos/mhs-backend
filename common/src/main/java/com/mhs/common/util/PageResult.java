package com.mhs.common.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Tsong
 * @Date 13/03/2024 21:09
 */
@Data
public class PageResult<T> implements Serializable {
    //总记录数
    private int totalCount;
    //每页记录数
    private int pageSize;
    //总页数
    private int totalPage;
    //当前页数
    private int currPage;
    //列表数据
    private List<T> list;

    public PageResult(List<T> list, int totalCount, int pageSize, int currPage) {
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currPage = currPage;
        this.totalPage = (int) Math.ceil((double) totalCount / pageSize);
    }
}
