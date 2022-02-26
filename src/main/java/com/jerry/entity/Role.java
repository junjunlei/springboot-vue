package com.jerry.entity;

import com.sun.istack.internal.NotNull;

import java.util.Date;

/**
 * @author jerry 2022-02-26 15:36:40
 */
public class Role {


    //
    // 业务方法(按public protected private顺序排列)
    // ------------------------------------------------------------------------------

    //
    // 数据库字段
    // ------------------------------------------------------------------------------


    private Long id;

    private String name;

    private String code;
    private String remark;
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
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
