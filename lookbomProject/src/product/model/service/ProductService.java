package product.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import product.model.dao.ProductDao;
import product.model.vo.Product;
import product.model.vo.ProductDetail;
import product.model.vo.ProductFull;


public class ProductService {
	
	private ProductDao pdao = new ProductDao();

	public ProductService() {
	}

	public void addViewCount(int productNo) {
		 Connection conn = getConnection();
		 int result = pdao.addViewCount(conn, productNo);
		 if(result > 0)
			 commit(conn);
		 else
			 rollback(conn);
		 close(conn);
	}

	public ArrayList<ProductFull> selectProduct(int productNo) {
	Connection conn = getConnection();
	ArrayList<ProductFull> list = pdao.selectProduct(conn, productNo); 
	close(conn);
	
	return list;
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = pdao.getListCount(conn);
		close(conn);
		return listCount;
	}

	public ArrayList<ProductFull> selectList(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ProductFull> list = pdao.selectList(conn, currentPage, limit);
		close(conn);
		return list;
	}

	public ArrayList<String> getBrand() {
	    Connection conn = getConnection();
	    ArrayList<String> brand = pdao.getBrand(conn);
	    close(conn);
		return brand;
	}

	public int getListCount(String filterbrand) {
		Connection conn = getConnection();
		int listCount = pdao.getListCount(conn,filterbrand);
		close(conn);
		return listCount;
	}

	public ArrayList<ProductFull> selectList(int currentPage, int limit, String filterbrand, String filterkey) {
		Connection conn = getConnection();
		ArrayList<ProductFull> list = pdao.selectList(conn, currentPage, limit, filterbrand, filterkey);
		close(conn);
		return list;
	}

	public ArrayList<ProductFull> selectList(int currentPage, int limit, String filterkey) {
		Connection conn = getConnection();
		ArrayList<ProductFull> list = pdao.selectList(conn, currentPage, limit, filterkey);
		close(conn);
		return list;
	}

	public ArrayList<ProductFull> searchSelectList(String sName, int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ProductFull> list = pdao.searchSelectList(conn,sName,currentPage,limit);
		close(conn);
		return list;
	}

	



	
}
