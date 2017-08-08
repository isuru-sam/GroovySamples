package groovy.samples.coolGroovy

import org.codehaus.groovy.runtime.DefaultGroovyMethods

def combo =GroovyCollections.combinations([[1,2,3],['a','b'],['x','y','z']]);

println combo


 DefaultGroovyMethods.eachPermutation(['Hello','Groovy','World'], {println it})



//println ('http://www.ceylonvehicles.com'.toURL().text)
