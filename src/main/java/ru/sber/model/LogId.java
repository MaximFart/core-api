package ru.sber.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class LogId implements Serializable {
    private Long id;

    private LocalDateTime time;

    public LogId() {
    }

    public LogId(Long id, LocalDateTime time) {
        this.id = id;
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogId logId = (LogId) o;
        return Objects.equals(id, logId.id) && Objects.equals(time, logId.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time);
    }
}
