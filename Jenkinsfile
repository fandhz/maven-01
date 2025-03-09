

pipeline {
  agent any
  tools { 
        maven 'Maven_3.2.5'  
    }
   stages{
    stage('CompileandRunSonarAnalysis') {
            steps {	
		sh 'mvn clean verify  org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=fandhz_OPSv2 -Dsonar.organization=fandhz -Dsonar.host.url=https://sonarcloud.io -Dsonar.token=06c5630dc99aa2d8f8d6b2236bfab7ee87fdb194'
			}
    }

	stage('RunSCAAnalysisUsingSnyk') {
            steps {		
				withCredentials([string(credentialsId: 'SNYK_TOKEN', variable: 'SNYK_TOKEN')]) {
					sh 'mvn snyk:test -fn'
				}
			}
    }		
  }
}
