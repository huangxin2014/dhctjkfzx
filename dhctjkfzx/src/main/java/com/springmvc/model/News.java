package com.springmvc.model;

public class News {
    private Integer newsid;

    private String newstitle;

    private String newsinfo;

    private String updatetime;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewsinfo() {
        return newsinfo;
    }

    public void setNewsinfo(String newsinfo) {
        this.newsinfo = newsinfo == null ? null : newsinfo.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }
}