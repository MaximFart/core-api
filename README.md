# core-api
## Проводник для запуска приложения

База данных:
1. Создать БД в postgreSQL, заполнить полня url, username, password в resources/application.properties

Terminal:
1. mvn package
2. cd target
3. java -jar core-api-1.0-SNAPSHOT.jar

Postman:
1. method POST, localhost:8080/core-api/logs

    -Example input:
{
    "message": "Msg998",
    "type": "com.journaldev.log.LoggingExample main",
    "level": "INFO",
    "time": "2016-03-16T13:56:39.492"
}

    -Проверить лог файл можно перейти в папку target. В ней создастся лог файл logging.log
 
2. method GET, localhost:8080/core-api/actuator/health

    -Сообщает состояние работоспособности нашего приложения.
