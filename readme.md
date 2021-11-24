# Task Manager
## Atividade técnica de estágio - Desenvolvimento Java Web
### Requisitos
 - JDK 11
 - Tomcat 9
 - Postgresql 12
 - IDE Java (Intellij, Eclipse, ...)
### Instalação de cada requisito no Linux (Ubuntu 20.04)
- JDK 11:
  1. Baixe o JDK 11: https://adoptium.net/?variant=openjdk11&jvmVariant=hotspot
  2. Em seguida faça:
  ```shell
  sudo tar xvzf arquivo.tar.gz -C /opt/
  export JAVA_HOME=/opt/jdk11.0.13+8
  export PATH=$PATH:$JAVA_HOME/bin
  ```
  OBS: para as variáveis de ambientes deixar de serem temporárias adicione as duas últimas linhas ao arquivo de conf do seu shell (ex: nano ~/.zshrc -> cola as variáveis nesse arquivo).
  
  ---
- Tomcat 9
  1. Baixe o Tomcat 9: https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.55/bin/apache-tomcat-9.0.55.tar.gz
  2. Em seguida faça:
  ```shell
  sudo tar xvzf arquivo.tar.gz -C /opt/
  ```
  Para uma instalação mais completa acesse: https://www.digitalocean.com/community/tutorials/install-tomcat-9-ubuntu-1804
  
  ---
- Postgresql 12
  1. Abra o terminal e digite
  ```shell
  sudo apt update
  sudo apt install postgresql postgresql-contrib
  ```
  Para uma instalação mais completa acesse: https://linuxhint.com/install_postgresql_-ubuntu/
  
  ---
- IDE Intellij
  1. Baixe em: https://www.jetbrains.com/idea/download/#section=linux
  2. Siga os passos (next, next and finish).
### Executando a aplicação
1. Baixe o repósitorio
2. Abra o projeto na IDE e configure o tomcat usando esse tutorial: https://mkyong.com/intellij/intellij-idea-run-debug-web-application-on-tomcat/
3. Clique em Run/Debug.
4. http://localhost:8080/taskmanager_war_exploded/
