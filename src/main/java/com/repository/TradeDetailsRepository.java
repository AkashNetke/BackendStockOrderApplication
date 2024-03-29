package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.TradeDetails;

@Repository
public interface TradeDetailsRepository extends JpaRepository<TradeDetails	, Integer>{

}
