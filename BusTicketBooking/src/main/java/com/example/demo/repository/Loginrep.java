package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Login;

public interface Loginrep extends JpaRepository<Login, Integer>{
	@Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Login c WHERE c.emailid = :email and c.password=:pass")
    boolean existsByName(@Param("email") String email,@Param("pass") String pass);
	@Modifying
	@Transactional
	@Query(value ="delete from Login_details where emailid=:s",nativeQuery = true)
	public int deletelogin(@Param("s") String emailid);

}
