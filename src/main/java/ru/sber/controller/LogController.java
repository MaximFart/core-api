package ru.sber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.model.Log;
import ru.sber.service.LogService;

import java.io.IOException;
import java.util.Optional;

@RestController
public class LogController {

    private LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @PostMapping("/logs")
    public ResponseEntity<String> createLog(@RequestBody Optional<Log> log) {
        Log mappedLog = log.map(l -> logService.save(l)).orElse(null);
        return mappedLog == null ? new ResponseEntity<>("log is empty", HttpStatus.BAD_REQUEST) :
                            new ResponseEntity<>("log saved successfully", HttpStatus.OK);
    }
}
