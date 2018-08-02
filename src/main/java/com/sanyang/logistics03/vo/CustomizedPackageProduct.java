package com.sanyang.logistics03.vo;

public class CustomizedPackageProduct {
	
	private Integer package_id;
	
	private Integer productid;
	
	public CustomizedPackageProduct() {
		// TODO Auto-generated constructor stub
	}

	public CustomizedPackageProduct(Integer package_id, Integer productid) {
		super();
		this.package_id = package_id;
		this.productid = productid;
	}

	public Integer getPackage_id() {
		return package_id;
	}

	public void setPackage_id(Integer package_id) {
		this.package_id = package_id;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	@Override
	public String toString() {
		return "CustomizedPackageProduct [package_id=" + package_id + ", productid=" + productid + "]";
	}

	
}
