package com.cresen.locale.model.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @Author dolyt
 * @create 08-02-2021 11:07
 */

@Entity
@Table(name = "m_language")
@Data
public class Language {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "language_code")
    private String languageCode;

    @Column(name = "language_display")
    private String displayLabel;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "create_date")
    @CreatedDate
    private Timestamp createdDate;

    @Column(name = "update_date")
    @LastModifiedDate
    private Timestamp modifiedDate;


    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;

    @Column(name = "updated_by")
    @LastModifiedBy
    private String modifiedBy;
}
