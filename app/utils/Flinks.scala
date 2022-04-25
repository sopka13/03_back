package utils

import scala.collection.mutable.ArrayBuffer

class Flinks() {
	private val flinks = ArrayBuffer[Flink]()
	def apply(name: String): Flink = flinks.find({ elem: Flink => elem.name == name }).get
	def add(f: Flink): Unit = flinks += f
	def remove(name: String): Unit = flinks -= this.apply(name)
	def info: Map[String, String] = (for(f <- flinks) yield (f.name, f.path.toString)).toMap
	def size: Int = flinks.size
	def tmpInfo: Array[Flink] = flinks.toArray
}
