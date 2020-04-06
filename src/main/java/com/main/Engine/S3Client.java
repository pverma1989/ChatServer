package com.main.Engine;

import java.io.File;

public interface S3Client {

     void createFile(String bucket, File file);

     void readFile(String bucket, File file);

     void deleteFile(String bucket, File file);
}
