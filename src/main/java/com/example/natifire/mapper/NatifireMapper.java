package com.example.natifire.mapper;

import com.example.natifire.dao.NatifireEntity;
import com.example.natifire.model.NatifireDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public abstract class NatifireMapper {

    public static final NatifireMapper INSTANCE = Mappers.getMapper(NatifireMapper.class);


    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "city", source = "city")
    })
    public abstract NatifireDTO entityToNatifireDTO(NatifireEntity weatherEntity);


    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "city", source = "city")
    })
    public abstract NatifireEntity natifireDTOToEntity(NatifireDTO natifireDTO);


    public List<NatifireDTO> entityListToNatifireDTOList(List<NatifireEntity> natifireEntityList) {
        List<NatifireDTO> natifireDTOList = natifireEntityList
                .stream()
                .map(m -> entityToNatifireDTO(m))
                .collect(Collectors.toList());
        return natifireDTOList;
    }

}
