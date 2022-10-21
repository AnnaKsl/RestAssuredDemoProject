pipeline {
  agent any
  tools {
    maven 'Maven 3.6' 
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
