package cn.huas.mall.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private String prold;

    private String sorld;

    private String proname;

    private String salecount;

    @ApiModelProperty(value = "ͼƬ·")
    private String image;

    private Double price;

    private Double saleprice;

    private String decript;

    private Date saledate;

    private static final long serialVersionUID = 1L;

    public String getProld() {
        return prold;
    }

    public void setProld(String prold) {
        this.prold = prold;
    }

    public String getSorld() {
        return sorld;
    }

    public void setSorld(String sorld) {
        this.sorld = sorld;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getSalecount() {
        return salecount;
    }

    public void setSalecount(String salecount) {
        this.salecount = salecount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Double saleprice) {
        this.saleprice = saleprice;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prold=").append(prold);
        sb.append(", sorld=").append(sorld);
        sb.append(", proname=").append(proname);
        sb.append(", salecount=").append(salecount);
        sb.append(", image=").append(image);
        sb.append(", price=").append(price);
        sb.append(", saleprice=").append(saleprice);
        sb.append(", decript=").append(decript);
        sb.append(", saledate=").append(saledate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}