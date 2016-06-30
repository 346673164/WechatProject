package com.bilibala.wechat.dao;

import java.util.List;

import com.bilibala.wechat.model.pojo.WechatMenu;

/**
 * 微信公众号 菜单dao
 * 
 * @project wechatCore
 * @author smile
 * @createDate 2016年6月28日
 */
public interface WechatMenuDao {
	/**
	 * 根据 公众号id 获取公众号菜单信息
	 * @author smile
	 * @date 2016年6月28日
	 * @param accountId
	 * @param eventKey
	 * @return WechatMenu
	 */
	public WechatMenu queryMenuById(String accountId, String eventKey);

	/**
	 * 根据公众号id 获取公众号父菜单下子菜单列表
	 * @author smile
	 * @date 2016年6月28日
	 * @param accountid
	 * @param parent_id
	 * @return List<WechatMenu>
	 */
	public List<WechatMenu> queryMenuListByParentId(String accountid, String parent_id);

}