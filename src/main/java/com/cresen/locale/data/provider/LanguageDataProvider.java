package com.cresen.locale.data.provider;

import com.cresen.locale.data.repository.LanguageRepository;
import com.cresen.locale.model.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author dolyt
 * @create 09-02-2021 10:08
 */
@Service
public class LanguageDataProvider {

    @Autowired
    LanguageRepository languageRepository;


    public List<Language> findAll() {
        return languageRepository.findAll();
    }

    public List<Language> findAllActiveLanguage() {
        return languageRepository.findByEnabled(true);
    }

    public Language findByLanguageCode(String languageCode) {
        return languageRepository.findByLanguageCode(languageCode).orElse(null);
    }

}
