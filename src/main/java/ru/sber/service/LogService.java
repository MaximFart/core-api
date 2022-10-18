package ru.sber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.model.Log;
import ru.sber.repository.LogRepository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

@Service
public class LogService {
    private final LogRepository repository;
    private static final Logger logger = Logger.getLogger(LogService.class.getName());


    @Autowired
    public LogService(LogRepository repository) {
        this.repository = repository;
    }
    public void save(Log log) {
        repository.save(log);
    }

    public void writeLog(Log log) throws IOException {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logging_data"))) {
            bufferedWriter.write(log.toString());
        }
    }
}
