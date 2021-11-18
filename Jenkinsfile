pipeline {
    agent any
	
    stages {
        stage('Checkout') {
            steps {
              git 'https://github.com/Yadhuraj/eLocalStore.git'
            }
        }
        
        stage('Build')
        {
            steps {
                bat 'mvn clean compile'
            
                }
        }
		
		stage('Test'){
		steps{
			bat 'mvn test'
			junit '**/test-output/junitreports/TEST-*.xml'
		}
		}
		
		stage('Package')
		{
		steps{
		bat 'mvn package'
		}
		
		}
		
}
}
