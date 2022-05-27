package com.otl.OTLanguage.activity;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * 파일을 읽어오는 클래스
 */
@Slf4j
public class InFile {
    private final JFrame frame = new JFrame();
    private final FileDialog fileDialog = new FileDialog(frame, "파일열기", 0);

    public void openFile() {
        fileDialog.setDirectory("C:");
        fileDialog.setVisible(true);

        //이름, 경로 가져오기
        String fileName = fileDialog.getName();
        String fileContent = fileDialog.getDirectory();

        log.info("파일 가져오기");
        log.info("파일 이름 = {}", fileName);
        log.info("파일 경로 = {}", fileContent);

        File file = new File(fileContent);

    }
}
