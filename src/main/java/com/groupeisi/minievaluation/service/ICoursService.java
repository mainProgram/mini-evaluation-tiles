package com.groupeisi.minievaluation.service;

import com.groupeisi.minievaluation.dto.CoursDto;

import java.util.List;
import java.util.Optional;

public interface ICoursService {
    Optional<List<CoursDto>> findAll();

    boolean save(CoursDto coursDto);
}
