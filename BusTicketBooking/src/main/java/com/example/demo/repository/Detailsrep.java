package com.example.demo.repository;

//import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Details;


public interface Detailsrep extends JpaRepository<Details, Integer>{

	@Query(value = "select * from Personal_Details where id=:s or name=:ns",nativeQuery = true)
	public List<Details> getinfo(@Param("s") int id,@Param("ns") String name);
	@Modifying
	@Transactional
	@Query(value ="delete from Personal_Details where emailid=:s",nativeQuery = true)
	public int deleteinfo(@Param("s") String id);
	@Modifying
	@Transactional
	@Query(value="update Personal_Details set name=?1 where emailid=?2",nativeQuery = true)
	public int updateinfo(String newname,String oldid);
	@Query(value = "select * from Personal_Details where emailid=:ns",nativeQuery = true)
	public List<Details> getinfobyemails(@Param("ns") String emailid);
}
