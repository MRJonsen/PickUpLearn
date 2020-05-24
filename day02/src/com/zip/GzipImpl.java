package com.zip;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.zip.GZIPInputStream;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/7/9
 * @Version 1.0
 */
public class GzipImpl implements FileHandler {
    @Override
    public String readFile(String path) throws IOException {
        HashSet<String> set = new HashSet<>();
        try {
            GZIPInputStream in = new GZIPInputStream(new BufferedInputStream(new FileInputStream(path)));
            ArchiveInputStream ais = new ArchiveStreamFactory().createArchiveInputStream("tar",in);
            TarArchiveEntry nextEntry = (TarArchiveEntry) ais.getNextEntry();
            while (nextEntry != null) {
                if (!nextEntry.isDirectory()) {
                    set.add(nextEntry.getName());
                }
                nextEntry = (TarArchiveEntry) ais.getNextEntry();
            }
        } catch (ArchiveException e) {
            e.printStackTrace();
        }
        return set.toString();
    }
}
