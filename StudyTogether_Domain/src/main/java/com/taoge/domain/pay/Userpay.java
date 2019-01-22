package com.taoge.domain.pay;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.taoge.domain.base.BaseEmtity;


/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-21
 */
@TableName("userpay")
public class Userpay extends BaseEmtity {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer uid;

    private Integer money;

    private Integer shell;

    private Integer type;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getShell() {
        return shell;
    }

    public void setShell(Integer shell) {
        this.shell = shell;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
