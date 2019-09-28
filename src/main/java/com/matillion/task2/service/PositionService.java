package com.matillion.task2.service;

import com.matillion.task2.dao.Position;
import com.matillion.task2.service.repository.PositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public List<Position> findAllByPayType(String payType) {
        return positionRepository.findAllByPayType(payType);
    }

}
