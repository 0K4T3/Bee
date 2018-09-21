package Bee;

import java.security.MessageDigest;

public class SHA256 {
  public static String execute(String clearText) {
    StringBuilder sb = new StringBuilder();

    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(clearText.getBytes());
      byte[] cipherBytes = md.digest();

      for (byte b : cipherBytes) {
        sb.append(String.format("%02x", b & 0xff));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return sb.toString();
  }
}
