package search.model.vo;

import java.io.Serializable;

public class Search implements Serializable{
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2049235884911136650L;
	private int searchNo;
	private String searchTitle;
	private int count;
	public Search() {}
	public Search(int searchNo, String searchTitle, int count) {
		super();
		this.searchNo = searchNo;
		this.searchTitle = searchTitle;
		this.count = count;
	}
	public int getSearchNo() {
		return searchNo;
	}
	public void setSearchNo(int searchNo) {
		this.searchNo = searchNo;
	}
	public String getSearchTitle() {
		return searchTitle;
	}
	public void setSearchTitle(String searchTitle) {
		this.searchTitle = searchTitle;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return searchNo + ", " + searchTitle + ", " + count;
	}
}
