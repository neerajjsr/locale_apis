package com.cresen.locale.data.repository;

import com.cresen.locale.model.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @Author dolyt
 * @create 09-02-2021 10:09
 */
public interface LanguageRepository extends JpaRepository<Language, Long> {

    List<Language> findByEnabled(boolean enabled);

    Optional<Language> findByLanguageCodeIgnoreCase(String languageCode);
}
