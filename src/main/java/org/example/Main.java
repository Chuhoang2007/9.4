package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static int tinhTong(int a, int b) {
        logger.info("Đang tính tổng của {} và {}", a, b);
        return a + b;
    }

    // Main.java
    public static void checkPathError() throws java.io.IOException {
        // Thêm một thư mục con "subdir" không tồn tại
        java.io.File file = new java.io.File("target\\subdir\\test.txt");
        file.createNewFile();
    }
    public static void main(String[] args) {
        System.out.println("Tổng là: " + tinhTong(5, 5));
    }
}