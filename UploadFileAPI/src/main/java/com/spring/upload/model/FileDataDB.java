package com.spring.upload.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "filesDB")
public class FileDataDB {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  private String name;

  private String type;

  @Lob
  // data is annotated by @Lob annotation. LOB is datatype for storing large object data.
  private byte[] data;

public FileDataDB( String name, String type, byte[] data) {
	super();
	this.name = name;
	this.type = type;
	this.data = data;
}

public FileDataDB() {
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public byte[] getData() {
	return data;
}

public void setData(byte[] data) {
	this.data = data;
}
  
  
}
