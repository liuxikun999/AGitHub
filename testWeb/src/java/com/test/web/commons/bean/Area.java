package com.test.web.commons.bean;

import java.io.Serializable;

public class Area implements Serializable{

	private static final long serialVersionUID = 2728012375419497060L;

	private String code;

    private String name;

    private Long type;

    private Long orderLevel;

    private Integer status;

    private Integer showStatus;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getOrderLevel() {
        return orderLevel;
    }

    public void setOrderLevel(Long orderLevel) {
        this.orderLevel = orderLevel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }
}