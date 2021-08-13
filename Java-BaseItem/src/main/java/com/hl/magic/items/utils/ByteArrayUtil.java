package com.hl.magic.items.utils;

/**
 * @Author HL
 * @Date 2021/7/31 11:00
 */

public class ByteArrayUtil {

    public static String toHexString(byte[] data) {
        if (data == null) {
            return "";
        }
        StringBuffer buff = new StringBuffer(20);
        for (int i = 0; i < data.length; i++) {
            buff.append(Integer.toHexString(data[i] >> 4 & 0xF));
            buff.append(Integer.toHexString(data[i] & 0xF));
        }
        return buff.toString().trim();
    }

    public static String toHexUpCaseString(byte[] data) {
        return toHexString(data).toUpperCase();
    }

    public static String toHexString(byte[] data, boolean isContain0x) {
        if (data == null) {
            return "";
        }
        StringBuffer buff = new StringBuffer(20);
        for (int i = 0; i < data.length; i++) {
            if (isContain0x) {
                buff.append("0x");
            }
            buff.append(Integer.toHexString(data[i] >> 4 & 0xF));
            buff.append(Integer.toHexString(data[i] & 0xF));
            if ((isContain0x) && (i < data.length - 1)) {
                buff.append(",");
            }
        }
        return buff.toString().trim();
    }

    public static String toHexString(byte data) {
        return Integer.toHexString(data & 0xFF);
    }

    public static String toHexString(byte[] data, int offset, int length) {
        if ((data.length < offset) || (offset < 0)) {
            offset = 0;
        }
        if (length > data.length - offset) {
            length = 0;
        }
        byte[] subArray = new byte[length];
        System.arraycopy(data, offset, subArray, 0, length);
        return toHexString(subArray);
    }

    public static byte uniteBytes(byte src0, byte src1) {
        byte _b0 = Byte.decode("0x" + new String(new byte[]{src0})).byteValue();
        _b0 = (byte) (_b0 << 4);

        byte _b1 = Byte.decode("0x" + new String(new byte[]{src1})).byteValue();
        byte ret = (byte) (_b0 ^ _b1);
        return ret;
    }

    public static byte[] hexString2Bytes(String src) {
        byte[] ret = new byte[src.length() / 2];
        byte[] tmp = src.getBytes();
        for (int i = 0; i < ret.length; i++) {
            ret[i] = uniteBytes(tmp[(i * 2)], tmp[(i * 2 + 1)]);
        }
        return ret;
    }

    public static class BigEndian {
        public static byte[] toByteArray(int iSource, int iArrayLen) {
            byte[] bLocalArr = new byte[iArrayLen];
            for (int i = 0; (i < 4) && (i < iArrayLen); i++) {
                byte temp = (byte) (iSource >> 8 * i & 0xFF);
                bLocalArr[(iArrayLen - i - 1)] = temp;
            }
            return bLocalArr;
        }

        public static byte[] toByteArray(float iSource, int iArrayLen) {
            int _temp = Float.floatToIntBits(iSource);
            return toByteArray(_temp, iArrayLen);
        }

        public static int toInt(byte[] bRefArr) {
            int iOutcome = 0;

            int byteCount = bRefArr.length;
            if (byteCount > 4) {
                byteCount = 4;
            }
            int j = 0;
            for (int i = byteCount - 1; i > -1; i--) {
                byte bLoop = bRefArr[i];
                iOutcome += ((bLoop & 0xFF) << 8 * j++);
            }
            return iOutcome;
        }

        public static int toInt(byte byteIn) {
            int outcome = byteIn & 0xFF;
            return outcome;
        }

        public static long toLong(byte[] bArray) {
            long iOutconme = 0L;

            int byteCount = bArray.length;
            if (byteCount > 8) {
                byteCount = 8;
            }
            int j = 0;
            for (int i = byteCount - 1; i > -1; i--) {
                byte bLoop = bArray[i];
                iOutconme += ((bLoop & 0xFF) << 8 * j++);
            }
            return iOutconme;
        }

        public static float toFloat(byte[] bArray) {
            int _temp = toInt(bArray);
            return Float.intBitsToFloat(_temp);
        }

        public static byte[] toByteArray(long lSource, int iArrayLength) {
            byte[] bLocalArr = new byte[iArrayLength];
            for (int i = 0; (i < 8) && (i < iArrayLength); i++) {
                byte temp = (byte) (int) (lSource >> 8 * i & 0xFF);
                bLocalArr[(iArrayLength - i - 1)] = temp;
            }
            return bLocalArr;
        }

        public static byte[] double2Bytes(double d) {
            long value = Double.doubleToRawLongBits(d);
            byte[] byteRet = new byte[8];
            for (int i = 0; i < 8; i++) {
                byteRet[i] = ((byte) (int) (value >> 8 * i & 0xFF));
            }
            return byteRet;
        }

        public static double byte2Double(byte[] arr) {
            long value = 0L;
            for (int i = 0; i < 8; i++) {
                value |= (arr[i] & 0xFF) << 8 * i;
            }
            return Double.longBitsToDouble(value);
        }
    }

    public static class LittleEndian {
        public static byte[] toByteArray(int iSource, int iArrayLen) {
            byte[] bLocalArr = new byte[iArrayLen];
            for (int i = 0; (i < 4) && (i < iArrayLen); i++) {
                byte temp = (byte) (iSource >> 8 * i & 0xFF);
                bLocalArr[i] = temp;
            }
            return bLocalArr;
        }

        public static int toInt(byte[] bRefArr) {
            int iOutcome = 0;

            int byteCount = bRefArr.length;
            if (byteCount > 4) {
                byteCount = 4;
            }
            for (int i = 0; i < byteCount; i++) {
                byte bLoop = bRefArr[i];
                iOutcome += ((bLoop & 0xFF) << 8 * i);
            }
            return iOutcome;
        }

        public static int toInt(byte byteIn) {
            int outcome = byteIn;
            return outcome;
        }

        public static long toLong(byte[] bArray) {
            long iOutconme = 0L;

            int byteCount = bArray.length;
            if (byteCount > 8) {
                byteCount = 8;
            }
            for (int i = 0; i < byteCount; i++) {
                byte bLoop = bArray[i];
                iOutconme += ((bLoop & 0xFF) << 8 * i);
            }
            return iOutconme;
        }

        public static byte[] toByteArray(long lSource, int iArrayLength) {
            byte[] bLocalArr = new byte[iArrayLength];
            for (int i = 0; (i < 8) && (i < iArrayLength); i++) {
                byte temp = (byte) (int) (lSource >> 8 * i & 0xFF);
                bLocalArr[i] = temp;
            }
            return bLocalArr;
        }
    }

    public static byte[] copyOf(byte[] original, int newLength) {
        byte[] copy = new byte[newLength];
        System.arraycopy(original, 0, copy, 0,
                Math.min(original.length, newLength));
        return copy;
    }

    public static byte[] copyOfRange(byte[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0) {
            throw new IllegalArgumentException(from + " > " + to);
        }
        byte[] copy = new byte[newLength];
        System.arraycopy(original, from, copy, 0, Math.min(original.length - from, newLength));
        return copy;
    }

    public static byte[][] dataPacket(byte[] data, int packetLength)
            throws Exception {
        if ((data == null) || (packetLength <= 0)) {
            throw new Exception("��������������������������");
        }
        int curson = 0;

        int dataLength = data.length;

        int lengthRemain = dataLength % packetLength;
        int updateCount = lengthRemain == 0 ? dataLength / packetLength : dataLength / packetLength + 1;

        byte[][] result = new byte[updateCount][];
        for (int i = 0; i < updateCount; i++) {
            byte[] updataData = null;
            if (i == updateCount - 1) {
                int length = dataLength - packetLength * (updateCount - 1);

                updataData = new byte[length];
                System.arraycopy(data, curson, updataData, 0, length);
            } else {
                updataData = new byte[packetLength];
                System.arraycopy(data, curson, updataData, 0, packetLength);
                curson += packetLength;
            }
            result[i] = updataData;
        }
        return result;
    }

    public static void main(String[] args) {
        byte[] str = hexString2Bytes("0123456789abcdef");

        System.out.println(toHexString(str, true));
        System.out.println(toHexString(str, false));
    }
}

