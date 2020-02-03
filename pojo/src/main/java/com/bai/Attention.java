package com.bai;

import java.util.Date;

public class Attention {
    private Integer id;

    private Integer concernedId;

    private Integer upId;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConcernedId() {
        return concernedId;
    }

    public void setConcernedId(Integer concernedId) {
        this.concernedId = concernedId;
    }

    public Integer getUpId() {
        return upId;
    }

    public void setUpId(Integer upId) {
        this.upId = upId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}