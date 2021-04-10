package com.taeyang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface TaeyangMapper {

    @Select("SELECT District FROM city")
    ArrayList<String> getApiTestGet2() ;

}
