pipeline {
  agent any
  tools{
    jdk 'jdk'
    maven 'mvn'
  }
  stages {
    stage('Cloning Git') {
      steps {
        git([url: 'https://github.com/santhosh-git-23/sample.git', branch: 'main'])
       }
    }
    stage('Maven') {
      steps {
        sh 'mvn clean install'
       }
    }
    stage ('jar execution') {
      steps{
        echo "Compiling ... "
        sh 'javac src/main/java/com/example/sample/SampleApplication.java'
        echo "Execution ..."
        sh 'java src/main/java/com/example/sample/SampleApplication.java'
        sh 'jar cvfe SampleApplication.jar SampleApplication *.class'
        echo "============================"
        sh 'java -jar SampleApplication.jar'
        echo "============================"
      }
    }
  }
}
