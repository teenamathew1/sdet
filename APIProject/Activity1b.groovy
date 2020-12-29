package GroovyProject1

class Activity1b {
	public static void main(def args)
	{
		File file = new File("src/resources/input.txt")
		file.createNewFile();
		
		//Write text to input.txt
		def inputText = "A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever after\nThis 1 v3ry c0nfus1ng 33";
		file.write(inputText);
		
		
		println "Match Operations"
		//print the line that has Cow at the end - Cow$
		file.eachLine { line ->
			if(line ==~ /^.*Cow$/) {
				println "Line that ends with 'Cow' is  $line "
			}
		}
		
		//Print the line that start with capital letter 'J' - ^J
		file.eachLine { line ->
			if(line ==~ /^J.*/) {
				println "Line that starts with 'J' is  $line "				
			}
		}

		//Print the line that has two numbers one after the other - \d\d
		file.eachLine { line ->
			if(line ==~ /.*\d\d.*/) {
				println "Line that that has 2 numbers one after another is  $line "
			}
		}
		
		//Print the string(s) that match the pattern '\S+ er' - 
		println "\n\nFind Operations:"
		def match1 = file.getText() =~ /\S+er/
		println "the string(s) that match the pattern '/\\S+er/' are:  ${match1.findAll()}"

		//Print the string(s) that match the pattern '\S*\d\W'
		def match2 = file.getText() =~ /\S*\d\W/
		println "the string(s) that match the pattern '/\\S*\\d\\W/' are:  ${match2.findAll()}"

		
		
	}
}
