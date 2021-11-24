# Task Manager
## Atividade técnica de estágio - Desenvolvimento Java Web
### Requisitos
 - JDK 11
 - Tomcat 9
 - Postgresql 12
 - IDE Java (Intellij, Eclipse, ...)
### Instalação de cada requisito no Linux (Ubuntu 20.04)
- JDK 11:
  I. Baixe o JDK 11: https://adoptium.net/?variant=openjdk11&jvmVariant=hotspot
  II. Em seguida faça:
  ```shell
  sudo tar xvzf arquivo.tar.gz -C /opt/
  export JAVA_HOME=/opt/jdk11.0.13+8
  export PATH=$PATH:$JAVA_HOME/bin
  ```
  OBS: para as variáveis de ambientes deixar de serem temporárias adicione as duas últimas linhas ao arquivo de conf do seu shell (ex: nano ~/.zshrc -> cola as variáveis nesse arquivo).
- Tomcat 9
  I. Baixe o Tomcat 9: https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.55/bin/apache-tomcat-9.0.55.tar.gz
  II. Em seguida faça:
  ```shell
  sudo tar xvzf arquivo.tar.gz -C /opt/
  ```
  Para uma instalação mais completa acesse: https://www.digitalocean.com/community/tutorials/install-tomcat-9-ubuntu-1804
- Postgresql 12
  I. Abra o terminal e digite
  ```shell
  sudo apt update
  sudo apt install postgresql postgresql-contrib
  ```
  Para uma instalação mais completa acesse: https://linuxhint.com/install_postgresql_-ubuntu/
- IDE Intellij
  I. Baixe em: https://www.jetbrains.com/idea/download/#section=linux
  II. Siga os passos (next, next and finish).
