package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		/*
		 * Runnable task = ()-> { System.out.println("Hello World"); };
		 * 
		 * // MyThread mT = new MyThread(); Thread t = new Thread(task); t.start();
		 * 
		 * 
		 * int[] arr1 = {1,3,5}; int[] arr2 = {2,4,4,6}; //TestMain.mergeArray(arr1,
		 * arr2);
		 * 
		 * System.out.println(TestMain.countWord("one two    three four      "));
		 * System.out.println("---"+Runtime.getRuntime().availableProcessors());
		 */

		ArrayList<Integer> space = new ArrayList<Integer>();

		space.add(2);
		space.add(5);
		space.add(4);
		space.add(6);
		space.add(8);

		System.out.println(segment(3, space));

	}

	public static void mergeArray(int[] arr1, int[] arr2) {

		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] finalArr = new int[len1 + len2];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < len1 && j < len2) {
			if (arr1[i] < arr2[j]) {
				finalArr[k] = arr1[i];
				i++;
			} else {
				finalArr[k] = arr2[j];
				j++;
			}
			k++;
		}

		if (i < len1) {
			while (i < len1) {
				finalArr[k] = arr1[i];
				i++;
				k++;
			}
		} else {
			while (j < len2) {
				finalArr[k] = arr2[j];
				j++;
				k++;
			}
		}

		System.out.println("The final Array");
		for (int y : finalArr) {
			System.out.print(y + " , ");
		}

	}

	public static int countWord(String str) {
		int count = 0;
		char space = ' ';
		// str = str.trim();
		if (str.length() > 0) {
			count = count + 1;
		}
		int len = str.length();
		int numSpace = 0;

		for (int i = 0; i < len; i++) {

			if (str.charAt(i) == space) {
				count++;
				numSpace++;
				while (i < (len - 1) && str.charAt(i + 1) == space) {
					i++;
					numSpace++;
				}
			}
		}
		if (numSpace == len) {
			return 0;
		} else if (str.charAt(len - 1) == space) {
			return (count - 1);
		} else {
			return count;
		}

	}

	public static int segment(int x, List<Integer> space) {
		List<Integer> minList = new ArrayList<Integer>();
		for (int i = 0; (i <= (space.size() - x)); i++) {
			int min = space.get(i);
			for (int j = i + 1; j < (i + x); j++) {
				if (min > space.get(j)) {
					min = space.get(j);
				}
			}
			minList.add(min);
		}
		//System.out.println(minList);
		Collections.sort(minList);
		//System.out.println(minList);
		return minList.get(minList.size() - 1);

	}
	
	public static List<String> getArticleTitles(String author) {
        List<String> titleList = new ArrayList<String>();
		/*
		 * Integer pageNum = 0; String finalUrl = url+author; finalUrl =
		 * finalUrl+"&page="+pageNum; RestTemplate rest = new RestTemplate();
		 * List<Articles> articles = rest.getForObject(finalUrl,Articles.class);
		 * System.out.println(articles);
		 * 
		 */
        return titleList;

    }


}


class PageResponse {
    private int page;
    private int per_page;
    private int total ;
    private int total_pages;
    private DataObject data;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public DataObject getData() {
		return data;
	}
	public void setData(DataObject data) {
		this.data = data;
	}
    
}

class DataObject {
     private String title;
     private String  url;
     private String author;
     private Long num_comments;
     private Long story_id;
     private String story_title;
     private String story_url;
     private Long parent_id;
     private Long created_at;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Long getNum_comments() {
		return num_comments;
	}
	public void setNum_comments(Long num_comments) {
		this.num_comments = num_comments;
	}
	public Long getStory_id() {
		return story_id;
	}
	public void setStory_id(Long story_id) {
		this.story_id = story_id;
	}
	public String getStory_title() {
		return story_title;
	}
	public void setStory_title(String story_title) {
		this.story_title = story_title;
	}
	public String getStory_url() {
		return story_url;
	}
	public void setStory_url(String story_url) {
		this.story_url = story_url;
	}
	public Long getParent_id() {
		return parent_id;
	}
	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}
	public Long getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Long created_at) {
		this.created_at = created_at;
	}
}
