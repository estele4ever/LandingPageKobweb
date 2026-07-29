FROM eclipse-temurin:21-jdk-jammy AS build
WORKDIR /app
COPY . .
RUN chmod +x gradlew

# Installer les dépendances système nécessaires pour Chromium/Playwright
RUN apt-get update && apt-get install -y \
    libnss3 libatk-bridge2.0-0 libx11-xcb1 libxcomposite1 \
    libxdamage1 libxrandr2 libgbm1 libpango-1.0-0 libasound2 \
    && rm -rf /var/lib/apt/lists/*

RUN ./gradlew :site:kobwebExport -Pkobweb.export.layout=static

FROM nginx:alpine
COPY --from=build /app/site/.kobweb/site /usr/share/nginx/html
EXPOSE 80