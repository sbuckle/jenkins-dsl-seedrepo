pipelineJob('hello-world') {
    definition {
    	cps {
    		script(readFileFromWorkspace('hello-world.groovy'))
    		sandbox()
    	}
    }
}