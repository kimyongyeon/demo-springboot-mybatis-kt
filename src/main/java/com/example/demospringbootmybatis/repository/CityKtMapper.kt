package com.example.demospringbootmybatis.repository

import com.example.demospringbootmybatis.dto.City
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface CityKtMapper {
    @Select("""
          SELECT ID
              ,NAME
              ,COUNTRY
              ,POPULATION
          FROM CITY
    """)
    fun findAll(): List<City>

    @Select("""
        SELECT NAME FROM city WHERE name=#{name}
    """)
    fun findById(@Param("name") name: String): City
}