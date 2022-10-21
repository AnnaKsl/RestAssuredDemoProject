pipeline {
  agent any
  tools {
    maven 'Maven 3.6' 
  }
  stages {
      stage ('Test') {
      steps {
        script {
         bat 'mvn clean verify'
        }
      }
    }
  }
}
