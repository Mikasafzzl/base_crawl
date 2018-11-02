package com.etoak.crawl.link;

/**
 *  LinkFilter接口
 *  是否指定URL路径开头
 *
 */
public interface LinkFilter {
    public boolean accept(String url);
}
