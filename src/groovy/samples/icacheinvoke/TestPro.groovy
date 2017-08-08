package groovy.samples.icacheinvoke
import groovy.samples.icacheinvoke.CustomLevel
import java.util.logging.*
 

def c=new CustomLevel("e",Level.SEVERE.intValue() + 1)
//Level l =new Level("ee",Level.SEVERE.intValue() + 1)
println c instanceof Level
println  (Level.SEVERE.intValue() + 1)
Logger logs=Logger.getLogger(this.class.name)
logs.log(c ,"pp")

