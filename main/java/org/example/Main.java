package org.example;

import org.example.http.HttpImageStatusCli;
import org.example.http.HttpStatusChecker;
import org.example.http.HttpStatusImageDownloader;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("url: " + new HttpStatusChecker().getStatusImage(411));
        new HttpStatusImageDownloader().downloadStatusImage(101);
        new HttpImageStatusCli().askStatus();
    }
}
