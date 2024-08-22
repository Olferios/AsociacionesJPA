package com.ejercicioclase.ejercicioclase.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Embeddable
public class Audit {
    @Column(name = "create_at")
    private LocalDateTime createAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;
    public LocalDateTime getCreateAt() {
        return createAt;
    }
    @PrePersist
    public void PrePersistAudit(){
        createAt=LocalDateTime.now();
    }

    @PreUpdate
    public void PreUpdateAudit(){
        updateAt=LocalDateTime.now();
    }
    
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
  
    

}
