package com.cresen.locale.service;

import com.cresen.locale.model.VO.LocaleTranslationVO;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Set;

/**
 * @Author dolyt
 * @create 09-02-2021 09:56
 */
public interface LocaleTranslationService {

    LocaleTranslationVO addNewLocaleTranslation(LocaleTranslationVO localeTranslationVO,String loggedInUser);

    void addNewLocaleTranslations(List<LocaleTranslationVO> localeTranslationVOList);

    LocaleTranslationVO modifyLocalTranslation(LocaleTranslationVO localeTranslationVO,String loggedInUser);

    void modifyLocalTranslations(List<LocaleTranslationVO> localeTranslationVOList);

    JSONObject getAllLocaleTranslationByLanguageCode(String languageCode);

    List<LocaleTranslationVO> getAllLocaleTranslation();

    void deleteAllLanguageTranslationByUniqueKey(String uniqueKey);

    void deleteLocaleTranslationById(Long id);

    void deleteLocaleTranslationByIds(Set<Long> ids);
    List<LocaleTranslationVO> getAllLocaleTranslationByUniqueCode(String uniqueKey);

}
