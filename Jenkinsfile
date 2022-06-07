pipeline {
	agent any 
	stages {
		stage('Pipeline to seed jobs') {
			steps {
				jobDsl targets: ['job.groovy'].join('\n'), sandbox: true
			}
		}
	}
}
