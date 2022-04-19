pipeline {
	agent any 
	stages {
		stage('Pipeline to seed jobs') {
			jobDsl targets: ['*.groovy'].join('\n')
		}
	}
}