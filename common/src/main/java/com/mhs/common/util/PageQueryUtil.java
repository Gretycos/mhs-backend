package com.mhs.common.util;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author Tsong
 * @Date 13/03/2024 21:07
 */
@Data
public class PageQueryUtil extends LinkedHashMap<String, Object> {
    // 当前页码
    private int page;
    // 每页条数
    private int limit;
    private String orderBy; // 排序的字段
    private String order;

    public PageQueryUtil(Map<String, Object> params) {
        this.putAll(params);
        // 分页参数
        this.page = Integer.parseInt(params.get("page").toString());
        this.limit = Integer.parseInt(params.get("limit").toString());
        this.put("start", (page - 1) * limit);
        this.orderBy = (String) params.get("orderBy");
        this.order = (String) params.get("order");
        if (StringUtils.hasText(this.orderBy)) {
            // 正则把驼峰转下划线
            this.put("sortField", this.orderBy.replaceAll("[A-Z]", "_$0").toLowerCase());
        }
    }
}
