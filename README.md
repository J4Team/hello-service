# hello-service

Bu service sadece bir microservice eklemek için yapılmıştır.
Bu serviste önemli olan nokta applicatipn.properties file'ındaki 
eureka.client.service-url.default-zone=http://localhost:8761/eureka 'dır. Bu çalıştırdığımız eureka-server'a kaydetmemize yardımcı olur.
Diger bir nokta ise @EnableEurekaClient 'dır. Buda Eureka-Client oldugunu; eureka-server'a kaydedeceğimizi ifade eder.
