pipeline {
	agent any 
	stages {
		stage('Pipeline to seed jobs') {
			steps {
				jobDsl targets: ['*.groovy'].join('\n')
			}
		}
	}
}