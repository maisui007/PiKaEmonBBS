/**   
* @Title: UserModel.java 
* @Package com.julius.bbs.user 
* @Description: 用户Model
* @author julius 
* @date 2015年8月15日 上午8:08:04 
* @version V1.0   
*/
package com.julius.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.julius.common.model.BaseModel;
import com.julius.post.model.BoardModel;
import com.julius.post.model.PostModel;

/** 
* @ClassName: UserModel
* @Description: 用户Model
* @author julius 
* @date 2015年8月15日 上午8:08:04 
*  
*/
@Entity
@Table(name="bbs_user")
public class UserModel extends BaseModel {
	
	/** 
	* UID
	*/ 
	private static final long serialVersionUID = -1875754590489215591L;

	@Column(name="username")
	private String username;//用户名
	
	@Column(name="password")
	private String password;//密码
	
	@Column(name="nickName")
	private String nickName;//昵称
	
	@Column(name="sex")
	private String sex;//性别
	
	@Column(name="create_ip")
	private String createIp;//创建的Ip
	
	@Column(name="email")
	private String email;//邮箱
	
	@Column(name="birthday")
	private Date birthday;//生日
	
	@ManyToMany(mappedBy="managers")
	private Set<BoardModel> boards = new HashSet<BoardModel>();//管理的版面

	@OneToMany(mappedBy="author")
	private List<PostModel> posts = new ArrayList<PostModel>();
	/** 
	* @return username 
	*/
	public String getUsername() {
		return username;
	}

	/** 
	* @param username
	*/
	public void setUsername(String username) {
		this.username = username;
	}

	/** 
	* @return password 
	*/
	public String getPassword() {
		return password;
	}

	/** 
	* @param password
	*/
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	* @return nickName 
	*/
	public String getNickName() {
		return nickName;
	}

	/** 
	* @param nickName
	*/
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/** 
	* @return sex 
	*/
	public String getSex() {
		return sex;
	}

	/** 
	* @param sex
	*/
	public void setSex(String sex) {
		this.sex = sex;
	}

	
	/** 
	* @return createIp 
	*/
	public String getCreateIp() {
		return createIp;
	}

	/** 
	* @param createIp
	*/
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}

	/** 
	* @return email 
	*/
	public String getEmail() {
		return email;
	}

	/** 
	* @param email
	*/
	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	* @return birthday 
	*/
	public Date getBirthday() {
		return birthday;
	}

	/** 
	* @param birthday
	*/
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/** 
	* @return boards 
	*/
	public Set<BoardModel> getBoards() {
		return boards;
	}

	/** 
	* @param boards
	*/
	public void setBoards(Set<BoardModel> boards) {
		this.boards = boards;
	}
	
	
	
}
