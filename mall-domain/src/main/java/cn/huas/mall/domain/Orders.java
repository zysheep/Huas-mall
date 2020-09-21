package cn.huas.mall.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private String orderid;

    private String orderno;

    private String userid;

    private String sendname;

    private String sendaddress;

    private String sendzip;

    private String sendtel;

    private String payment;

    private String meno;

    private Date time;

    private Integer tag;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname;
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress;
    }

    public String getSendzip() {
        return sendzip;
    }

    public void setSendzip(String sendzip) {
        this.sendzip = sendzip;
    }

    public String getSendtel() {
        return sendtel;
    }

    public void setSendtel(String sendtel) {
        this.sendtel = sendtel;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", orderno=").append(orderno);
        sb.append(", userid=").append(userid);
        sb.append(", sendname=").append(sendname);
        sb.append(", sendaddress=").append(sendaddress);
        sb.append(", sendzip=").append(sendzip);
        sb.append(", sendtel=").append(sendtel);
        sb.append(", payment=").append(payment);
        sb.append(", meno=").append(meno);
        sb.append(", time=").append(time);
        sb.append(", tag=").append(tag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}