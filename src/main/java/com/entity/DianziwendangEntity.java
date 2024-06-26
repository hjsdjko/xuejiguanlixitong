package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 电子文档
 *
 * @author 
 * @email
 */
@TableName("dianziwendang")
public class DianziwendangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DianziwendangEntity() {

	}

	public DianziwendangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 文档标题
     */
    @TableField(value = "dianziwendang_name")

    private String dianziwendangName;


    /**
     * 文档类型
     */
    @TableField(value = "dianziwendang_types")

    private Integer dianziwendangTypes;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 文档下载
     */
    @TableField(value = "dianziwendang_file")

    private String dianziwendangFile;


    /**
     * 文档详情
     */
    @TableField(value = "dianziwendang_content")

    private String dianziwendangContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：文档标题
	 */
    public String getDianziwendangName() {
        return dianziwendangName;
    }
    /**
	 * 获取：文档标题
	 */

    public void setDianziwendangName(String dianziwendangName) {
        this.dianziwendangName = dianziwendangName;
    }
    /**
	 * 设置：文档类型
	 */
    public Integer getDianziwendangTypes() {
        return dianziwendangTypes;
    }
    /**
	 * 获取：文档类型
	 */

    public void setDianziwendangTypes(Integer dianziwendangTypes) {
        this.dianziwendangTypes = dianziwendangTypes;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：文档下载
	 */
    public String getDianziwendangFile() {
        return dianziwendangFile;
    }
    /**
	 * 获取：文档下载
	 */

    public void setDianziwendangFile(String dianziwendangFile) {
        this.dianziwendangFile = dianziwendangFile;
    }
    /**
	 * 设置：文档详情
	 */
    public String getDianziwendangContent() {
        return dianziwendangContent;
    }
    /**
	 * 获取：文档详情
	 */

    public void setDianziwendangContent(String dianziwendangContent) {
        this.dianziwendangContent = dianziwendangContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Dianziwendang{" +
            "id=" + id +
            ", dianziwendangName=" + dianziwendangName +
            ", dianziwendangTypes=" + dianziwendangTypes +
            ", yonghuId=" + yonghuId +
            ", dianziwendangFile=" + dianziwendangFile +
            ", dianziwendangContent=" + dianziwendangContent +
            ", createTime=" + createTime +
        "}";
    }
}
