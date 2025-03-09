pipeline {
  agent any
  tools { 
        maven 'Maven_3_2_5'  
    }
   stages{
    stage('CompileandRunSonarAnalysis') {
            steps {	
		sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=fandhz_OPSv2 -Dsonar.organization=fandhz -Dsonar.host.url=https://sonarcloud.io -Dsonar.token=06c5630dc99aa2d8f8d6b2236bfab7ee87fdb194'
			}
        } 
  }
}
