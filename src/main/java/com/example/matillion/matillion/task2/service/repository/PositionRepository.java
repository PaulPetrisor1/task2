package com.example.matillion.matillion.task2.service.repository;

import com.example.matillion.matillion.task2.dao.Position;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PositionRepository extends CrudRepository<Position, Long> {
    List<Position> findAllByPayType(String payType);
}
