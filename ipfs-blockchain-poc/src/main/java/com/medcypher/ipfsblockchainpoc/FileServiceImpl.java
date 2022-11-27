package com.medcypher.ipfsblockchainpoc;

import org.springframework.web.multipart.MultipartFile;

public interface FileServiceImpl {

    String saveFile(MultipartFile file);

    byte[] getFile(String hash);
}
