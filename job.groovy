pipelineJob('hello-world') {
    parameters {
	stringParam("NAME")
    }
    definition {
    	cps {
    		script(readFileFromWorkspace('hello-world.groovy'))
    		sandbox()
    	}
    }
}
