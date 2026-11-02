package com.jdc.balance.balanceapi.model.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public abstract class AbstractEntity {

    @CreatedBy
    private String createdBy;//ဘယ်သူဖန်တီးခဲ့လဲ
    @CreatedDate
    private LocalDateTime createdAt;//ဘယ်အချိန်မှာ ဖန်တီးခဲ့လဲ
    @LastModifiedBy
    private String modifiedBy;//နောက်ဆုံးပြင်ဆင်ခဲ့သူ
    @LastModifiedDate
    private LocalDateTime modifiedAt;//ပြင်ဆင်ခဲ့တဲ့အချိန်
}
