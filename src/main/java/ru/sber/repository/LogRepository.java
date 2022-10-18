package ru.sber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sber.model.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
}
