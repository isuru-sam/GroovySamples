package groovy.samples.metaprogramming

import java.util.logging.*

Logger.metaClass.serious ={msg->delegate.info(msg)}
Logger.metaClass.fatal ={msg->delegate.severe(msg)}

Logger logger = Logger.getLogger(this.class.name)

logger.serious("serious msg")
logger.fatal("fatal msg")