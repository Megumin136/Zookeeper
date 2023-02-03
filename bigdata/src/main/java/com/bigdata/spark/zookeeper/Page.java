package com.bigdata.spark.zookeeper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author   陈惜时
 * @contact Zookeeper实现分布式爬虫监控
 * @created time 2022-01-12
 */

public class Page {
	//页面内容
	private String content;
	//页面url
	private String url;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
