package com.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CreateOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;
	
	private LocalDateTime datetime;
		
	private String stockname;
	
	private Double listingprice;
	
	private Double quantity;
	
	@Enumerated(EnumType.STRING)
	private TradeType type;
	
	private Double priceperunit;
	
	private String Status = "created";

	public CreateOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateOrder(int orderid, LocalDateTime datetime, String stockname, Double listingprice, Double quantity,
			TradeType type, Double priceperunit, String status) {
		super();
		this.orderid = orderid;
		this.datetime = datetime;
		this.stockname = stockname;
		this.listingprice = listingprice;
		this.quantity = quantity;
		this.type = type;
		this.priceperunit = priceperunit;
		Status = status;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public Double getListingprice() {
		return listingprice;
	}

	public void setListingprice(Double listingprice) {
		this.listingprice = listingprice;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public TradeType getType() {
		return type;
	}

	public void setType(TradeType type) {
		this.type = type;
	}

	public Double getPriceperunit() {
		return priceperunit;
	}

	public void setPriceperunit(Double priceperunit) {
		this.priceperunit = priceperunit;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "CreateOrder [orderid=" + orderid + ", datetime=" + datetime + ", stockname=" + stockname
				+ ", listingprice=" + listingprice + ", quantity=" + quantity + ", type=" + type + ", priceperunit="
				+ priceperunit + ", Status=" + Status + "]";
	}



}
