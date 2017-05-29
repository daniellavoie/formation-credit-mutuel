# formation-credit-mutuel

## Télécharger Eclipse

http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/neon/3/eclipse-jee-neon-3-win32-x86_64.zip

## Télécharger le JDK 8

http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html

## Configuration proxy pour settings.xml

```
<settings>
  <proxies>
     <proxy>
        <id>example-proxy</id>
        <active>true</active>
        <protocol>http</protocol>
        <username>tomcat</username>
        <password>tomcat</password>
        <host>proxy.example.com</host>
        <port>8008</port>
        <nonProxyHosts>www.google.com|*.example.com</nonProxyHosts>
     </proxy>
  </proxies>
</settings>
```
## Plugin maven de packaging

```
  <build>
    <plugins>
      <plugin>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>
```
