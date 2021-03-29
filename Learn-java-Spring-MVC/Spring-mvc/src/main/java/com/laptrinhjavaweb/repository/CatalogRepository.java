package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.CatalogEntity;

public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
}
