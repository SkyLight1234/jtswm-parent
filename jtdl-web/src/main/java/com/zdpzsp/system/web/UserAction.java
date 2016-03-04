package com.zdpzsp.system.web;

import com.opensymphony.xwork2.ActionSupport;
import com.zdpzsp.system.service.IUserService;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

public class UserAction extends ActionSupport implements ServletRequestAware{

	private InputStream inputStream;
	
	private IUserService userService;

	private String roleIds;

	private String stationIds;

	private Long userId;
	
	private HttpServletRequest request;

	/*public String searchAllEnableUser()
	{
		try {
			inputStream=JsonUtils.objToInputStream(userService.getEnableUserTable());
		} catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}*/
	/**
	 * 查询所有系统角色
	 * @return inputStream来取值
	 */
	/*public String searchSysRoles()
	{
		try {
			inputStream=JsonUtils.objToInputStream(this.userService.getAllSysRolesFromCache());
		}
		catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}
	
	*//**
	 * 查询所有系统岗位
	 * @return inputStream来取值
	 *//*
	public String searchSysStations()
	{
		try {
			inputStream=JsonUtils.objToInputStream(this.userService.getAllSysStationsFromCache());
		} catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}
	
	*//**
	 * 修改用户角色  
	 * @return
	 *//*
	public String updateSysUserRole()
	{
		try {
			String[] userRoleIds=new String[0];
			if(!(this.roleIds==null||this.roleIds.equals("")))
			{
				userRoleIds = this.roleIds.split(",");
			}
			userService.updateSysRoles(userRoleIds, this.userId, this.request);
			inputStream=WebUtils.succeeMessage("修改用户角色成功");
		}
		catch (ServiceException e)
		{
			inputStream=WebUtils.error(e);
		}
		catch (NumberFormatException e)
		{
			inputStream=WebUtils.error(ResultCode.param_err);
			e.printStackTrace();
		}
		catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}
	
	*//**
	 * 修改用户岗位
	 * @return
	 *//*
	public String updateSysUserStation()
	{
		try {
			String  []stationId=new String[0];
			if(!(stationIds==null||stationIds.equals("")))
			   stationId=stationIds.split(",");
			userService.updateSysStation(stationId,userId,request);
			inputStream=WebUtils.succeeMessage("修改用户岗位成功");
		}
		catch (ServiceException e)
		{
			inputStream=WebUtils.error(e);
		}
		catch (NumberFormatException e)
		{
			inputStream=WebUtils.error(ResultCode.param_err);
		}
		catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}

	*//**
	 * 获取当前用户的岗位
	 * @return inputStream中保存
     *//*
	public String getUserStations()
	{
		try {
			inputStream= JsonUtils.objToInputStream(userService.getCurrentUserStations(request));
		} catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}

	*//**
	 * 获取当前用户的角色
	 * @return 保存在inputStream中
     *//*
	public String getUserRoles()
	{
		try {
			inputStream=JsonUtils.objToInputStream(userService.getCurrentUserRoles(request));
		} catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}

	*//**
	 * 获取当前用户组织
	 * @return 存放在inputStream中
     *//*
	public String getUserOrgs()
	{
		try {
			inputStream=JsonUtils.objToInputStream(userService.getCurrentOrgs(request));
		} catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}


	*//**
	 * 获取当前用户的菜单
	 * @return 存储在inputStream中
     *//*
	public String getUserMenus()
	{
		try {
			inputStream=JsonUtils.objToInputStream(userService.getCurrentUserMenus(request));
		} catch (Exception e) {
			inputStream=WebUtils.error(ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}*/

	@Override
	public void setServletRequest(HttpServletRequest request) {

		this.request=request;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getStationIds() {
		return stationIds;
	}

	public void setStationIds(String stationIds) {
		this.stationIds = stationIds;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
