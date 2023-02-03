package com.bigdata.spark.zookeeper;
/**
 * @author   陈惜时
 * @contact Zookeeper实现分布式爬虫监控
 * @created time 2022-01-12
 */

public interface IRepositoryService {

	public String poll();
	
	public void addHighLevel(String url);
	
	public void addLowLevel(String url);
}
