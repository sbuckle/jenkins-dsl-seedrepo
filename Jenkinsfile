pipeline {
	agent any 
	stages {
		stage('Pipeline to seed build job') {
			steps {
				jobDsl targets: ['job.groovy'].join('\n'), sandbox: true
			}
		}
	}
}
