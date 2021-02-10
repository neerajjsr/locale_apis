package com.cresen.locale.service;

import com.cresen.locale.model.VO.LanguageVO;

import java.util.List;

/**
 * @Author dolyt
 * @create 09-02-2021 10:16
 */
public interface LanguageService {

    List<LanguageVO> findAllLanguage();

    List<LanguageVO> findAllActiveLanguage();
}
