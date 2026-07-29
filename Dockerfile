FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app
COPY . .
RUN chmod +x gradlew

RUN apt-get update && apt-get install -y \
    libnss3 libatk-bridge2.0-0 libx11-xcb1 libxcomposite1 \
    libxdamage1 libxrandr2 libgbm1 libpango-1.0-0 libasound2 \
    libxfixes3 libxkbcommon0 libatk1.0-0 libcups2 libdrm2 \
    libxext6 libxi6 libxtst6 fonts-liberation \
    && rm -rf /var/lib/apt/lists/*

RUN ./gradlew :site:kobwebExport -Pkobweb.export.layout=static

FROM nginx:alpine
COPY --from=build /app/site/.kobweb/site/pages/. /usr/share/nginx/html/
COPY --from=build /app/site/.kobweb/site/resources/. /usr/share/nginx/html/
EXPOSE 80