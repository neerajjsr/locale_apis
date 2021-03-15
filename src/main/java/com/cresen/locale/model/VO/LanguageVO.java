package com.cresen.locale.model.VO;

import com.cresen.locale.model.entity.Language;
import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author dolyt
 * @create 08-02-2021 11:07
 */

@Data
public class LanguageVO {


    private Long id;


    private String languageCode;


    private String displayLabel;


    private Boolean enabled;


    private Timestamp createdDate;


    private Timestamp modifiedDate;
    private String lastModifiedBy;
    private String loggedInUser;


    public static LanguageVO make(Language language) {
        ModelMapper modelMapper = new ModelMapper();
        LanguageVO languageVO = modelMapper.map(language, LanguageVO.class);
        languageVO.setLastModifiedBy(StringUtils.isEmpty(language.getModifiedBy()) ? language.getCreatedBy() : language.getModifiedBy());
        return languageVO;
    }
}
