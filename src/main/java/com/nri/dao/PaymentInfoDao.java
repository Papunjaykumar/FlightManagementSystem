package com.nri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nri.entity.PaymentInfo;

public interface PaymentInfoDao extends JpaRepository<PaymentInfo, String> {

}
