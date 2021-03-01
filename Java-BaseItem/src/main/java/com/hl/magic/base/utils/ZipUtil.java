package com.hl.magic.base.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author zjj 2018-11-12
 * @version 1.0.0
 */
public class ZipUtil {
    private ZipUtil() {

    }

    /**
     * 压缩多个文件
     *
     * @param paths       待压缩文件路径
     * @param zipFilePath 压缩目标文件路径
     */
    public static void doZip(List<Path> paths, String zipFilePath) throws IOException {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(new File(zipFilePath)))) {
            for (Path path : paths) {
                zipOutputStream.putNextEntry(new ZipEntry(path.getFileName().toString()));

                byte[] bytes = Files.readAllBytes(path);
                zipOutputStream.write(bytes);
            }
        }
    }
}
