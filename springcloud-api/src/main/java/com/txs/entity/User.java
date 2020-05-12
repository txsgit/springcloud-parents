package com.txs.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class User implements Serializable {
 
	private Long id;
	private String name;
	private String db_source;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
	
	
}
