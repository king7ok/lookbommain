package main.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Product1 implements Serializable {

	private int productNo; //상품번호
	private String productName; //상품이름
    private String productType; //상품분류
    private String brand; //브랜드
    private String brand_image; //브랜드이미지
    private String season; //시즌
    private String sex; //성별
    private int productPrice; //판매가
    private double discountRate; //할인률
    private String sizeCategory; //사이즈분류
    private String sizeContents; //사이즈내용
    private String moreInto; //추가정보
    private int viewCount; //조회수
    private Date resiter; //등록일자
    private int productLike; //좋아요
    private String img;
	private static final long serialVersionUID = 1114L;

	public Product1() {}

	public Product1(int productNo, String productName, String productType, String brand, String brand_image,
			String season, String sex, int productPrice, double discountRate, String sizeCategory, String sizeContents,
			String moreInto, int viewCount, Date resiter, int productLike, String img) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productType = productType;
		this.brand = brand;
		this.brand_image = brand_image;
		this.season = season;
		this.sex = sex;
		this.productPrice = productPrice;
		this.discountRate = discountRate;
		this.sizeCategory = sizeCategory;
		this.sizeContents = sizeContents;
		this.moreInto = moreInto;
		this.viewCount = viewCount;
		this.resiter = resiter;
		this.productLike = productLike;
		this.img = img;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand_image() {
		return brand_image;
	}

	public void setBrand_image(String brand_image) {
		this.brand_image = brand_image;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getSizeCategory() {
		return sizeCategory;
	}

	public void setSizeCategory(String sizeCategory) {
		this.sizeCategory = sizeCategory;
	}

	public String getSizeContents() {
		return sizeContents;
	}

	public void setSizeContents(String sizeContents) {
		this.sizeContents = sizeContents;
	}

	public String getMoreInto() {
		return moreInto;
	}

	public void setMoreInto(String moreInto) {
		this.moreInto = moreInto;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public Date getResiter() {
		return resiter;
	}

	public void setResiter(Date resiter) {
		this.resiter = resiter;
	}

	public int getProductLike() {
		return productLike;
	}

	public void setProductLike(int productLike) {
		this.productLike = productLike;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
