package com.cresen.locale.service.impl;

import com.cresen.locale.data.provider.LanguageDataProvider;
import com.cresen.locale.data.provider.LocaleTranslationDataProvider;
import com.cresen.locale.model.VO.LocaleTranslationVO;
import com.cresen.locale.model.entity.Language;
import com.cresen.locale.model.entity.LocaleTranslation;
import com.cresen.locale.service.LocaleTranslationService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @Author dolyt
 * @create 09-02-2021 09:57
 */
@Service
public class LocaleTranslationServiceImpl implements LocaleTranslationService {

    @Autowired
    LocaleTranslationDataProvider localeTranslationDataProvider;

    @Autowired
    LanguageDataProvider languageDataProvider;

    @Override
    public LocaleTranslationVO addNewLocaleTranslation(LocaleTranslationVO localeTranslationVO) {
        LocaleTranslation localeTranslation = LocaleTranslation.make(localeTranslationVO);
        localeTranslation = localeTranslationDataProvider.createNewLocale(localeTranslation);
        if (localeTranslation != null)
            localeTranslationVO = LocaleTranslationVO.make(localeTranslationDataProvider.createNewLocale(localeTranslation));
        return localeTranslationVO;
    }

    @Override
    public void addNewLocaleTranslations(List<LocaleTranslationVO> localeTranslationVOList) {

    }

    @Override
    public LocaleTranslationVO modifyLocalTranslation(LocaleTranslationVO localeTranslationVO) {
        LocaleTranslation dbLocaleTranslation = localeTranslationDataProvider.findById(localeTranslationVO.getId());
        dbLocaleTranslation.setDisplayLabel(localeTranslationVO.getDisplayLabel());
        dbLocaleTranslation.setUniqueCode(localeTranslationVO.getUniqueCode());
        dbLocaleTranslation = localeTranslationDataProvider.saveLocaleTranslation(dbLocaleTranslation);
        localeTranslationVO = LocaleTranslationVO.make(dbLocaleTranslation);
        return localeTranslationVO;

    }

    @Override
    public void modifyLocalTranslations(List<LocaleTranslationVO> localeTranslationVOList) {

    }

    @Override
    public JSONObject getAllLocaleTranslationByLanguageCode(String languageCode) {
        JSONObject jsonObject = new JSONObject();
        Language language = languageDataProvider.findByLanguageCode(languageCode);
        List<LocaleTranslation> localeTranslationList = localeTranslationDataProvider.findAllByLanguageId(language.getId().intValue());
        localeTranslationList.forEach(localeTranslation -> jsonObject.put(localeTranslation.getUniqueCode(),
                localeTranslation.getDisplayLabel())
        );
        return jsonObject;
    }

    @Override
    public List<LocaleTranslationVO> getAllLocaleTranslation() {
        return null;
    }

    @Override
    public void deleteAllLanguageTranslationByUniqueKey(String uniqueKey) {

    }

    @Override
    public void deleteLocaleTranslationById(Long id) {

    }

    @Override
    public void deleteLocaleTranslationByIds(Set<Long> ids) {

    }
}
