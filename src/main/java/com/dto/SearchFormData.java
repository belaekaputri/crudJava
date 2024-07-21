package com.dto;

public class SearchFormData {
    private String keyword1;
    private String keyword2;
    

    public SearchFormData() {
    }

    public SearchFormData(String keyword1, String keyword2) {
        this.keyword1 = keyword1;
        this.keyword2 = keyword2;
    }


    public String getKeyword1() {
        return this.keyword1;
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public String getKeyword2() {
        return this.keyword2;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }
}
