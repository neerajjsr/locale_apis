package com.cresen.locale.data.provider;

import com.cresen.locale.data.repository.LocaleTranslationRepository;
import com.cresen.locale.model.entity.LocaleTranslation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author dolyt
 * @create 09-02-2021 10:08
 */
@Service
public class LocaleTranslationDataProvider {
    @Autowired
    LocaleTranslationRepository localeTranslationRepository;


    public List<LocaleTranslation> findAll() {
        return localeTranslationRepository.findAll();
    }

    public List<LocaleTranslation> findAllByLanguageId(Integer languageId) {
        return localeTranslationRepository.findByLanguageId(languageId);
    }

    public List<LocaleTranslation> findAllByUniqueCde(String uniqueCode) {
        return localeTranslationRepository.findByUniqueCode(uniqueCode);
    }

    public LocaleTranslation createNewLocale(LocaleTranslation localeTranslation) {
        return localeTranslationRepository.save(localeTranslation);
    }

    public LocaleTranslation findById(Long id) {
        return localeTranslationRepository.findById(id).orElse(null);
    }

    public LocaleTranslation saveLocaleTranslation(LocaleTranslation localeTranslation) {
        return localeTranslationRepository.save(localeTranslation);
    }


}
