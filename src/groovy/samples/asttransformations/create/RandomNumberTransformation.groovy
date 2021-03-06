package groovy.samples.asttransformations.create

import org.codehaus.groovy.ast.Parameter


//groovy.samples.asttransformations.create.RandomNumberTransformation

import javax.lang.model.element.Modifier

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode
//import org.codehaus.groovy.ast.ImmutableClassNode
//import org.codehaus.groovy.ast.ImmutableClassNode
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.stmt.ReturnStatement
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation


//@groovyasttransformation(phase = CompilePhase.CANONICALIZATION)
@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
public class RandomNumberTransformation implements ASTTransformation {

	/*def getRandom() {
		Math.abs(new Random().nextInt() % 1000) + 1
	}*/

	@Override
	public void visit(ASTNode[] nodes, SourceUnit source) {
		ClassNode cNode=nodes[1]
		def code = new ReturnStatement(new ConstantExpression(42))
		
	def mn = new MethodNode('getRandomNumber', 1,
		 ClassHelper.make(Integer) , 
		 new Parameter[0], ClassNode.EMPTY_ARRAY , code);
		 cNode.addMethod(mn)

	
		
		}
}
