package com.cjb.dao;

import com.cjb.pojo.Reservation;

public interface ReservationMapper {
    int deleteByPrimaryKey(Integer reservationId);

    int insert(Reservation record);

    int insertSelective(Reservation record);

    Reservation selectByPrimaryKey(Integer reservationId);

    int updateByPrimaryKeySelective(Reservation record);

    int updateByPrimaryKey(Reservation record);
}