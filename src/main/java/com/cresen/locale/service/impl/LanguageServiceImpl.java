package com.cresen.locale.service.impl;

import com.cresen.locale.data.provider.LanguageDataProvider;
import com.cresen.locale.model.VO.LanguageVO;
import com.cresen.locale.model.entity.Language;
import com.cresen.locale.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dolyt
 * @create 09-02-2021 10:16
 */
@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    LanguageDataProvider languageDataProvider;

    @Override
    public List<LanguageVO> findAllLanguage() {
        List<Language> languageList = languageDataProvider.findAll();
        List<LanguageVO> languageVOList = new ArrayList<>();
        languageList.forEach(language -> {
            languageVOList.add(LanguageVO.make(language));
        });
        return languageVOList;
    }

    @Override
    public List<LanguageVO> findAllLanguageByEnabled(Boolean enabled) {
        List<Language> languageList = languageDataProvider.findAllByEnabled(enabled);
        List<LanguageVO> languageVOList = new ArrayList<>();
        languageList.forEach(language -> {
            languageVOList.add(LanguageVO.make(language));
        });
        return languageVOList;
    }

    @Override
    public List<LanguageVO> findAllLanguage(Boolean isActive) {
        if (ObjectUtils.isEmpty(isActive)) {
            return findAllLanguage();
        } else return findAllLanguageByEnabled(isActive);

    }
}
