package com.sample.isthesiteup.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.sample.isthesiteup.dtos.CheckUrlResponseDto;
import com.sample.isthesiteup.models.SiteStatus;

public class CheckUrlService {
    private CheckUrlResponseDto response = new CheckUrlResponseDto();

    public CheckUrlResponseDto checkUrlStatus(String url) {
        try {
            
            URL urlObject = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlObject.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCodeCategory = conn.getResponseCode() / 100;
            if (responseCodeCategory != 2 & responseCodeCategory != 3) {
                response.setSiteStatus(SiteStatus.SITE_IS_DOWN);
                response.setSiteStatusCode(conn.getResponseCode());
                response.setSiteStatusCodeCategory(responseCodeCategory);
                return response;
            } else {
                response.setSiteStatus(SiteStatus.SITE_IS_UP);
                response.setSiteStatusCode(conn.getResponseCode());
                response.setSiteStatusCodeCategory(responseCodeCategory);
                return response;
            }
        } catch (MalformedURLException e) {
            response.setSiteStatus(SiteStatus.INCORRECT_URL);
            response.setSiteStatusCode(0);
            response.setSiteStatusCodeCategory(0);
            return response;
        } catch (IOException e) {
            response.setSiteStatus(SiteStatus.SITE_IS_DOWN);
            response.setSiteStatusCode(0);
            response.setSiteStatusCodeCategory(0);
            return response;
        }

    }
}
