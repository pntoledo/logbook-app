package com.rgfp.psd.logbook.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "notes")
public class Note {

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String title;

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    private LocalDateTime timestamp;
    @Column(length=10000)
    private String content;
    private String Summary;
    public String getSummary() {
  if (this.content.length()> 240)  {
      Summary = this.content.substring(0,240);
  } else {
      Summary = this.content;
  }
        return Summary;
    }
}
