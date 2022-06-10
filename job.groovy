def pipelineScript = readFileFromWorkspace('hello-world.groovy')

pipelineJob('hello-world') {
	parameters {
		stringParam("NAME")
	}
    definition {
    	cps {
    		script(pipelineScript)
    		sandbox()
    	}
    }
}