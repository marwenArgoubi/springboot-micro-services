FROM openjdk:17-jdk
WORKDIR /app
COPY target/CurrencyExchangeService-0.0.1-SNAPSHOT.jar /app/springapp.jar
EXPOSE 8000
CMD [ "java","-jar","springapp.jar" ]
