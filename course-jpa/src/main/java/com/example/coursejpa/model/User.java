package com.example.coursejpa.model;

import java.io.Serializable;
import java.util.Date;
import com.example.coursejpa.common.JsonDateTimeSerializer;
import com.example.coursejpa.util.TableUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User aplikasi monitoring matel Dibedakan dengan table user matel
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MC_MST_USERS")
public class User extends BaseTable implements Serializable {
	@Id
	@Column(name = "USER_ID", length = 35)
	private String userId;

	// sering bikin confusing with userId
	// @Column(name = "USER_NAME")
	// private String userName;

	@Column(name = "COLL_NAME", length = TableUtil.LENGTH_PERSON_NAME)
	private String fullName;

	@Column(name = "USER_PWD", length = TableUtil.LENGTH_PASSWORD)
	private String userPwd;

	@Column(name = "ALAMAT", length = TableUtil.LENGTH_ADDR)
	private String alamat;

	@Column(name = "COLL_NIK", length = TableUtil.LENGTH_NIK)
	private String nik;

	// @Column(name = "SPV_NIK", length = TableUtil.LENGTH_NIK)
	// private String spvNik;

	// @Column(name = "SPV_NAME", length = TableUtil.LENGTH_PERSON_NAME)
	// private String spvFullName;

	@Column(name = "USER_TYPE", length = TableUtil.LENGTH_ROLE)
	private String userType;

	@Column(name = "MOBILE_PHONE", length = TableUtil.LENGTH_PHONE)
	private String mobilePhone;

	@Column(name = "SN", length = 300)
	// @Column(name = "SN", length = 40)
	private String sn;

	@Column(name = "EMAIL_ADDR", length = TableUtil.LENGTH_EMAIL)
	private String emailAddr;

	// @Column(name = "BRANCH_CODE")
	// private String branchCode;

	// @Column(name = "EMPL_BRANCH", length = TableUtil.LENGTH_BRANCH_ID)
	// private String officeId;

	@Column(name = "JABATAN", length = 80)
	private String jabatan;

	@Column(name = "EMERGENCY_NAME", length = TableUtil.LENGTH_PERSON_NAME)
	private String emergencyName;

	@Column(name = "EMERGENCY_PHONE", length = TableUtil.LENGTH_PHONE)
	private String emergencyPhone;

	@Column(name = "USER_STATUS", length = 10)
	private String userStatus;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@Column(name = "BIRTH_PLACE", length = TableUtil.LENGTH_CITY)
	private String birthPlace;

	// 220707
	@Column(name = "FAILED_ATTEMPT")
	private Integer failedAttempt;

	@Column(name = "ENCRYPTED_PWD")
	private String encryptedPwd;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "LAST_CHANGE_PWD")
	private Date lastChangePwd;

	@JsonIgnore
	public boolean isDisabled() {
		return this.userStatus != null && this.userStatus.equals("N");
	}
	
	@ManyToOne
	@JoinColumn(name = "EMPL_BRANCH")
	private Office office;
}
