package org.kevoree.slides.ubimob2012.kevgen.JavaSENode
import org.kevoree.framework.port._
import scala.{Unit=>void}
import org.kevoree.slides.ubimob2012._
class UbiMob2012DevPORTforward(component : UbiMob2012Dev) extends org.kevoree.framework.MessagePort with KevoreeRequiredPort {
def getName : String = "forward"
def getComponentName : String = component.getName 
def process(o : Object) = {
{this ! o}
}
def getInOut = false
}
