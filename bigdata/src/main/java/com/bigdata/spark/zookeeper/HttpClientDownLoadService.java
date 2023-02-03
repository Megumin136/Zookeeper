package com.bigdata.spark.zookeeper;
/**
 * @author   陈惜时
 * @contact Zookeeper实现分布式爬虫监控
 * @created time 2022-01-12
 */

public class HttpClientDownLoadService implements IDownLoadService {

	public Page download(String url) {
		// TODO Auto-generated method stub
		Page page = new Page();
		page.setContent(PageDownLoadUtil.getPageContent(url));
		page.setUrl(url);
		return page;
	}

}
