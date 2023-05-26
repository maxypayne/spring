package com.maxim.api.repositories;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageRepository {
    void init();
    void store(MultipartFile file);
    Stream<Path> loadAll();
    Path load(String filePath);
    Resource loadAsResource(String fileName);
    void deleteAll();
}
