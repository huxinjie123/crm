package com.crm.info.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author huxinjie
 * @date 2020/12/28 16:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
@EqualsAndHashCode()
@ApiModel(value = "Admin对象", description = "")
public class Admin {
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "密码")
    private String password;
}
