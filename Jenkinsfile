pipeline {
  agent any
  stages {
    stage('SCM Github') {
      parallel {
        stage('SCM Github') {
          steps {
            git(url: 'https://github.com/deepaksorthiya/java-junit5-start.git', branch: 'master', credentialsId: 'github')
          }
        }

        stage('Build') {
          steps {
            sh 'mvn clean install -DskipTests=true'
          }
        }

      }
    }

  }
}