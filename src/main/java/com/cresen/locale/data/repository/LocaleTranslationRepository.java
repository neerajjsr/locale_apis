package com.cresen.locale.data.repository;

import com.cresen.locale.model.entity.LocaleTranslation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author dolyt
 * @create 09-02-2021 10:08
 */
public interface LocaleTranslationRepository extends JpaRepository<LocaleTranslation, Long> {

    List<LocaleTranslation> findByLanguageId(Integer languageId);

    List<LocaleTranslation> findByUniqueCode(String uniqueCode);
}
