package com.spring.upload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.upload.model.FileDataDB;

@Repository
public interface  FileUploadRepository extends JpaRepository<FileDataDB, String> {

}
