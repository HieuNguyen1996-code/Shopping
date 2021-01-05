package com.ECommercial.ECommercial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECommercial.ECommercial.model.BufCart;
@Repository
public interface BufCartDao extends JpaRepository<BufCart, Integer> {

}
