package ru.sber.util;

import ru.sber.model.Log;

public class LogUtil {
    public static final String FILE_LOG_NAME = "logging.log";

    public static String formatLog(Log log) {
        return String.format("%s : %s : %s\n", log.getTime(), log.getType(), log.getMessage());
    }

}
