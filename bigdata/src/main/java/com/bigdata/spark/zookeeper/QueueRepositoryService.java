package com.bigdata.spark.zookeeper;

import org.apache.commons.lang3.StringUtils;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
/**
 * @author   陈惜时
 * @contact Zookeeper实现分布式爬虫监控
 * @created time 2022-01-12
 */

public class QueueRepositoryService implements IRepositoryService {
	//高优先级
	private Queue<String> highLevelQueue = new ConcurrentLinkedDeque<String>();
	//低优先级
	private Queue<String> lowLevelQueue = new ConcurrentLinkedDeque<String>();
	
	public String poll() {
		// TODO Auto-generated method stub
		//先解析高优先级队列
		String url = highLevelQueue.poll();
		if(StringUtils.isBlank(url)){
			//然后在解析低优先级队列
			url = lowLevelQueue.poll();
		}
		return url;
	}

	public void addHighLevel(String url) {
		// TODO Auto-generated method stub
		this.highLevelQueue.add(url);
	}

	public void addLowLevel(String url) {
		// TODO Auto-generated method stub
		this.lowLevelQueue.add(url);
	}

}
