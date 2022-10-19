package ru.sber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.model.Log;
import ru.sber.repository.LogRepository;
import ru.sber.util.LogUtil;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class LogService {
    private final LogRepository repository;

    @Autowired
    public LogService(LogRepository repository) {
        this.repository = repository;
    }

    public Log save(Log log) {
        writeLog(log);
        return repository.save(log);
    }

    public void writeLog(Log log) {
        try (FileWriter stream = new FileWriter(LogUtil.FILE_LOG_NAME, true)){
            stream.write(LogUtil.formatLog(log));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
