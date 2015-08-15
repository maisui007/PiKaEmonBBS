/**   
* @Title: BoardModel.java 
* @Package com.julius.bbs.user 
* @Description: 版块Model
* @author julius 
* @date 2015年8月15日 上午8:11:02 
* @version V1.0   
*/
package com.julius.bbs.post;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.julius.bbs.user.UserModel;
import com.julius.common.model.BaseModel;

/** 
* @ClassName: BoardModel 
* @Description: 版块Model
* @author julius 
* @date 2015年8月15日 上午8:11:02 
*  
*/
@Entity
@Table(name="bbs_board")
public class BoardModel extends BaseModel {

	/** 
	* UID
	*/ 
	private static final long serialVersionUID = 5267103095843777768L;
	
	@Column(name="name")
	private String name;//版块名称
	
	@Column(name="category")
	private CategoryModel category;//所属分类
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="bbs_board_user",
	joinColumns={@JoinColumn(name="board_id")},
	inverseJoinColumns={@JoinColumn(name="user_id")})	
	private Set<UserModel> users = new HashSet<UserModel>();

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
	* @return category 
	*/
	public CategoryModel getCategory() {
		return category;
	}

	/** 
	* @param category
	*/
	public void setCategory(CategoryModel category) {
		this.category = category;
	}

	/** 
	* @return users 
	*/
	public Set<UserModel> getUsers() {
		return users;
	}

	/** 
	* @param users
	*/
	public void setUsers(Set<UserModel> users) {
		this.users = users;
	}
	
	

}
