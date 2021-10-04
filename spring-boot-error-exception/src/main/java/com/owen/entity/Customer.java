package com.owen.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
@Data @AllArgsConstructor @NoArgsConstructor
public class Customer {
    /**
     * NotNull对于基础类型判断比较多，比如 不能为null
     * int a
     *
     * NotBlank 不为空串，广泛用于String
     *
     * NotEmpty  内容不能为空，集合等的判断
     */
    @NotBlank(message = "{guest.name.notblank}")
    private String name;

    @NotBlank
    private String role;
}
