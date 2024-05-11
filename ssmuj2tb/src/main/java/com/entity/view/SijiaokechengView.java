package com.entity.view;

import com.entity.SijiaokechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 私教课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 09:44:11
 */
@TableName("sijiaokecheng")
public class SijiaokechengView  extends SijiaokechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SijiaokechengView(){
	}
 
 	public SijiaokechengView(SijiaokechengEntity sijiaokechengEntity){
 	try {
			BeanUtils.copyProperties(this, sijiaokechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
