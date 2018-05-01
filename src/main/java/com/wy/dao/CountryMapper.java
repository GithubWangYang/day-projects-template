package com.wy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wy.model.Country;

import tk.mybatis.mapper.common.Mapper;

public interface CountryMapper extends Mapper<Country> {
	@Select("select * from country where countrycode=#{countrycode}")
	List<Country> mySelect(@Param("countrycode") String countrycode);
}