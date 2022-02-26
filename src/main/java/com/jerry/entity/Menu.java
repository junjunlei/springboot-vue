package com.jerry.entity;

import java.util.Date;

/**
 *
 *
 * @author jerry 2022-02-26 15:36:40
 */
public class Menu {


    //
    // 业务方法(按public protected private顺序排列)
    // ------------------------------------------------------------------------------

    //
    // 数据库字段
    // ------------------------------------------------------------------------------

    private Long id;
    private Long parentId;
    private String name;
    private String path;
    private String perms;
    private String component;
    private Long type;
    private String icon;
    private Long orderNum;
    private Date created;
    private Date updated;
    private Long statu;

    //
    // 非数据库字段
    // ------------------------------------------------------------------------------

    //
    // getter/setter
    // ------------------------------------------------------------------------------


    /**
     * @return
     */
    public Long getId() {
            return id;
    }

    public void setId(Long id) {
            this.id = id;
    }
    /**
     * @return 父菜单ID，一级菜单为0
     */
    public Long getParentId() {
            return parentId;
    }

    public void setParentId(Long parentId) {
            this.parentId = parentId;
    }
    /**
     * @return
     */
    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }
    /**
     * @return 菜单URL
     */
    public String getPath() {
            return path;
    }

    public void setPath(String path) {
            this.path = path;
    }
    /**
     * @return 授权(多个用逗号分隔，如：user:list,user:create)
     */
    public String getPerms() {
            return perms;
    }

    public void setPerms(String perms) {
            this.perms = perms;
    }
    /**
     * @return
     */
    public String getComponent() {
            return component;
    }

    public void setComponent(String component) {
            this.component = component;
    }
    /**
     * @return 类型     0：目录   1：菜单   2：按钮
     */
    public Long getType() {
            return type;
    }

    public void setType(Long type) {
            this.type = type;
    }
    /**
     * @return 菜单图标
     */
    public String getIcon() {
            return icon;
    }

    public void setIcon(String icon) {
            this.icon = icon;
    }
    /**
     * @return 排序
     */
    public Long getOrderNum() {
            return orderNum;
    }

    public void setOrdernum(Long ordernum) {
            this.orderNum = ordernum;
    }
    /**
     * @return
     */
    public Date getCreated() {
            return created;
    }

    public void setCreated(Date created) {
            this.created = created;
    }
    /**
     * @return
     */
    public Date getUpdated() {
            return updated;
    }

    public void setUpdated(Date updated) {
            this.updated = updated;
    }
    /**
     * @return
     */
    public Long getStatu() {
            return statu;
    }

    public void setStatu(Long statu) {
            this.statu = statu;
    }
}
