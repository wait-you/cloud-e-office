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
 * @TableName t_employee
 */
@TableName(value ="t_employee")
@Data
public class Employee implements Serializable {
    /**
     * 员工编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 婚姻状况
     */
    private Object wedlock;

    /**
     * 民族
     */
    private Integer nationid;

    /**
     * 籍贯
     */
    private String nativeplace;

    /**
     * 政治面貌
     */
    private Integer politicid;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 所属部门
     */
    private Integer departmentid;

    /**
     * 职称ID
     */
    private Integer joblevelid;

    /**
     * 职位ID
     */
    private Integer posid;

    /**
     * 聘用形式
     */
    private String engageform;

    /**
     * 最高学历
     */
    private Object tiptopdegree;

    /**
     * 所属专业
     */
    private String specialty;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 入职日期
     */
    private Date begindate;

    /**
     * 在职状态
     */
    private Object workstate;

    /**
     * 工号
     */
    private String workid;

    /**
     * 合同期限
     */
    private Double contractterm;

    /**
     * 转正日期
     */
    private Date conversiontime;

    /**
     * 离职日期
     */
    private Date notworkdate;

    /**
     * 合同起始日期
     */
    private Date begincontract;

    /**
     * 合同终止日期
     */
    private Date endcontract;

    /**
     * 工龄
     */
    private Integer workage;

    /**
     * 工资账套ID
     */
    private Integer salaryid;

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
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getWedlock() == null ? other.getWedlock() == null : this.getWedlock().equals(other.getWedlock()))
            && (this.getNationid() == null ? other.getNationid() == null : this.getNationid().equals(other.getNationid()))
            && (this.getNativeplace() == null ? other.getNativeplace() == null : this.getNativeplace().equals(other.getNativeplace()))
            && (this.getPoliticid() == null ? other.getPoliticid() == null : this.getPoliticid().equals(other.getPoliticid()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
            && (this.getJoblevelid() == null ? other.getJoblevelid() == null : this.getJoblevelid().equals(other.getJoblevelid()))
            && (this.getPosid() == null ? other.getPosid() == null : this.getPosid().equals(other.getPosid()))
            && (this.getEngageform() == null ? other.getEngageform() == null : this.getEngageform().equals(other.getEngageform()))
            && (this.getTiptopdegree() == null ? other.getTiptopdegree() == null : this.getTiptopdegree().equals(other.getTiptopdegree()))
            && (this.getSpecialty() == null ? other.getSpecialty() == null : this.getSpecialty().equals(other.getSpecialty()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getBegindate() == null ? other.getBegindate() == null : this.getBegindate().equals(other.getBegindate()))
            && (this.getWorkstate() == null ? other.getWorkstate() == null : this.getWorkstate().equals(other.getWorkstate()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getContractterm() == null ? other.getContractterm() == null : this.getContractterm().equals(other.getContractterm()))
            && (this.getConversiontime() == null ? other.getConversiontime() == null : this.getConversiontime().equals(other.getConversiontime()))
            && (this.getNotworkdate() == null ? other.getNotworkdate() == null : this.getNotworkdate().equals(other.getNotworkdate()))
            && (this.getBegincontract() == null ? other.getBegincontract() == null : this.getBegincontract().equals(other.getBegincontract()))
            && (this.getEndcontract() == null ? other.getEndcontract() == null : this.getEndcontract().equals(other.getEndcontract()))
            && (this.getWorkage() == null ? other.getWorkage() == null : this.getWorkage().equals(other.getWorkage()))
            && (this.getSalaryid() == null ? other.getSalaryid() == null : this.getSalaryid().equals(other.getSalaryid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getWedlock() == null) ? 0 : getWedlock().hashCode());
        result = prime * result + ((getNationid() == null) ? 0 : getNationid().hashCode());
        result = prime * result + ((getNativeplace() == null) ? 0 : getNativeplace().hashCode());
        result = prime * result + ((getPoliticid() == null) ? 0 : getPoliticid().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getJoblevelid() == null) ? 0 : getJoblevelid().hashCode());
        result = prime * result + ((getPosid() == null) ? 0 : getPosid().hashCode());
        result = prime * result + ((getEngageform() == null) ? 0 : getEngageform().hashCode());
        result = prime * result + ((getTiptopdegree() == null) ? 0 : getTiptopdegree().hashCode());
        result = prime * result + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getBegindate() == null) ? 0 : getBegindate().hashCode());
        result = prime * result + ((getWorkstate() == null) ? 0 : getWorkstate().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getContractterm() == null) ? 0 : getContractterm().hashCode());
        result = prime * result + ((getConversiontime() == null) ? 0 : getConversiontime().hashCode());
        result = prime * result + ((getNotworkdate() == null) ? 0 : getNotworkdate().hashCode());
        result = prime * result + ((getBegincontract() == null) ? 0 : getBegincontract().hashCode());
        result = prime * result + ((getEndcontract() == null) ? 0 : getEndcontract().hashCode());
        result = prime * result + ((getWorkage() == null) ? 0 : getWorkage().hashCode());
        result = prime * result + ((getSalaryid() == null) ? 0 : getSalaryid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", idcard=").append(idcard);
        sb.append(", wedlock=").append(wedlock);
        sb.append(", nationid=").append(nationid);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", politicid=").append(politicid);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", joblevelid=").append(joblevelid);
        sb.append(", posid=").append(posid);
        sb.append(", engageform=").append(engageform);
        sb.append(", tiptopdegree=").append(tiptopdegree);
        sb.append(", specialty=").append(specialty);
        sb.append(", school=").append(school);
        sb.append(", begindate=").append(begindate);
        sb.append(", workstate=").append(workstate);
        sb.append(", workid=").append(workid);
        sb.append(", contractterm=").append(contractterm);
        sb.append(", conversiontime=").append(conversiontime);
        sb.append(", notworkdate=").append(notworkdate);
        sb.append(", begincontract=").append(begincontract);
        sb.append(", endcontract=").append(endcontract);
        sb.append(", workage=").append(workage);
        sb.append(", salaryid=").append(salaryid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}