package cn.huas.mall.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class OrderDetails implements Serializable {
    private String detailsid;

    private String orderid;

    private String prold;

    private String proid;

    private Double price;

    private Integer count;

    private static final long serialVersionUID = 1L;

    public String getDetailsid() {
        return detailsid;
    }

    public void setDetailsid(String detailsid) {
        this.detailsid = detailsid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getProld() {
        return prold;
    }

    public void setProld(String prold) {
        this.prold = prold;
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        sb.append(", detailsid=").append(detailsid);
        sb.append(", orderid=").append(orderid);
        sb.append(", prold=").append(prold);
        sb.append(", proid=").append(proid);
        sb.append(", price=").append(price);
        sb.append(", count=").append(count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}