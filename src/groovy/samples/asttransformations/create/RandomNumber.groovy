package groovy.samples.asttransformations.create

import  java.lang.annotation.*

import org.codehaus.groovy.transform.GroovyASTTransformationClass

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@GroovyASTTransformationClass(["groovy.samples.asttransformations.create.RandomNumberTransformation"])
//@GroovyASTTransformationClass(classes={com.company.transform.SerializableTransformation.class})
public @interface RandomNumber{
	
}