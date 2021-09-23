package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnterpriseAdministrator {

    private String enterpriseAdministrator_id;
    private int enterprise_id;
    private String enterpriseAdministrator_password;

}
