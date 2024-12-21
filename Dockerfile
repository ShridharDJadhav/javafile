FROM openjdk
WORKDIR /app
COPY . /app  
RUN javac Addition.java
CMD ["java" , "Addition"]