package com.zdpzsp.system.web;

import com.opensymphony.xwork2.ActionSupport;
import com.zdpzsp.frame.ResultCode;
import com.zdpzsp.frame.utils.WebUtils;
import com.zdpzsp.system.exception.ServiceException;
import com.zdpzsp.system.service.IUserService;
import com.zdpzsp.system.vo.RegisterUserVo;
import com.zdpzsp.system.vo.UserInfoVo;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

public class UserAction extends ActionSupport implements ServletRequestAware{

	private InputStream inputStream;
	
	private IUserService userService;

	private HttpServletRequest request;
	private String pwd;
	private String userName;
	private String verifyCode;
    private String validateCode;
    private String email;
    private RegisterUserVo registerUserVo;
	private String callback;
	private UserInfoVo userInfoVo;

	public UserInfoVo getUserInfoVo() {
		return userInfoVo;
	}

	public void setUserInfoVo(UserInfoVo userInfoVo) {
		this.userInfoVo = userInfoVo;
	}

	public String sendValicateCode() {
        try {
            userService.sendValidateCode(getValidateCode(), getEmail(),request.getSession());
            inputStream = WebUtils.succee(callback,"发送成功");
        } catch (ServiceException e) {
            inputStream = WebUtils.error(callback,e);
            e.printStackTrace();
        } catch (Exception e) {
            inputStream = WebUtils.error(callback,ResultCode.sys_err);
			e.printStackTrace();
		}
        return "data";

    }

	public String login() {
		try {
			userService.login(getUserName(), getPwd(), request.getSession());
			inputStream = WebUtils.succee(callback,"登陆成功");
		} catch (ServiceException e) {
			inputStream = WebUtils.error(callback,e);
			e.printStackTrace();
		} catch (Exception e) {
			inputStream = WebUtils.error(callback,ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}
	public String register() {
		try {
			userService.register(registerUserVo);
			System.out.println(registerUserVo.toString());
			inputStream = WebUtils.succee(callback,"注册成功");
		} catch (ServiceException e) {
			inputStream = WebUtils.error(callback,e);
			e.printStackTrace();
		} catch (Exception e) {
			inputStream = WebUtils.error(callback,ResultCode.sys_err);
			e.printStackTrace();
		}
		return "data";
	}

	public String updateUserInfo() {
		try {
			userService.updateUser(userInfoVo,request);
			System.out.println(userInfoVo.toString());
			inputStream = WebUtils.succee(callback,"修改成功");
		} catch (ServiceException e) {
			inputStream = WebUtils.error(callback,e);
			e.printStackTrace();
		} catch (Exception e) {
			inputStream = WebUtils.error(callback,ResultCode.sys_err);
			e.printStackTrace();
		}

		return "data";
	}
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

	public IUserService getUserService() {
		return userService;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegisterUserVo getRegisterUserVo() {
        return registerUserVo;
    }

    public void setRegisterUserVo(RegisterUserVo registerUserVo) {
        this.registerUserVo = registerUserVo;
    }

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}
}
