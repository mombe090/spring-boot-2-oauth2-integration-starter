pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        bat 'mvn clean'
        bat 'mvn test'
      }
    }
    stage('deploy') {
      steps {
        bat 'mvn package'
      }
    }
  }
}