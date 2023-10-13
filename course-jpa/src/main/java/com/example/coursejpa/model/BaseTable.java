package com.example.coursejpa.model;

import java.util.Date;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import com.example.coursejpa.common.JsonDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@MappedSuperclass
public abstract class BaseTable {
	@Column(name = "CREATED_BY", length = 20)
	private String createdBy;

	@CreatedDate
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "CREATED_TIMESTAMP")
	private Date createdDate;

	@Column(name = "LASTUPDATE_BY", length = 20)
	private String lastUpdateBy;

	@LastModifiedDate
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "LASTUPDATE_TIMESTAMP")
	private Date lastUpdateDate;

}
