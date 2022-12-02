package com.sample.isthesiteup.dtos;

import com.sample.isthesiteup.models.SiteStatus;

public class CheckUrlResponseDto {
    private SiteStatus siteStatus;
    private int siteStatusCode;
    private int siteStatusCodeCategory;

    public SiteStatus getSiteStatus(){
        return siteStatus;
    }

    public void setSiteStatus(SiteStatus siteStatus) {
        this.siteStatus = siteStatus;
    }

    public int getSiteStatusCode(){
        return siteStatusCode;
    }

    public void setSiteStatusCode(int siteStatusCode) {
        this.siteStatusCode = siteStatusCode;
    }

    public int getSiteStatusCodeCategory(){
        return siteStatusCodeCategory;
    }

    public void setSiteStatusCodeCategory(int siteStatusCodeCategory) {
        this.siteStatusCodeCategory = siteStatusCodeCategory;
    }
}
