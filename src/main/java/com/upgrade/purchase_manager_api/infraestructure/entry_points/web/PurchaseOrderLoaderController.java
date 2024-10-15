package com.upgrade.purchase_manager_api.infraestructure.entry_points.web;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/purchase", produces = MediaType.APPLICATION_JSON_VALUE)
public class PurchaseOrderLoaderController {

    @PostMapping(value = "/load")
    public ResponseEntity<Object> load(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok().build();
    }
}
