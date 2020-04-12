package com.buba.gmall8080.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author MrJia
 * @since 2020-04-12
 */
public class GUser implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户账户
     */
    @TableField("userName")
    private String userName;

    /**
     * 账户
     */
    @TableField("userAccount")
    private String userAccount;

    /**
     * 用户密码
     */
    @TableField("userPasswd")
    private String userPasswd;

    /**
     * 用户添加时间
     */
    @TableField("userAddTime ")
    private String userAddTime ;

    /**
     * 用户修改时间
     */
    @TableField("userUptaTime ")
    private String userUptaTime ;

    /**
     * 角色id
     */
    @TableField("userRoleid")
    private String userRoleid;

    /**
     * 状态(0:开启/1:禁用)
     */
    @TableField("userLock")
    private Integer userLock;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getUserAddTime () {
        return userAddTime ;
    }

    public void setUserAddTime (String userAddTime ) {
        this.userAddTime  = userAddTime ;
    }

    public String getUserUptaTime () {
        return userUptaTime ;
    }

    public void setUserUptaTime (String userUptaTime ) {
        this.userUptaTime  = userUptaTime ;
    }

    public String getUserRoleid() {
        return userRoleid;
    }

    public void setUserRoleid(String userRoleid) {
        this.userRoleid = userRoleid;
    }

    public Integer getUserLock() {
        return userLock;
    }

    public void setUserLock(Integer userLock) {
        this.userLock = userLock;
    }

    @Override
    public String toString() {
        return "GUser{" +
        "id=" + id +
        ", userName=" + userName +
        ", userAccount=" + userAccount +
        ", userPasswd=" + userPasswd +
        ", userAddTime =" + userAddTime  +
        ", userUptaTime =" + userUptaTime  +
        ", userRoleid=" + userRoleid +
        ", userLock=" + userLock +
        "}";
    }
}
