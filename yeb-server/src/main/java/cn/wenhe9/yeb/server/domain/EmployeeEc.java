package cn.wenhe9.yeb.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_employee_ec
 */
@TableName(value ="t_employee_ec")
@Data
public class EmployeeEc implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 员工编号
     */
    private Integer eid;

    /**
     * 奖罚日期
     */
    private Date ecdate;

    /**
     * 奖罚原因
     */
    private String ecreason;

    /**
     * 奖罚分
     */
    private Integer ecpoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    private Integer ectype;

    /**
     * 备注
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EmployeeEc other = (EmployeeEc) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getEcdate() == null ? other.getEcdate() == null : this.getEcdate().equals(other.getEcdate()))
            && (this.getEcreason() == null ? other.getEcreason() == null : this.getEcreason().equals(other.getEcreason()))
            && (this.getEcpoint() == null ? other.getEcpoint() == null : this.getEcpoint().equals(other.getEcpoint()))
            && (this.getEctype() == null ? other.getEctype() == null : this.getEctype().equals(other.getEctype()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getEcdate() == null) ? 0 : getEcdate().hashCode());
        result = prime * result + ((getEcreason() == null) ? 0 : getEcreason().hashCode());
        result = prime * result + ((getEcpoint() == null) ? 0 : getEcpoint().hashCode());
        result = prime * result + ((getEctype() == null) ? 0 : getEctype().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", eid=").append(eid);
        sb.append(", ecdate=").append(ecdate);
        sb.append(", ecreason=").append(ecreason);
        sb.append(", ecpoint=").append(ecpoint);
        sb.append(", ectype=").append(ectype);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}