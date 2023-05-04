package com.claudiorosa.appanimals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claudiorosa.appanimals.entity.CachorroEntity;

@Repository
public interface CachorroRepository extends JpaRepository<CachorroEntity, Integer> {

}

