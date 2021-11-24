# Task Manager
## Atividade técnica de estágio - Desenvolvimento Java Web
Nesta atividade desenvolvi uma aplicação web com Java que funciona como um gerenciador de tarefas. Nessa aplicação utlizei a especificação JSF (item a) para construir as interfaces juntamente com a biblioteca Primefaces (item f) e, também, fiz uso da persistência em banco de dados PostgreSQL (item b) com JPA (item c).
O gerenciador de tarefas (Task Manager) é uma aplicação com aparência amigável que ajuda no planejamento de tarefas no dia a dia, na qual você é capaz de adicionar novas tarefas, editar tarefas e excluir tarefas. 
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
3. Crie um Database com o nome 'dbTasks', com usuário 'postgres' e senha 'pg123pg', para tal use este tutorial https://www.digitalocean.com/community/tutorials/how-to-install-and-use-postgresql-on-ubuntu-20-04
4. Clique em Run/Debug.
5. http://localhost:8080/taskmanager_war_exploded/
