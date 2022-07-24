package com.raisetech.reisetechem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.raisetech.reisetechem.entity.Materials;

@Mapper
public interface MaterialsMapper {
    
    @MapKey("id")
    @Select("SELECT * FROM materials")
    List<Materials> findAll();
    
}
