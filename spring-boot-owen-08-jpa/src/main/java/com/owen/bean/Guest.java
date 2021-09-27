package com.owen.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 实体类：嘉宾
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Guest implements Serializable {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String role;

}
