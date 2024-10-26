package com.groupeisi.minievaluation.mapper;

import com.groupeisi.minievaluation.dto.CoursDto;
import com.groupeisi.minievaluation.entity.CoursEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CoursMapper {
    private CoursMapper() {
    }

    public static CoursEntity toCoursEntity(CoursDto coursDto) {

        CoursEntity coursEntity = new CoursEntity();

        coursEntity.setClasse(coursDto.getClasse());
        coursEntity.setMatiere(coursDto.getMatiere());
        coursEntity.setProfesseur(coursDto.getProfesseur());

        return coursEntity;
    }

    public static CoursDto toCoursDto(CoursEntity coursEntity) {

        CoursDto coursDto = new CoursDto();

        coursDto.setClasse(coursEntity.getClasse());
        coursDto.setMatiere(coursEntity.getMatiere());
        coursDto.setProfesseur(coursEntity.getProfesseur());

        return coursDto;
    }

    public static List<CoursDto> toListCoursDto(List<CoursEntity> coursEntities) {
        return coursEntities.stream()
                .map(CoursMapper::toCoursDto)
                .collect(Collectors.toList());
    }

    public static List<CoursEntity> toListCoursEntity(List<CoursDto> coursDtos) {
        return coursDtos.stream()
                .map(CoursMapper::toCoursEntity)
                .collect(Collectors.toList());
    }
}
