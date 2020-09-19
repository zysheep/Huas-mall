package cn.huas.mall.domain;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Sort implements Serializable {
    private String sorld;

    private String sorname;

    private static final long serialVersionUID = 1L;

    public String getSorld() {
        return sorld;
    }

    public void setSorld(String sorld) {
        this.sorld = sorld;
    }

    public String getSorname() {
        return sorname;
    }

    public void setSorname(String sorname) {
        this.sorname = sorname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sorld=").append(sorld);
        sb.append(", sorname=").append(sorname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}