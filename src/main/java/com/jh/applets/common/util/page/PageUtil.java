package com.jh.applets.common.util.page;

import java.io.Serializable;

/**
 * @author jiahao
 *         分页工具
 */
public class PageUtil implements Serializable {

    private static final long serialVersionUID = -3930180379790344299L;

    /**
     * 页码
     */
    private int page = DEFAULT_PAGE_NUMBER;

    /**
     * 每页记录数
     */
    private int count = DEFAULT_PAGE_SIZE;

    /**
     * 总页数
     */
    @SuppressWarnings("unused")
    private int totalPage;

    /**
     * 总数据条数
     */
    private int totals;

    /**
     * 实际每页显示条数
     */
    private int size;

    /**
     * 默认页码
     */
    private static final int DEFAULT_PAGE_NUMBER = 1;

    /**
     * 默认每页记录数
     */
    private static final int DEFAULT_PAGE_SIZE = 10;

    /**
     * 最大每页记录数
     */
    private static final int MAX_PAGE_SIZE = 1000;

    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }

    public int getTotalPage() {
        return (int) Math.ceil((double) this.totals / (double) this.count);
    }

    public int getSize() {
        return totals-(page*count)>0?totals-(page*count):totals;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * 初始化一个新创建的Pageable对象
     */
    public PageUtil() {
    }

    /**
     * 初始化一个新创建的Pageable对象
     */
    public PageUtil(Integer page, Integer count) {
        if (page != null && page >= 0) {
            this.page = page;
        }
        if (count != null && count >= 0 && count <= MAX_PAGE_SIZE) {
            this.count = count;
        }
    }

    /**
     * 获取页码
     *
     * @return 页码
     */
    public int getPage() {
        return page;
    }

    /**
     * 设置页码
     */
    public void setPage(int page) {
        if (page < 1) {
            page = DEFAULT_PAGE_NUMBER;
        }
        this.page = page;
    }

    /**
     * 获取每页记录数
     *
     * @return 每页记录数
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置每页记录数
     * 每页记录数
     */
    public void setCount(int count) {
        if (count < 1 || count > MAX_PAGE_SIZE) {
            count = DEFAULT_PAGE_SIZE;
        }
        this.count = count;
    }
}
