package com.medcypher.ipfsblockchainpoc;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class IPFSService implements FileServiceImpl {

    @Override
    public String saveFile(MultipartFile file) {
        return null;
    }

    @Override
    public byte[] loadFile(String hash) {
        return new byte[0];
    }
}
