package com.cresen.locale.controller;

import com.cresen.locale.model.VO.LocaleTranslationVO;
import com.cresen.locale.rest.CommonUtil;
import com.cresen.locale.rest.RestResponse;
import com.cresen.locale.service.LocaleTranslationService;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author dolyt
 * @create 18-01-2021 15:10
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class LocaleTranslationController {

    /**
     * The Constant LOGGER.
     */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    LocaleTranslationService localeTranslationService;

    @RequestMapping(value = "/locale/{langCode}", method = RequestMethod.GET)
    public RestResponse getTranslationByLanguageCode(@PathVariable(value = "langCode") String langCode) throws Exception {
        LOGGER.debug("================================ getTranslationByLanguageCode Begin ================================");
        RestResponse restResponse = CommonUtil.initRestResponse(null);
        JSONObject jsonObject = localeTranslationService.getAllLocaleTranslationByLanguageCode(langCode);
        restResponse.setResponseData(jsonObject);
        restResponse.getMetadata().setSuccessOutcome();
        LOGGER.debug("================================ getTranslationByLanguageCode End ================================");
        return restResponse;
    }

    @RequestMapping(value = "/local/create", method = RequestMethod.POST)
    public RestResponse saveLocaleTranslation(@RequestBody LocaleTranslationVO requestVO) throws Exception {
        LOGGER.debug("================================ saveLocaleTranslation Begin ================================");
        RestResponse restResponse = CommonUtil.initRestResponse(null);
        requestVO = localeTranslationService.addNewLocaleTranslation(requestVO);
        restResponse.setResponseData(requestVO);
        restResponse.getMetadata().setSuccessOutcome();
        LOGGER.debug("================================ saveLocaleTranslation End ================================");
        return restResponse;
    }

    @RequestMapping(value = "/local/update", method = RequestMethod.POST)
    public RestResponse updateLocaleTranslation(@RequestBody LocaleTranslationVO requestVO) throws Exception {
        LOGGER.debug("================================ updateLocaleTranslation Begin ================================");
        RestResponse restResponse = CommonUtil.initRestResponse(null);
        requestVO = localeTranslationService.modifyLocalTranslation(requestVO);
        restResponse.setResponseData(requestVO);
        restResponse.getMetadata().setSuccessOutcome();
        LOGGER.debug("================================ updateLocaleTranslation End ================================");
        return restResponse;
    }

}
