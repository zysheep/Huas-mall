package cn.huas.mall.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ShoppingCart implements Serializable {
    @ApiModelProperty(value = "id")
    private String id;

    private String userid;

    private String prold;

    private Integer count;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getProld() {
        return prold;
    }

    public void setProld(String prold) {
        this.prold = prold;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", prold=").append(prold);
        sb.append(", count=").append(count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}