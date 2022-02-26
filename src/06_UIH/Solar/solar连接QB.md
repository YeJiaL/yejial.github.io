windows下

```
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true
sonar-scanner -Dproject.settings=devops/sonarqube/sonar-project.properties
```



未验证

```
mvn sonar:sonar -Dsonar.host.url=http://sonar.juneyaoair.com:9000 -Dsonar.login=aaa-Dsonar.password=aaa
```



