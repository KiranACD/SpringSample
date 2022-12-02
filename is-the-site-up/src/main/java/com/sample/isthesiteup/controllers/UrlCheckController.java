package com.sample.isthesiteup.controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.isthesiteup.dtos.CheckUrlRequestDto;
import com.sample.isthesiteup.dtos.CheckUrlResponseDto;
import com.sample.isthesiteup.dtos.ResponseDto;
//import com.sample.isthesiteup.models.SiteStatus;
import com.sample.isthesiteup.services.CheckUrlService;

@RestController
public class UrlCheckController {

    private CheckUrlService checkUrlService = new CheckUrlService();
    
    @GetMapping("/check")
    public ResponseDto<CheckUrlResponseDto> getUrlStatusMessage(CheckUrlRequestDto request) {
        
        String url = request.getUrl();
        CheckUrlResponseDto response = checkUrlService.checkUrlStatus(url);
        // CheckUrlResponseDto response = new CheckUrlResponseDto();
        // response.setSiteStatus(siteStatus);
        
        ResponseDto<CheckUrlResponseDto> baseResponse = new ResponseDto<>();
        baseResponse.setStatus("Success");
        baseResponse.setData(response);

        return baseResponse;
    }
}
