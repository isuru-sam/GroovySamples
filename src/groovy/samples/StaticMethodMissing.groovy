package groovy.samples

Foo.metaClass.'static'.invokeMethod = { String name, args ->
     println "Static Builder processing $name "
}

 static $static_methodMissing(String name, args) {
    println "Missing static $name"
}