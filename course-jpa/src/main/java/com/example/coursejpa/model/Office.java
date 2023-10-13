package com.example.coursejpa.model;

import com.example.coursejpa.util.TableUtil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Office {
    @Id
    @Column(name = "OFFICE_CODE", length = TableUtil.LENGTH_BRANCH_ID)
    private String id;

    @Column(name = "BRANCH_NAME", length = TableUtil.LENGTH_CITY)
    private String name;

}
