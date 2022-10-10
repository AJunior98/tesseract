package com.example.tesseract.controllers;

import com.example.tesseract.utils.ImgUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/ocr")
public class Ocr {

    @PostMapping()
    public ResponseEntity<String> converte(@RequestParam(name = "file") MultipartFile file) throws IOException {
        return ResponseEntity.ok(ImgUtil.coletaInformacoes(ImgUtil.retiraBorda(ImgUtil.validaArquivo(file))));
    }

}