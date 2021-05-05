Build Maven the project
1. mvn clean install
2 .RUN docker-compose up -d

Check
 Config the App per env:
  - docker-compose : env_file
  - k8 : inject secret & configmap
    
 Check the image
 App probes : liveness & readiness
   http://localhost:8080/actuator/health
   http://localhost:8080/actuator/health/liveness
   http://localhost:8080/actuator/health/readiness
   Configure KubeCtl
   
   Documentation des API
   http://localhost:8080/swagger-ui.html
   http://localhost:8080/v3/api-docs
   Disable in production env
   To start : https://github.com/springdoc/springdoc-openapi-demos
   
   Exception handling : message, code, log format
   
   
   Test BDD :cucumber
   
