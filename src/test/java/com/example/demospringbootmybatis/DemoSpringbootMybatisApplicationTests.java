package com.example.demospringbootmybatis;

import com.example.demospringbootmybatis.dto.City;
import com.example.demospringbootmybatis.repository.CityKtMapper;
import com.example.demospringbootmybatis.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class DemoSpringbootMybatisApplicationTests {

    @Autowired
    CityService service;

    @Autowired
    CityKtMapper cityKtMapper;

    @Test
    public void getKt() {
        List list = cityKtMapper.findAll();
        list.forEach(data -> System.out.println("data => " + data));
    }

    @Test
    public void getCityById() {
        City city = service.getCityById(1L);
        log.info("city : {}", city);
    }

    @Test
    public void getAllCity() {
        List<City> cities = service.getAllCity();
        log.info("cities : {}", cities);
    }

    @Test
    public void addCities() {
        service.addCity(new City("뉴욕", "미국", 1_000_000L));
        service.addCity(new City("런던", "영국", 2_000_000L));
        service.addCity(new City("파리", "프랑스", 3_000_000L));
    }

}
