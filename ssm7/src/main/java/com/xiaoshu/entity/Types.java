package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "goodstype")
public class Types implements Serializable {
    @Id
    private Integer typeid;

    private String typename;

    private String status;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * @return typeid
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * @return typename
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename
     */
    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeid=").append(typeid);
        sb.append(", typename=").append(typename);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}