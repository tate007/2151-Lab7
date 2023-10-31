default: compile

compile:
	javac cpsc2150/listDec/*.java

run:
	java cpsc2150.listDec.ShuffleApp

clean:
	rm cpsc2150/listDec/*.class
