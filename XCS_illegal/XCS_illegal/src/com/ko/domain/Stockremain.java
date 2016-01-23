/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseStockremain;
import com.ko.util.DB;

public class Stockremain extends BaseStockremain {
	private String offName = "Dummy Off Name";
	private String legislationName = "Dummy Regislation";
	private String productName = "Dummy Product Name";
	private String isDomesticName = "Dummy Is Domestic Name";
	private String sizeQty = "Dummy Size Qty";
	private String stockInQty = "Dummy Stock In Qty";
	private String destroyQty = "Dummy Destroy Qty";
	private String saleQty = "Dummy Sale Qty";
	private String returnQty = "Dummy Return Qty";
	private String keepQty = "Dummy Keep Qty";
	private String transferQty = "Dummy Transfer Qty";
	private String stockQty = "Dummy Stock Qty";

	public Stockremain(DB db) {
		super(db);
	}
	// business method go here
	public String getOffName() {
		return offName;
	}

	public void setOffName(String offName) {
		this.offName = offName;
	}

	public String getLegislationName() {
		return legislationName;
	}

	public void setLegislationName(String legislationName) {
		this.legislationName = legislationName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getIsDomesticName() {
		return isDomesticName;
	}

	public void setIsDomesticName(String isDomesticName) {
		this.isDomesticName = isDomesticName;
	}

	public String getSizeQty() {
		return sizeQty;
	}

	public void setSizeQty(String sizeQty) {
		this.sizeQty = sizeQty;
	}

	public String getStockInQty() {
		return stockInQty;
	}

	public void setStockInQty(String stockInQty) {
		this.stockInQty = stockInQty;
	}

	public String getDestroyQty() {
		return destroyQty;
	}

	public void setDestroyQty(String destroyQty) {
		this.destroyQty = destroyQty;
	}

	public String getSaleQty() {
		return saleQty;
	}

	public void setSaleQty(String saleQty) {
		this.saleQty = saleQty;
	}

	public String getReturnQty() {
		return returnQty;
	}

	public void setReturnQty(String returnQty) {
		this.returnQty = returnQty;
	}

	public String getKeepQty() {
		return keepQty;
	}

	public void setKeepQty(String keepQty) {
		this.keepQty = keepQty;
	}

	public String getTransferQty() {
		return transferQty;
	}

	public void setTransferQty(String transferQty) {
		this.transferQty = transferQty;
	}

	public String getStockQty() {
		return stockQty;
	}

	public void setStockQty(String stockQty) {
		this.stockQty = stockQty;
	}
}