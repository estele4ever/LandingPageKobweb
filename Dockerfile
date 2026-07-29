         FROM eclipse-temurin:21-jdk AS build
         WORKDIR /app
         COPY . .
         RUN chmod +x gradlew
         RUN ./gradlew :site:kobwebExport -Pkobweb.export.layout=static

         FROM nginx:alpine
         COPY --from=build /app/site/.kobweb/site /usr/share/nginx/html
         EXPOSE 80