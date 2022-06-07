pipeline {
    agent any

    stages {
    	stage('Checkout') {
    		steps {
    			checkout([
    				$class: 'GitSCM',
    				branches: [[name: 'refs/heads/master']],
    				extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'Test']],
    				userRemoteConfigs: [[url: 'https://github.com/sbuckle/jenkins-dsl-seedrepo.git']]
    			])
    		}
    	}
        stage('Hello') {
            steps {
                echo "Hello ${NAME}"
            }
        }
    }
}