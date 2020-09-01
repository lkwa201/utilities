package utilities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MysqlPasswordHash {
    public static void main(String[] args) {
        String hash = MysqlPasswordHash.password("Kmlee6791**");
        System.out.println(hash);
    }

    // byte[] to hex
    public static String byteArrayToHex(byte[] ba) {
        if (ba == null || ba.length == 0) {
            return null;
        }

        StringBuffer sb = new StringBuffer(ba.length * 2);
        String hexNumber;
        for (int x = 0; x < ba.length; x++) {
            hexNumber = "0" + Integer.toHexString(0xff & ba[x]);

            sb.append(hexNumber.substring(hexNumber.length() - 2));
        }
        return sb.toString();
    }

    public static byte[] getSHA1(byte[] input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            return md.digest(input);
        } catch(NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA1 Algorithm not found", e);
        }
    }

    public static String password(byte[] input) {
        byte[] digest = null;

        digest = getSHA1(input);
        digest = getSHA1(digest);

        StringBuilder sb = new StringBuilder(1+digest.length);
        sb.append("*");
        //sb.append(ByteUtils.toHexString(digest).toUpperCase());
        sb.append(byteArrayToHex(digest).toUpperCase());
        return sb.toString();
    }

    public static String password(String input) {
        if (input == null) {
            return null;
        }
        return password(input.getBytes());
    }
}
