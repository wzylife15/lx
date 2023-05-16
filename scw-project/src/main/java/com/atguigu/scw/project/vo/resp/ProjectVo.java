package com.atguigu.scw.project.vo.resp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.atguigu.scw.project.bean.TReturn;

import lombok.Data;

@Data
public class ProjectVo  implements Serializable{
	

	private Integer memberid;// 会员id

	private Integer id;

	private String name;// 项目名称
	private String remark;// 项目简介
	
	private String headerImage;// 项目头部图片
	private List<String> detailsImage= new ArrayList<>();;// 项目详情图片
	
}
