/**   
* @Title: ReplyModel.java 
* @Package com.julius.bbs.post 
* @Description: 回复Model
* @author julius 
* @date 2015年8月15日 上午8:21:30 
* @version V1.0   
*/
package com.julius.post.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.julius.common.model.BaseModel;

/** 
* @ClassName: ReplyModel 
* @Description: 回复Model
* @author julius 
* @date 2015年8月15日 上午8:21:30 
*  
*/
@Entity
@Table(name="bbs_reply")
public class ReplyModel extends BaseModel {

	/** 
	* UID
	*/ 
	private static final long serialVersionUID = 5352635257682148406L;

	@Column(name="title")
	private String title;//回复标题
	
	@Column(name="content")
	private String content;//回复内容
	
	@ManyToOne
	@JoinColumn(name="post")
	private PostModel post;//所属帖子
	
	@Column(name="create_ip")
	private String createIp;//发布的Ip
	
	@Column(name="floor")
	private Integer floor;//发布的楼层

	/** 
	* @return title 
	*/
	public String getTitle() {
		return title;
	}

	/** 
	* @param title
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	/** 
	* @return content 
	*/
	public String getContent() {
		return content;
	}

	/** 
	* @param content
	*/
	public void setContent(String content) {
		this.content = content;
	}

	/** 
	* @return post 
	*/
	public PostModel getPost() {
		return post;
	}

	/** 
	* @param post
	*/
	public void setPost(PostModel post) {
		this.post = post;
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
	* @return floor 
	*/
	public Integer getFloor() {
		return floor;
	}

	/** 
	* @param floor
	*/
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
	
	
	
}
