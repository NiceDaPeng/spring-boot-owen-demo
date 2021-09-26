package com.owen.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 实体类：嘉宾
 */

@Data
@AllArgsConstructor
public class Guest {

    private String name;
    private String role;

}
