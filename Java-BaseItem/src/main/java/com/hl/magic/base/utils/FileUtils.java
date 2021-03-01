package com.hl.magic.base.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;

/**
 * 文件工具类
 *
 * @author zjj
 * @version 1.0.0
 * @date 2019-05-14 16:53
 */
public final class FileUtils {

    private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

    /**
     * 获取文件大小单位为B的double值
     */
    public static final int FILE_SIZE_TYPE_B = 1;
    /**
     * 获取文件大小单位为KB的double值
     */
    public static final int FILE_SIZE_TYPE_KB = 2;
    /**
     * 获取文件大小单位为MB的double值
     */
    public static final int FILE_SIZE_TYPE_MB = 3;
    /**
     * 获取文件大小单位为GB的double值
     */
    public static final int FILE_SIZE_TYPE_GB = 4;

    private FileUtils() {
    }

    /**
     * 获取不带路径的文件名
     *
     * @param fileName 包含路径的文件名
     * @return 文件名
     */
    public static String getActualFileName(String fileName) {
        int unixSep = fileName.lastIndexOf('/');
        int windowsSep = fileName.lastIndexOf('\\');

        int pos = windowsSep > unixSep ? windowsSep : unixSep;
        if (pos != 1) {
            fileName = fileName.substring(pos + 1);
        }
        return fileName;
    }

    /**
     * 获取指定文件指定单位大小
     *
     * @param filePath 文件路径
     * @param sizeType 文件大小类型：1-B、2-KB、3-MB、4-GB
     * @return
     */
    public static double getFileOrFileSize(String filePath, int sizeType) {
        File file = new File(filePath);
        long blockSize = 0;
        try {
            blockSize = getFileSize(file);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return formatFileSize(blockSize, sizeType);
    }

    /**
     * 自动计算指定文件或文件夹的大小
     *
     * @param path
     * @return 计算后的带B、KB、MB、GB的字符串
     */
    public static String getAutoFilesSize(String path) {
        File file = new File(path);
        long blockSize = 0;
        try {
            blockSize = getFileSize(file);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return formetFileSize(blockSize);
    }

    /**
     * 获取文件指定的大小
     *
     * @param file 指定文件
     * @return
     * @throws Exception
     */
    public static long getFileSize(File file) throws Exception {
        long size = 0;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            size = inputStream.available();
        } catch (Exception e) {
            logger.info(e.getMessage());
        } finally {
            if (null != inputStream) {
                inputStream.close();
            }
        }
        return size;
    }

    /**
     * 获取文件指定的大小
     *
     * @param file 指定文件
     * @return
     */
//    public static long getFileSize(MultipartFile file) throws Exception {
//        FileInputStream inputStream = null;
//        long size = 0;
//        try {
//            inputStream = new FileInputStream((File) file);
//            size = inputStream.available();
//        } catch (Exception e) {
//            logger.info(e.getMessage());
//        } finally {
//            if (null != inputStream) {
//                inputStream.close();
//            }
//        }
//        return size;
//    }

    /**
     * 转换文件大小
     *
     * @param fileSize
     * @return
     */
    public static String formetFileSize(long fileSize) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String fileSizeStr = "";
        String wrongSize = "0B";
        if (fileSize == 0) {
            return wrongSize;
        }

        if (fileSize < 1024) {
            fileSizeStr = decimalFormat.format(fileSize) + "B";
        } else if (fileSize < 1048576) {
            fileSizeStr = decimalFormat.format(fileSize / 1024) + "KB";
        } else if (fileSize < 1073741824) {
            fileSizeStr = decimalFormat.format(fileSize / 1048576) + "MB";
        } else {
            fileSizeStr = decimalFormat.format(fileSize / 1073741824) + "GB";
        }
        return fileSizeStr;
    }

    /**
     * 转换文件大小，指定转换的类型
     *
     * @param fileSize
     * @param sizeType
     * @return
     */
    public static double formatFileSize(long fileSize, int sizeType) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        double fileSizeLong = 0;
        switch (sizeType) {
            case FILE_SIZE_TYPE_B:
                fileSizeLong = Double.valueOf(decimalFormat.format((double) fileSize));
                break;
            case FILE_SIZE_TYPE_KB:
                fileSizeLong = Double.valueOf(decimalFormat.format((double) fileSize / 1024));
                break;
            case FILE_SIZE_TYPE_MB:
                fileSizeLong = Double.valueOf(decimalFormat.format((double) fileSize / 1048576));
                break;
            case FILE_SIZE_TYPE_GB:
                fileSizeLong = Double.valueOf(decimalFormat.format((double) fileSize / 1073741824));
                break;
            default:
                break;
        }
        return fileSizeLong;
    }
}
