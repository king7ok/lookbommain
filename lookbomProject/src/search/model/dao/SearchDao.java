package search.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import product.model.vo.ProductFull;
import search.model.vo.Search;
import static common.JDBCTemplate.*;
public class SearchDao {
	public int insertSearch(Connection conn, String title) {
		int result = 0;
		System.out.println("insertdao 에서받은 title : " +title);
		PreparedStatement stmt = null;
		String query = "INSERT INTO SEARCH(SEARCH_NO, SEARCH_TITLE, SC_COUNT) VALUES (SEQ_SEARCH_NO.NEXTVAL, ?, 1)";
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, title);
			result = stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(stmt);
		}
		System.out.println("insertdao 결과 result : " + result);
		return result;
	}

	public int countUp(Connection conn, String title) {
		int result = 0;
		PreparedStatement stmt = null;
		String query = "update search set sc_count = (1+(select sc_count from search where search_title = ?)) where search_title = ?";
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, title);
			stmt.setString(2, title);
			result = stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		System.out.println("카운트업 dao result : " + result);
		return result;
	}

	public int checkTitle(Connection conn, String title) {
		ArrayList<Search> list = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = "SELECT * FROM SEARCH WHERE SEARCH_TITLE = ? ";
		try {
			
			stmt = conn.prepareStatement(query);
			stmt.setString(1, title);
			rset = stmt.executeQuery();
			while(rset.next()) {
				Search s = new Search();
				s.setSearchNo(rset.getInt("search_no"));
				s.setSearchTitle(rset.getString("search_title"));
				s.setCount(rset.getInt("sc_count"));
				list.add(s);
			}
			if(list.size() == 0) {
				result = 0;
			}else {
				result = 1;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return result;
	}

	public ArrayList<Search> selectRank(Connection conn) {
		ArrayList<Search> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "select search_title from search order by sc_count desc ";
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				Search s = new Search();
				s.setSearchTitle(rset.getString("search_title"));
				list.add(s);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(rset);
		}
		
		return list;
	}
	public ArrayList<ProductFull> searchSelectList(Connection conn,String sName, int currentPage, int limit) {
		ArrayList<ProductFull> list = new ArrayList<>();
		System.out.println("searchSelectList에서받은 sname : " + sName);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		int startRow = (currentPage -1) * limit + 1;
		int endRow = startRow + limit - 1;
		String query = 
				 "select * from"
				          +" (select rownum rnum, product_no, product_name, product_type, brand, brand_image, season, sex, product_price, discount_rate,"
						+" size_category, size_contents, more_info, view_count, resiter, product_like,"
						+" product_detail_no, product_color, product_image1, product_image2, product_image3, product_image4, product_image5,"
						+" ssize_quantity, msize_quantity, lsize_quantity, xlsize_quantity, total_enter_quantity, total_sales_rate"
				+" from (select * from product join product_detail using (product_no) order by resiter desc, product_no desc, product_detail_no desc))"
				+" where (rnum >= ? and rnum <= ?) and (product_name = ? or product_type = ? or season = ?) ";
		
		try {
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, startRow);
			stmt.setInt(2, endRow);
			stmt.setString(3, "%"+sName+"%");
			stmt.setString(4,"%"+ sName+"%");
			stmt.setString(5, "%"+sName+"%");
			
			rset = stmt.executeQuery();
			while(rset.next()) {
				ProductFull productFull = new ProductFull();
				  
				  productFull.setProductNo(rset.getInt("product_no"));
				  productFull.setProductName(rset.getString("product_name"));
				  productFull.setProductType(rset.getString("product_type"));
				  productFull.setBrand(rset.getString("brand"));
				  productFull.setBrand_image(rset.getString("brand_image"));
				  productFull.setSeason(rset.getString("season"));
				  productFull.setSex(rset.getString("sex"));
				  productFull.setProductPrice(rset.getInt("product_price"));
				  productFull.setDiscountRate(rset.getDouble("discount_rate"));
				  productFull.setSizeCategory(rset.getString("size_category"));
				  productFull.setSizeContents(rset.getString("size_contents"));
				  productFull.setMoreInto(rset.getString("more_info"));
				  productFull.setViewCount(rset.getInt("view_count"));			  
				  productFull.setResiter(rset.getDate("resiter"));
				  productFull.setProductLike(rset.getInt("product_like"));		
				  productFull.setProductDetailNo(rset.getInt("product_detail_no"));
				  productFull.setProductColor(rset.getString("product_color"));
				  productFull.setProductImage1(rset.getString("product_image1"));
				  productFull.setProductImage2(rset.getString("product_image2"));
				  productFull.setProductImage3(rset.getString("product_image3"));
				  productFull.setProductImage4(rset.getString("product_image4"));
				  productFull.setProductImage5(rset.getString("product_image5"));			  
				  productFull.setSsizeQuantity(rset.getInt("ssize_quantity"));
				  productFull.setMsizeQuantity(rset.getInt("msize_quantity"));
				  productFull.setLsizeQuantity(rset.getInt("lsize_quantity"));
				  productFull.setXlsizeQuantity(rset.getInt("xlsize_quantity"));
				  productFull.setTotalEnterQuantity(rset.getInt("total_enter_quantity"));
				  productFull.setTotalSaleRate(rset.getInt("total_sales_rate"));
			
				  list.add(productFull);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		System.out.println(list);
		return list;
	}
	//상품 리스트 갯수
		public int getListCount(Connection conn,String sName) {
			int listCount = 0;
			PreparedStatement stmt = null;
			ResultSet rset = null;
			
		String query = "select count(*) from product where product_name = ? or product_type = ? or season = ? ";
			
			try {
				stmt = conn.prepareStatement(query);
				stmt.setString(1, "%"+sName+"%");
				stmt.setString(2, "%"+sName+"%");
				stmt.setString(3, "%"+sName+"%");
				rset = stmt.executeQuery();
				
				if(rset.next()) {
					listCount = rset.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			
			}finally {
				close(rset);
				close(stmt);
			}
			
			return listCount;	
		}
}
