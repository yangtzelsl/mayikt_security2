package com.mayikt.entity;

import lombok.Data;

/**
 * 角色信息表
 * @author luis.liu
 */
@Data
public class RoleEntity {
	private Integer id;
	private String roleName;
	private String roleDesc;
}
