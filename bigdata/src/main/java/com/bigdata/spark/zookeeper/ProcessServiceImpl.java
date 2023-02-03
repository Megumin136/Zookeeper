package com.bigdata.spark.zookeeper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author   陈惜时
 * @contact Zookeeper实现分布式爬虫监控
 * @created time 2022-01-12
 */

public class ProcessServiceImpl implements IProcessService {
	public void process(Page page) {
		// TODO Auto-generated method stub
		String content = page.getContent();

		//解析成Document文档
		Document doc = Jsoup.parse(content);

		Elements lis = doc.select("ul.clearfix li");

        for(Element li:lis){
			Elements as = li.select("div.book-item-r a");
			Element a = as.get(0);
			String title = a.text();
			System.out.println("title="+title);

			String author=li.select("div.book-item-info a.author").text();
			System.out.println("author="+author);

			String weaken=li.select("div.book-item-info  a.g-user-shutdown").text();
			System.out.println("weaken="+weaken);

            System.out.println("-------------------------------------");


		}
		
	}


}
