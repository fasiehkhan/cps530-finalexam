package com.cps530_api.cps530;

public class PageData {
    private Long id;
    private String pageData;
    private int pageId;

    public PageData() { }

    public PageData(Long id, String pageData, int pageId) {
        this.id = id;
        this.pageData = pageData;
        this.pageId = pageId;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getPageData(){
        return pageData;
    }

    public void setPageData(String pageData){
        this.pageData = pageData;
    }

    public int getPageId(){
        return pageId;
    }

    public void setPageId(int pageId){
        this.pageId = pageId;
    }
}
