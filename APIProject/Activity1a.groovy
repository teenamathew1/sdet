package GroovyProject1

class Activity1a {
	public static void main(def args)
	{
		def inputList = [11,2,19,5,"Mango","Apple","Watermelon"]
		
		def strList = inputList.minus([11, 2, 19, 5 ])
		def intList = inputList.minus(["Mango","Apple","Watermelon"])
		
		println "Sorted string list : " + strList.sort()
		println "Sorted Integer list : " + intList.sort()
		
	}
}
