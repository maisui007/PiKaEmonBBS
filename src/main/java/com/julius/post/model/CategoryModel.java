/**   
* @Title: CategoryModel.java 
* @Package com.julius.bbs.user 
* @Description: 分类Model
* @author julius 
* @date 2015年8月15日 上午8:16:09 
* @version V1.0   
*/
package com.julius.post.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.julius.common.model.BaseModel;

/** 
* @ClassName: CategoryModel 
* @Description: 分类Model
* @author julius 
* @date 2015年8月15日 上午8:16:09 
*  
*/
@Entity
@Table(name="bbs_category")
public class CategoryModel extends BaseModel {

	/** 
	* UID
	*/ 
	private static final long serialVersionUID = -7208898209300887279L;
	
	@Column(name="name")
	private String name;//分类名称
	
	@OneToMany(mappedBy="category")
	private List<BoardModel> boards = new ArrayList<BoardModel>();//分类下的版块

	/** 
	* @return name 
	*/
	public String getName() {
		return name;
	}

	/** 
	* @param name
	*/
	public void setName(String name) {
		this.name = name;
	}

	/** 
	* @return boards 
	*/
	public List<BoardModel> getBoards() {
		return boards;
	}

	/** 
	* @param boards
	*/
	public void setBoards(List<BoardModel> boards) {
		this.boards = boards;
	}
	
	
}
