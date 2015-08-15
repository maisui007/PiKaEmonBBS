/**   
* @Title: PostModel.java 
* @Package com.julius.bbs.user 
* @Description: 帖子Model
* @author julius 
* @date 2015年8月15日 上午8:17:19 
* @version V1.0   
*/
package com.julius.bbs.post;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.julius.bbs.user.UserModel;
import com.julius.common.model.BaseModel;

/** 
* @ClassName: PostModel
* @Description: 帖子Model
* @author julius 
* @date 2015年8月15日 上午8:17:19 
*  
*/
@Entity
@Table(name="bbs_post")
public class PostModel extends BaseModel {

	/** 
	* UID
	*/ 
	private static final long serialVersionUID = 7693346107139014347L;
	
	@ManyToOne
	@JoinColumn(name="board_id")
	private BoardModel board;//所属版面
	
	@OneToMany(mappedBy="post")
	private List<ReplyModel> replys = new ArrayList<ReplyModel>();
	
	@Column(name="title")
	private String title;//帖子标题
	
	@Basic(fetch=FetchType.LAZY)
	@Column(columnDefinition="longtext")
	private String content;//帖子内容
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserModel author;//作者
	
	@Column(name="hit")
	private int hit;//点击数
	
	@Column(name="read_only",length=1)
	private boolean readOnly;//是否只读
	
	@Column(name="is_top",length=1)
	private boolean isTop;//是否置顶
	
	@Column(name="create_ip")
	private String createIp;//发布帖子的Ip

	/** 
	* @return board 
	*/
	public BoardModel getBoard() {
		return board;
	}

	/** 
	* @param board
	*/
	public void setBoard(BoardModel board) {
		this.board = board;
	}

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
	* @return author 
	*/
	public UserModel getAuthor() {
		return author;
	}

	/** 
	* @param author
	*/
	public void setAuthor(UserModel author) {
		this.author = author;
	}

	/** 
	* @return hit 
	*/
	public int getHit() {
		return hit;
	}

	/** 
	* @param hit
	*/
	public void setHit(int hit) {
		this.hit = hit;
	}

	/** 
	* @return readOnly 
	*/
	public boolean isReadOnly() {
		return readOnly;
	}

	/** 
	* @param readOnly
	*/
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	/** 
	* @return isTop 
	*/
	public boolean isTop() {
		return isTop;
	}

	/** 
	* @param isTop
	*/
	public void setTop(boolean isTop) {
		this.isTop = isTop;
	}

	

	/** 
	* @return replys 
	*/
	public List<ReplyModel> getReplys() {
		return replys;
	}

	/** 
	* @param replys
	*/
	public void setReplys(List<ReplyModel> replys) {
		this.replys = replys;
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

	
	
}
