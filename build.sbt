//val plugin = enablePlugins(JermanPlugin)
name := "jerman-test"
version := "1.0"
scalaVersion := "2.12.1"

//watchSources in Compile += Def.task{new File("/home/cbannes/source/jerman-test/src/main/jerman/de/jerman/beispiel/Hauptprogramm.jerman")}.value
//watchSources <+= baseDirectory { _ / "demo" / "examples.txt" }

//watchSources <++= baseDirectory map { path => ((path / "src/main/jerman") ** "*.jerman").get }

//watchSources in Compile += (sourceDirectory in Compile).value / "de"/"jerman"/"beispiel"/"Hauptprogramm.jerman"


