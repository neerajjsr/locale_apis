package com.cresen.locale.model.VO;

import com.cresen.locale.model.entity.LocaleTranslation;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;

/**
 * @Author dolyt
 * @create 08-02-2021 11:07
 */

@Data
public class LocaleTranslationVO {


    private Long id;

    private Integer languageId;


    private String uniqueCode;


    private String displayLabel;


    private Timestamp createdDate;


    private Timestamp modifiedDate;

    public static LocaleTranslationVO make(LocaleTranslation localeTranslation) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(localeTranslation, LocaleTranslationVO.class);
    }
}
