pipeline {
  agent any
  tools {
    maven 'maven-3.6' 
  }
  stages {
    stage ('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage ('Test') {
      steps {
        script {
         sh 'mvn verify'
        }
      }
    }
  }
}
