package com.francis.chapter91.dao;

import com.francis.chapter91.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long>{
	
	SysUser findByUsername(String username);

}
