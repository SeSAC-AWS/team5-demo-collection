package com.team5.collect.repository;

import com.team5.collect.entity.Collect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectRepository extends JpaRepository<Collect, Integer> {
}
