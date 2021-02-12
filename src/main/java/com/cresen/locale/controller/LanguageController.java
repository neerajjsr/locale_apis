package com.cresen.locale.controller;

import com.cresen.locale.model.VO.LanguageVO;
import com.cresen.locale.rest.CommonUtil;
import com.cresen.locale.rest.RestResponse;
import com.cresen.locale.service.LanguageService;
import com.cresen.locale.service.LocaleTranslationService;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author dolyt
 * @create 10-02-2021 19:28
 */

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class LanguageController {
    /**
     * The Constant LOGGER.
     */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    LanguageService languageService;

    @RequestMapping(value = {"/language/{isActive}"}, method = RequestMethod.GET)
    public RestResponse getTranslationLanguage(@PathVariable(value = "isActive",required = false) Boolean isActive) throws Exception {
        LOGGER.debug("================================ getTranslationLanguage Begin ================================");
        RestResponse restResponse = CommonUtil.initRestResponse(null);
        List<LanguageVO> languageVOList= languageService.findAllLanguage(isActive);
        restResponse.setResponseData(languageVOList);
        restResponse.getMetadata().setSuccessOutcome();
        LOGGER.debug("================================ getTranslationLanguage End ================================");
        return restResponse;
    }

}
