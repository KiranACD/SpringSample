package com.sample.isthesiteup.dtos;

public class CheckUrlRequestDto {

    private String url;

    public CheckUrlRequestDto(String url) {
        this.url = url;
    }

    public CheckUrlRequestDto() {}
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
