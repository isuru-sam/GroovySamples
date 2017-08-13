package groovy.samples.asttransformations.create

import  java.lang.annotation.*

import org.codehaus.groovy.transform.GroovyASTTransformationClass
import RandomNumberTransformation
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@GroovyASTTransformationClass(classes=[groovy.samples.asttransformations.create.RandomNumberTransformation.class])
//@GroovyASTTransformationClass(classes={com.company.transform.SerializableTransformation.class})
public @interface RandomNumber{
	
}