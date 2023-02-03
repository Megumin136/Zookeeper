package com.bigdata.spark.zookeeper;

/**
 * @author   陈惜时
 * @contact Zookeeper实现分布式爬虫监控
 * @created time 2022-01-12
 */

public class ThreadUtil {
	public static void sleep(long millions){
		try {
			Thread.currentThread().sleep(millions);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		while(true){
			System.out.println((long)(Math.random() *5000));
		}
		
	}
}
