package com.cresen.locale.model.entity;

import com.cresen.locale.model.VO.LocaleTranslationVO;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @Author dolyt
 * @create 08-02-2021 11:07
 */

@Entity
@Table(name = "language_details")
@Data
public class LocaleTranslation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "unique_code")
    private String uniqueCode;

    @Column(name = "language_display")
    private String displayLabel;

    @Column(name = "create_date")
    @CreatedDate
    private Timestamp createdDate;

    @Column(name = "update_date")
    @LastModifiedDate
    private Timestamp modifiedDate;

    public static LocaleTranslation make(LocaleTranslationVO localeTranslationVO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(localeTranslationVO, LocaleTranslation.class);
    }
}
