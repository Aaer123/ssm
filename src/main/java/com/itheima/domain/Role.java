package com.itheima.domain;

import java.util.Date;

/*
* 角色表
* */
public class Role {

    private int roleid;

    private String rolename;

    private Date roleadress;

    private String namess;

    public Role() {
    }

    public Role(int roleid, String rolename, Date roleadress, String namess) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.roleadress = roleadress;
        this.namess = namess;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Date getRoleadress() {
        return roleadress;
    }

    public void setRoleadress(Date roleadress) {
        this.roleadress = roleadress;
    }

    public String getNamess() {
        return namess;
    }

    public void setNamess(String namess) {
        this.namess = namess;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                ", roleadress=" + roleadress +
                ", namessp='" + namess + '\'' +
                '}';
    }
}
