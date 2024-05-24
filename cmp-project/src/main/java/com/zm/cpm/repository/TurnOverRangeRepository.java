package com.zm.cpm.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zm.cpm.entities.TurnoverRange;

public interface TurnOverRangeRepository extends JpaRepository<TurnoverRange, Serializable> {
	Optional<TurnoverRange> findByRangeId(Integer value);

}
