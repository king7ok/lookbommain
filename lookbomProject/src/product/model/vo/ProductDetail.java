package product.model.vo;

import java.io.Serializable;

public class ProductDetail implements Serializable {

	private static final long serialVersionUID = 1122L;

	private int productDetailNo; //상품상세번호
	private String productColor; //색상
	private String productImage1; //상품이미지1
	private String productImage2; //상품이미지2
	private String productImage3; //상품이미지3
	private String productImage4; //상품이미지4
	private String productImage5; //상품이미지5
	private int ssizeQuantity; //S사이즈수량
	private int msizeQuantity; //M사이즈수량
	private int lsizeQuantity; //L사이즈수량
	private int xlsizeQuantity; //XL사이즈수량
    private int totalEnterQuantity; //총입고수량
    private int totalSaleRate; //총판매량
    private int productNo; //상품번호
 
    public ProductDetail() {}

	public ProductDetail(int productDetailNo, String productColor, String productImage1, String productImage2,
			String productImage3, String productImage4, String productImage5, int ssizeQuantity, int msizeQuantity,
			int lsizeQuantity, int xlsizeQuantity, int totalEnterQuantity, int totalSaleRate, int productNo) {
		super();
		this.productDetailNo = productDetailNo;
		this.productColor = productColor;
		this.productImage1 = productImage1;
		this.productImage2 = productImage2;
		this.productImage3 = productImage3;
		this.productImage4 = productImage4;
		this.productImage5 = productImage5;
		this.ssizeQuantity = ssizeQuantity;
		this.msizeQuantity = msizeQuantity;
		this.lsizeQuantity = lsizeQuantity;
		this.xlsizeQuantity = xlsizeQuantity;
		this.totalEnterQuantity = totalEnterQuantity;
		this.totalSaleRate = totalSaleRate;
		this.productNo = productNo;
	}

	public int getProductDetailNo() {
		return productDetailNo;
	}

	public void setProductDetailNo(int productDetailNo) {
		this.productDetailNo = productDetailNo;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductImage1() {
		return productImage1;
	}

	public void setProductImage1(String productImage1) {
		this.productImage1 = productImage1;
	}

	public String getProductImage2() {
		return productImage2;
	}

	public void setProductImage2(String productImage2) {
		this.productImage2 = productImage2;
	}

	public String getProductImage3() {
		return productImage3;
	}

	public void setProductImage3(String productImage3) {
		this.productImage3 = productImage3;
	}

	public String getProductImage4() {
		return productImage4;
	}

	public void setProductImage4(String productImage4) {
		this.productImage4 = productImage4;
	}

	public String getProductImage5() {
		return productImage5;
	}

	public void setProductImage5(String productImage5) {
		this.productImage5 = productImage5;
	}

	public int getSsizeQuantity() {
		return ssizeQuantity;
	}

	public void setSsizeQuantity(int ssizeQuantity) {
		this.ssizeQuantity = ssizeQuantity;
	}

	public int getMsizeQuantity() {
		return msizeQuantity;
	}

	public void setMsizeQuantity(int msizeQuantity) {
		this.msizeQuantity = msizeQuantity;
	}

	public int getLsizeQuantity() {
		return lsizeQuantity;
	}

	public void setLsizeQuantity(int lsizeQuantity) {
		this.lsizeQuantity = lsizeQuantity;
	}

	public int getXlsizeQuantity() {
		return xlsizeQuantity;
	}

	public void setXlsizeQuantity(int xlsizeQuantity) {
		this.xlsizeQuantity = xlsizeQuantity;
	}

	public int getTotalEnterQuantity() {
		return totalEnterQuantity;
	}

	public void setTotalEnterQuantity(int totalEnterQuantity) {
		this.totalEnterQuantity = totalEnterQuantity;
	}

	public int getTotalSaleRate() {
		return totalSaleRate;
	}

	public void setTotalSaleRate(int totalSaleRate) {
		this.totalSaleRate = totalSaleRate;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    @Override
    public String toString() {    	
    	return this.productDetailNo+", "+this.productColor+", "+this.productImage1+", "+this.productImage2+", "+
    			this.productImage3+", "+this.productImage4+", "+this.productImage5+", "+this.ssizeQuantity+", "+this.msizeQuantity+", "+
    			this.lsizeQuantity+", "+this.xlsizeQuantity+", "+this.totalEnterQuantity+", "+this.totalSaleRate+", "+this.productNo;
    }
    
}
