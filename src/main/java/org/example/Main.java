package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static int tinhTong(int a, int b) {
        logger.info("Đang tính tổng của {} và {}", a, b);
        return a + b;
    }


    public static void checkPathCorrect() throws java.io.IOException {
        java.nio.file.Path path = java.nio.file.Paths.get("target", "test-file.txt");

        if (java.nio.file.Files.notExists(path)) {
            java.nio.file.Files.createFile(path);
        }

        System.out.println("Đã xử lý file tại: " + path.toAbsolutePath());
    }
    public static void main(String[] args) {
        System.out.println("Tổng là: " + tinhTong(5, 5));
    }
}