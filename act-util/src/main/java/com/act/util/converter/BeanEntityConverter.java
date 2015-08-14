package com.act.util.converter;

public interface BeanEntityConverter<T, K> {

	K convertEntityToBean();
	
	T convertBeanToEntity();
	
}
