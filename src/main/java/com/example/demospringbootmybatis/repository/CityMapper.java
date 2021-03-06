package com.example.demospringbootmybatis.repository;

import com.example.demospringbootmybatis.dto.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    City selectCityById(Long id);
    List<City> selectAllCity();
    void insertCity(City city);
}
