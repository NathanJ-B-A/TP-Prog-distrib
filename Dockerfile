# Utilise l'image OpenJDK 17 standard
FROM openjdk:17-jdk

# Crée un point de montage pour le répertoire temporaire
VOLUME /tmp

# Expose le port 8080
EXPOSE 8080

# Ajoute le fichier JAR de votre application dans l'image
ADD ./build/libs/commande-0.0.1-SNAPSHOT.jar app.jar

# Définit le point d'entrée de l'application
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
