package com.spring.upload.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.spring.upload.model.FileDataDB;
import com.spring.upload.repository.FileUploadRepository;

@Service
public class FileService {

	@Autowired
	private FileUploadRepository repo;

	public FileDataDB store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		FileDataDB FileDB = new FileDataDB(fileName, file.getContentType(), file.getBytes());
		return repo.save(FileDB);
	}

	public Stream<FileDataDB> getAllFiles() {
		return repo.findAll().stream();
		
	}
}
