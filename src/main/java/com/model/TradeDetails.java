package com.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TradeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private LocalDateTime datetime;
	
	
	private String stockname;
	
	private Double listingprice;
	
	private Double quantity;
	
	@Enumerated(EnumType.STRING)
	private TradeType type;
	
	private Double priceperunit;

	public TradeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TradeDetails(int id, LocalDateTime datetime, String stockname,
			Double listingprice, Double quantity, TradeType type, Double priceperunit) {
		super();
		this.id = id;
		this.datetime = datetime;
		
		this.stockname = stockname;
		this.listingprice = listingprice;
		this.quantity = quantity;
		this.type = type;
		this.priceperunit = priceperunit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "TradeDetails [id=" + id + ", datetime=" + datetime 
				+ ", stockname=" + stockname + ", listingprice=" + listingprice + ", quantity=" + quantity + ", type="
				+ type + ", priceperunit=" + priceperunit + "]";
	}

	
	
	

}
