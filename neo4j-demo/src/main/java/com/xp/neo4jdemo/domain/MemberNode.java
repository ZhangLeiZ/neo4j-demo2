package com.xp.neo4jdemo.domain;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * 用户节点
 * @author  chenxingyong
 * @email   chen.xing.yong@foxmail.com
 * @date    2018年11月15日下午5:32:17
 * @version 1.0
 */
@NodeEntity(label = "member")
public class MemberNode{
	
	@Id
	private Integer id;
	/**
	 * 头像
	 */
	private String thumb;
	
	/**
	 * 昵称
	 */
	private String nickName;
	
	/**
	 * 行业
	 */
	private String trade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}
}