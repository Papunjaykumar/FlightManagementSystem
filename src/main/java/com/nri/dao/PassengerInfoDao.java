package com.nri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nri.entity.PassengerInfo;

public interface PassengerInfoDao extends JpaRepository<PassengerInfo, Long> {

}
